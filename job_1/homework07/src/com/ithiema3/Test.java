package com.ithiema3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 3����һ���ַ���,������: String str="heima shi wo jia, Da Jia Yao Ai Hu Ta!";
		��д����,ͳ��ÿ���ַ����ֵĴ���, 
		����Ľ������: D(1), (9),!(1),e(1),A(1)....
		
		��ʾ:
			1,ͳ���ַ����ֵĴ���,������Ҫ�洢�ַ��ʹ���,����ѡ�����˫�м���
				�ж�key�洢����ʲô�������͵Ķ���,value�洢����ʲô�������͵Ķ���
				
			2,����:
				(1)�����ַ���,��ȡÿһ���ַ�
				(2)�жϼ������Ƿ�������ַ�
					��,���ݸ��ַ���ȡ��Ӧ��valueֵ,��valueֵ��1����뵽˫�м�����
					��,��˫�м������Ԫ��,keyΪ���ַ�,valueΪ1
				(3)����˫�м���,��ָ����ʽ���
 * */
public class Test {

	public static void main(String[] args) {
		String str="heima shi wo jia, Da Jia Yao Ai Hu Ta!";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		char[] chs = str.toCharArray();
		/*for (char c : chs) {
			System.out.println(c);
		}*/
		
		for (Character c : chs) {
			if(map.containsKey(c)){
				int value = map.get(c);
				value++;
				map.put(c, value);
				//map.put(c, map.get(chs)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		/*for(int i=0; i<chs.length; i++){
			char ch = chs[i];
			Integer count = map.get(ch);
			if(count == null){
				count = 0;
			}
			count++;
			map.put(ch, count);
		}*/
		
		Set<Map.Entry<Character,Integer>> entrys = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entrys) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print(key+"("+value+"),");
		}
	}

}
