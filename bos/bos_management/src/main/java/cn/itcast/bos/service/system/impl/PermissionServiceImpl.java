package cn.itcast.bos.service.system.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.bos.dao.system.PermissionRepository;
import cn.itcast.bos.domain.system.Permission;
import cn.itcast.bos.domain.system.User;
import cn.itcast.bos.service.system.PermissionService;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionRepository permissionRepository;
	
	@Override
	public List<Permission> findByUser(User user) {
		if(user.getUsername().equals("admin")) {
			//返回所有权限
			return permissionRepository.findAll();
		} else {
			return permissionRepository.findByUser(user.getId());
		}
		
	}

	@Override
	public List<Permission> findAll() {
		return permissionRepository.findAll();
	}

	@Override
	public void save(Permission permission) {
		permissionRepository.save(permission);
	}

//	@Override
//	public Page<Permission> findPageData(Pageable pageable) {
//		return permissionRepository.findAll(pageable);
//	}

}
