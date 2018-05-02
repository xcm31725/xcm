package cn.itcast.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.itcast.dao.IUServiceDao;

//@Component("userService")
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Value("XCM")
	private String name;
	
	//@Autowired     //默认是按照类型进行转换
	//@Qualifier("userDao")
	@Resource(name="userDao")
	private IUServiceDao userDao;
	
	@Override
	public void add() {
		//System.out.println("UserServiceImpl add......");
		userDao.add();
	}

}
