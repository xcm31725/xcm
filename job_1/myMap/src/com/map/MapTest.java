package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * itheima�������࣬��ҵ��
 * 		�����ࣺ01 xcm;02 xgd
 * 		��ҵ�ࣺ01 zc; 02 sd
 * ������
 * 		������Ҫ�а༶��ѧ�����༶��ѧ��֮����һ�ֶ�Ӧ��ϵ��ӳ���ϵ��
 * 		�����ж�Ӧ��ϵ���������ǿ���ʹ��Map�������洢����������Դ
 * 		����ʹ�ð༶��Ϊkey��ѧ����Ϊvalue
 * 		Map��keyֻ�ܶ�Ӧһ��value����������һ���༶�ж��ѧ����
 * 		���ǿ��Դ���һ���������ѧ���ļ��ϣ��ð༶��������ϲ���һһ��Ӧ�Ĺ�ϵ
 * 		ѧ����Ϣ��Ϊѧ�ź���������Ҳ��һ�ֶ�Ӧ��ϵ����������ʹ��Map����������ѧ����Ϣ
 * 
 * ѧУMap
 * 		������	������ѧ��Map
 * 		��ҵ��	��ҵ��ѧ��Map
 * MapǶ��Map
 * 
 * */
public class MapTest {

	public static void main(String[] args) {
		//����ѧУMap
		Map<String,Map<String,String>> itheima = new HashMap<String,Map<String,String>>();
		
		//����������Map
		Map<String,String> base = new HashMap<String,String>();
		base.put("01", "xcm");
		base.put("02", "xgd");
		
		//������ҵ��Map
		Map<String,String> job = new HashMap<String,String>();
		job.put("01", "zc");
		job.put("02", "sd");
		
		//�Ѱ�����ѧ����Map��ӵ�ѧУMap��
		itheima.put("������", base);
		itheima.put("��ҵ��", job);
		
		//����ѧУMap���鿴�ж��ٸ��༶�Ͷ�Ӧ��ѧ��
		//�Ȼ�ȡ���еİ༶
		Set<String> keys = itheima.keySet();
		for (String key : keys) {
			//����༶����
			System.out.println("�༶��Ϣ��"+key);
			
			//���ݰ༶��ȡ��Ӧ������ѧ��
			Map<String, String> stu = itheima.get(key);
			
			//��ȡ����ѧ����ѧ��
			Set<String> nums = stu.keySet();
			for (String num : nums) {
				//����ѧ�Ż�ȡѧ��������
				String name = stu.get(num);
				System.out.println("ѧ�ţ�"+num+"��"+"������"+name);
			}
		}
	}

}










