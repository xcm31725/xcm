package com.properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * @ClassName: PropertiesDemo1  
 * @Description: TODO 
 * �ص㣺
 * 		Hashable�����࣬Map�����еķ���������ʹ��
 * 		������û�з��͡���ֵ����String
 * 		����һ���־û������Լ�����ֵ���Դ洢�������У�Ҳ���Դ洢�ڳ־û����豸��Ӳ�̡�U�̡����̣��ϡ���ֵ����ԴҲ�����ǳ־û����豸
 * 		�к����������ϵķ���
 * 
 * Properties����ʾ��һ���־õ����Լ��������б���ÿ���������Ӧֵ����һ���ַ���
 * 
 * ���췽����
 * 		Properties() 
 * @author sudong
 * @date 2018��1��22�� ����11:43:26  
 *
 */
public class PropertiesDemo1 {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		p.put("xcm", "17");
		p.put("xgd", "22");
		p.put("zc", "18");
		p.put("sd", "23");
		
		Set<Object> keys = p.keySet();
		for (Object key : keys) {
			Object obj = p.get(key);
			
			System.out.println(key+"="+obj);
		}
		
		System.out.println("--------------");
		Set<Map.Entry<Object, Object>> entrys = p.entrySet();
		for (Map.Entry<Object, Object> entry : entrys) {
			Object value = entry.getValue();
			Object key = entry.getKey();
			
			System.out.println(key+"="+value);
		}
	}

}
