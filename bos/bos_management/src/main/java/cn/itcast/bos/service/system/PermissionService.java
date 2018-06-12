package cn.itcast.bos.service.system;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.itcast.bos.domain.system.Permission;
import cn.itcast.bos.domain.system.User;

public interface PermissionService {

	public List<Permission> findByUser(User user);

	//public Page<Permission> findPageData(Pageable pageable);

	public List<Permission> findAll();

	public void save(Permission model);

}
