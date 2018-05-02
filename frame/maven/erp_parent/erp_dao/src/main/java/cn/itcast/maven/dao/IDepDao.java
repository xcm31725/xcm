package cn.itcast.maven.dao;

import java.util.List;

import cn.itcast.maven.domain.Dep;

public interface IDepDao {
	List<Dep> getList();
}
