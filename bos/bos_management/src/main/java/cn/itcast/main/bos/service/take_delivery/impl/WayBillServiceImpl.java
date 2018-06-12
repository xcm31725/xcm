package cn.itcast.main.bos.service.take_delivery.impl;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.index.query.QueryStringQueryBuilder.Operator;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.index.query.WildcardQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.bos.dao.take_delivery.WayBillRepository;
import cn.itcast.bos.domain.take_delivery.WayBill;
import cn.itcast.bos.index.WayBillIndexRepository;
import cn.itcast.main.bos.service.take_delivery.WayBillService;

@Service
@Transactional
public class WayBillServiceImpl implements WayBillService {

	@Autowired
	private WayBillRepository wayBillRepository;
	
	@Autowired
	private WayBillIndexRepository wayBillIndexRepository;
	
	@Override
	public void save(WayBill wayBill) {
		// 判断运单号是否存在
		WayBill persistWayBill = wayBillRepository.findByWayBillNum(wayBill
				.getWayBillNum());
		if (persistWayBill == null || persistWayBill.getId() == null) {
			// 运单不存在
			wayBill.setSignStatus(1); // 待发货
			wayBillRepository.save(wayBill);
			//保存索引
			wayBillIndexRepository.save(wayBill);
		} else {
			// 运单存在
			try {
				//判断运单状态是否为待发货
				if(persistWayBill.getSignStatus() == 1) {
					Integer id = persistWayBill.getId();
					BeanUtils.copyProperties(persistWayBill, wayBill);
					persistWayBill.setId(id);
					persistWayBill.setSignStatus(1); // 待发货
					//保存索引
					wayBillIndexRepository.save(wayBill);	
				}else {
					throw new RuntimeException("运单已发货，无法修改保存！！！");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
		}

	}

	@Override
	public Page<WayBill> findPageData(WayBill wayBill, Pageable pagebale) {
		//判断WayBill  中条件是否存在
		if(StringUtils.isBlank(wayBill.getWayBillNum())
			&& StringUtils.isBlank(wayBill.getSendAddress())
			&& StringUtils.isBlank(wayBill.getRecAddress())
			&& StringUtils.isBlank(wayBill.getSendProNum())
			&& (wayBill.getSignStatus() == null || wayBill.getSignStatus() == 0)) {
			//无条件查新
			return wayBillRepository.findAll(pagebale);
		} else {
			//查询条件
			//must  条件必须成立
			//must not 条件必须不成立
			//should 条件可以成立 or
			BoolQueryBuilder query = new BoolQueryBuilder(); //布尔查询，多条件组合查询
 			//向组合查询对象添加条件
			if(StringUtils.isNotBlank(wayBill.getWayBillNum())) {
				//运单号查询
				QueryBuilder temQuery = new TermQueryBuilder("wayBillNum", wayBill.getWayBillNum());
				query.must(temQuery);
			}
			if(StringUtils.isNotBlank(wayBill.getSendAddress())) {
				//发货地 模糊查询
				//情况一：输入“一个字”是查询词条的一部分，使用模糊匹配词条查询
				QueryBuilder wildcardQuery = new WildcardQueryBuilder("sendAddress", "*" + wayBill.getSendAddress() + "*");
				
				//情况二：输入“多个词”是多个词条组合，并进行分词后每个词条匹配查询
				QueryBuilder queryStringQueryBuilder = new QueryStringQueryBuilder(wayBill.getSendAddress()).field("sendAddress").defaultOperator(Operator.AND);
				
				//两种情况去or关系
				BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder(); 
				boolQueryBuilder.should(wildcardQuery);
				boolQueryBuilder.should(queryStringQueryBuilder);
				
				query.must(wildcardQuery);
			}
			if(StringUtils.isNotBlank(wayBill.getRecAddress())) {
				//收获地 迷糊查询
				QueryBuilder wildcardQuery = new WildcardQueryBuilder("recAddress", "*" + wayBill.getRecAddress() + "*");
				query.must(wildcardQuery);
			}
			if(StringUtils.isNotBlank(wayBill.getSendProNum())) {
				//速运类型 等值查询
				QueryBuilder temQuery = new TermQueryBuilder("sendProNum", wayBill.getSendProNum());
				query.must(temQuery);
			}
			if(wayBill.getSignStatus() != null && wayBill.getSignStatus() != 0) {
				//签收状态查询
				QueryBuilder temQuery = new TermQueryBuilder("signStatus", wayBill.getSignStatus());
				query.must(temQuery);
			}
			
			SearchQuery searchQuery = new NativeSearchQuery(query);
			searchQuery.setPageable(pagebale);
			//有条件查询，查询索引库
			return wayBillIndexRepository.search(searchQuery);
		}
		
		
	}

	@Override
	public WayBill findByWayBillNum(String wayBillNum) {
		return wayBillRepository.findByWayBillNum(wayBillNum);
	}

	@Override
	public void syncIndex() {
		//查询数据库
		List<WayBill> wayBills = wayBillRepository.findAll();
		//同步索引库
		wayBillIndexRepository.save(wayBills);
	}

	@Override
	public List<WayBill> findWayBills(WayBill wayBill) {
		//判断WayBill  中条件是否存在
				if(StringUtils.isBlank(wayBill.getWayBillNum())
					&& StringUtils.isBlank(wayBill.getSendAddress())
					&& StringUtils.isBlank(wayBill.getRecAddress())
					&& StringUtils.isBlank(wayBill.getSendProNum())
					&& (wayBill.getSignStatus() == null || wayBill.getSignStatus() == 0)) {
					//无条件查新
					return wayBillRepository.findAll();
				} else {
					//查询条件
					//must  条件必须成立
					//must not 条件必须不成立
					//should 条件可以成立 or
					BoolQueryBuilder query = new BoolQueryBuilder(); //布尔查询，多条件组合查询
		 			//向组合查询对象添加条件
					if(StringUtils.isNotBlank(wayBill.getWayBillNum())) {
						//运单号查询
						QueryBuilder temQuery = new TermQueryBuilder("wayBillNum", wayBill.getWayBillNum());
						query.must(temQuery);
					}
					if(StringUtils.isNotBlank(wayBill.getSendAddress())) {
						//发货地 模糊查询
						//情况一：输入“一个字”是查询词条的一部分，使用模糊匹配词条查询
						QueryBuilder wildcardQuery = new WildcardQueryBuilder("sendAddress", "*" + wayBill.getSendAddress() + "*");
						
						//情况二：输入“多个词”是多个词条组合，并进行分词后每个词条匹配查询
						QueryBuilder queryStringQueryBuilder = new QueryStringQueryBuilder(wayBill.getSendAddress()).field("sendAddress").defaultOperator(Operator.AND);
						
						//两种情况去or关系
						BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder(); 
						boolQueryBuilder.should(wildcardQuery);
						boolQueryBuilder.should(queryStringQueryBuilder);
						
						query.must(wildcardQuery);
					}
					if(StringUtils.isNotBlank(wayBill.getRecAddress())) {
						//收获地 迷糊查询
						QueryBuilder wildcardQuery = new WildcardQueryBuilder("recAddress", "*" + wayBill.getRecAddress() + "*");
						query.must(wildcardQuery);
					}
					if(StringUtils.isNotBlank(wayBill.getSendProNum())) {
						//速运类型 等值查询
						QueryBuilder temQuery = new TermQueryBuilder("sendProNum", wayBill.getSendProNum());
						query.must(temQuery);
					}
					if(wayBill.getSignStatus() != null && wayBill.getSignStatus() != 0) {
						//签收状态查询
						QueryBuilder temQuery = new TermQueryBuilder("signStatus", wayBill.getSignStatus());
						query.must(temQuery);
					}
					
					SearchQuery searchQuery = new NativeSearchQuery(query);
					Pageable pageable = new PageRequest(0, 10000);
					searchQuery.setPageable(pageable);
					//有条件查询，查询索引库
					return wayBillIndexRepository.search(searchQuery).getContent();
				}
	}

}






























