package cn.itcast.main.bos.service.transit;

import cn.itcast.bos.domain.transit.InOutStorageInfo;

public interface InOutStorageInfoService {

	public void save(String transitInfoId, InOutStorageInfo inOutStorageInfo);

}
