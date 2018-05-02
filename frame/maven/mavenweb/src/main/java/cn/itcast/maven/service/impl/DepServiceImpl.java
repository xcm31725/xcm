package cn.itcast.maven.service.impl;

import java.util.List;

import cn.itcast.maven.dao.IDepDao;
import cn.itcast.maven.domain.Dep;
import cn.itcast.maven.service.IDepService;

public class DepServiceImpl  implements IDepService {

	private IDepDao depDao;
	
	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
	}

	@Override
	public List<Dep> getList() {
		
		return depDao.getList();
	}
	
}
