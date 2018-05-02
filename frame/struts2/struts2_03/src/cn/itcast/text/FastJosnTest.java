package cn.itcast.text;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeFilter;

import cn.itcast.domain.User;

public class FastJosnTest {
	@Test
	public void text1() {
		User u = new User();
		u.setAge(18);
		u.setBirthday(new Date());
		u.setId(1);
		u.setName("xcm");
		
		SerializeFilter s = new PropertyFilter() {
			
			@Override
			public boolean apply(Object arg0, String arg1, Object arg2) {
				//System.out.println(arg0);//要转换的对象
				//System.out.println(arg1);//属性名称
				//System.out.println(arg2);//属性值
				if(arg1.equals("id")) {
					return false;//不生成在JSON串中
				}
				return true;//生成在JSON串中
			}
		};
		
		String j = JSONObject.toJSONString(u,s);
		System.out.println(j);
	}
	
	@Test
	public void text2() {
		User u = new User();
		u.setAge(18);
		u.setBirthday(new Date());
		u.setId(1);
		u.setName("xcm");
		
		User u1 = new User();
		u1.setAge(23);
		u1.setBirthday(new Date());
		u1.setId(1);
		u1.setName("xgd");
		
		List<User> list = new ArrayList<User>();
		list.add(u);
		list.add(u1);
		
		String js = JSONArray.toJSONString(list);
		System.out.println(js);
 		
	}
}

























