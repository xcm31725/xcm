package cn.itcast.maven.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.maven.dao.IDepDao;
import cn.itcast.maven.domain.Dep;

public class DepDaoImpl extends HibernateDaoSupport implements  IDepDao{
	
	@Override
	public List<Dep> getList() {
		
		return (List<Dep>) this.getHibernateTemplate().find("from Dep");
	}

}
