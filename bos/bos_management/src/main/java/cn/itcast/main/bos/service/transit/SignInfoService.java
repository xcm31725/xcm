package cn.itcast.main.bos.service.transit;

import cn.itcast.bos.domain.transit.SignInfo;

public interface SignInfoService {

	public void save(String transitInfoId, SignInfo signInfo);

}
