package cn.itcast.main.bos.service.take_delivery;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.itcast.bos.domain.take_delivery.WayBill;

public interface WayBillService {
	// 保存运单
	public void save(WayBill model);
	// 无条件 分页查询
	public Page<WayBill> findPageData(WayBill wayBill, Pageable pagebale);
	// 根据运单号查询
	public WayBill findByWayBillNum(String wayBillNum);

	public void syncIndex();
	public List<WayBill> findWayBills(WayBill wayBill);
}
