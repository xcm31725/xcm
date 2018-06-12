package cn.itcast.main.bos.service.transit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.itcast.bos.domain.transit.TransitInfo;

public interface TransitInfoService {

	public void createTransit(String wayBillIds);

	public Page<TransitInfo> findPageData(Pageable pageable);

}
