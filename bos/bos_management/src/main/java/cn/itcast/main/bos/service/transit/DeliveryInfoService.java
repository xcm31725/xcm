package cn.itcast.main.bos.service.transit;

import cn.itcast.bos.domain.transit.DeliveryInfo;

public interface DeliveryInfoService {

	public void save(String transitInfoId, DeliveryInfo deliveryInfo);

}
