package cn.itcast.main.bos.service.take_delivery;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.opensymphony.xwork2.validator.annotations.CustomValidator;

import cn.itcast.bos.domain.page.PageBean;
import cn.itcast.bos.domain.take_delivery.Promotion;

public interface PromotionService {
	// 保存宣传任务
	public void save(Promotion model);

	//分页查询
	public Page<Promotion> findPageData(Pageable pageable);

	//根据page和rows返回分页数据
	@Path("/pageQuery")
	@GET
	@Produces({"application/xml","application/json"})
	public PageBean<Promotion> findPageData(@QueryParam("page") int page, @QueryParam("rows") int rows);
	
	// 根据id 查询
	@Path("/promotion/{id}")
	@GET
	@Produces({"application/xml","application/json"})
	public Promotion findById(@PathParam("id") Integer id);
	
	// 设置活动过期
	public void updateStatus(Date date);
}
