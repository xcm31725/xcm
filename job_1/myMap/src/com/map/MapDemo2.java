package com.map;
/*
 * Map�ĵ�һ�ֱ�����ʽ��
 * 		�����ټ����е��ɷ�
 * 		�������е��ɷ�
 * 		��ȡÿһ���ɷ�
 * 		��ÿһ���ɷ�ȥ�����Լ���ϱ��
 * */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		//����Map����
		Map<String,String> map = new HashMap<String,String>();
		
		//���ӳ���ϵ
		map.put("xgd", "xcm");
		map.put("sd", "zc");
		map.put("lm", "xn");
		
		//����Map����
		//�����ټ����е��ɷ�
		Set<String> keys = map.keySet();
		//�������е��ɷ�
		for (String key : keys) {
			//��ÿһ���ɷ�ȥ�����Լ���ϱ��
			String value = map.get(key);
			System.out.println("�ɷ�:"+key+"\t"+"����:"+value);
		}
	}

}
