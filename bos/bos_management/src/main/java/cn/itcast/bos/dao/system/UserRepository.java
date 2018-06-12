package cn.itcast.bos.dao.system;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cn.itcast.bos.domain.system.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);

}
