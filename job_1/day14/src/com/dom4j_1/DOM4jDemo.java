package com.dom4j_1;

import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class DOM4jDemo {

	public static void main(String[] args) throws Exception {
		//method1();
		//method2();
		//method3();
		//method6();
		//method4();
		//method5();
		//method7();
		//8��������ԣ�State�� GDP="99999��"
		Document document = DOM4jUtiles.getDocument();
		Element rootElement = document.getRootElement();
		rootElement.addAttribute("GDP", "99999��");
		DOM4jUtiles.writer(document);
		
		
		
	}

	private static void method7() throws Exception {
		//7������XML�ļ�����:��ӡState��Name
		Document document = DOM4jUtiles.getDocument();
		Element rootElement = document.getRootElement();
		//String attributeValue(String name)������ָ�����������ƻ�ȡ���Ӧ��ֵ
		String attributeValue = rootElement.attributeValue("Name");
		System.out.println(attributeValue);
	}

	private static void method5() throws Exception {
		//5����ָ��Ԫ�ؽڵ�������ͬ��Ԫ�ؽڵ�:������ǰ�棬���һ��<City>����Ͽ</City>
		//static Element	createElement(String name) 
		//����City��ǩ
		Element createElement = DocumentHelper.createElement("City");
		//����ǩ����ı�
		createElement.setText("����Ͽ");
		
		Document document = DOM4jUtiles.getDocument();
		Element rootElement = document.getRootElement();
		List<Element> es = rootElement.elements();
		//��1����������ı�
		es.add(1, createElement);
		DOM4jUtiles.writer(document);
	}

	private static void method4() throws Exception {
		//4����ָ��Ԫ�ؽڵ���������Ԫ�ؽ�:���һ���³���<City>����</City>
		Document document = DOM4jUtiles.getDocument();
		Element rootElement = document.getRootElement();
		//����City��ǩ
		Element element = rootElement.addElement("City");
		//����ı�
		element.setText("����");
		DOM4jUtiles.writer(document);
	}

	private static void method6() throws Exception {
		//6��ɾ��ָ��Ԫ�ؽڵ�:ɾ��Ԫ�ؿ���
		Document document = DOM4jUtiles.getDocument();
		//��ȡ��Ԫ��
		Element rootElement = document.getRootElement();
		//���ݸ�Ԫ�ػ�ȡ���е���Ԫ��
		List<Element> es = rootElement.elements();
		//��ȡ����1��Ԫ��
		Element element = es.get(1);
		//�Ҹ����е�ɾ��
		Element parent = element.getParent();
		//ͨ�������е�remove()����ɾ��1������Ԫ��
		parent.remove(element);
		DOM4jUtiles.writer(document);
	}

	private static void method3() throws Exception {
		//3���޸�ĳ��Ԫ�ؽڵ����������:����-->����
		Document document = DOM4jUtiles.getDocument();
		//��ȡ��Ԫ��
		Element rootElement = document.getRootElement();
		//���ݸ���Ԫ�ػ�ȡ�ӽڵ�
		List<Element> es = rootElement.elements();
		//��ȡ����Ϊ3��Ԫ��
		Element element = es.get(3);
		//ͨ��3�����޸�Ԫ�ص�ֵ
		element.setText("����");
		DOM4jUtiles.writer(document);
	}

	private static void method2() throws Exception {
		//2����������Ԫ�ؽڵ�:��ӡ���ǵ�Ԫ�����ơ�
		Document document = DOM4jUtiles.getDocument();
		//��ȡ���ڵ�
		Element rootElement = document.getRootElement();
		textName(rootElement);
	}
	
	public static void textName(Element rootElement) {
		//��ӡԪ�ص����֣�Ҳ�ǵݹ�ĳ���
		System.out.println(rootElement.getName());
		
		List<Element> elements = rootElement.elements();//����һ���ж��Ǽ���Ϊ�ռ���ʱ
		for (Element e : elements) {
			textName(e);
		}
	}

	private static void method1() throws Exception {
		//1���õ�ĳ������Ľڵ�����:��ӡ"֣��"
		Document document = DOM4jUtiles.getDocument();
		//��ȡ���ڵ�
		Element rootElement = document.getRootElement();
		//���ݸ��ڵ��ȡ���е��ӽڵ�
		List<Element> es = rootElement.elements();
		//��ȡ��һ���ӽڵ�
		Element element = es.get(0);
		//���ݵ�һ���ڵ�õ��ڵ������
		Element element2 = element.element("Name");
		//�������ֻ�ȡ�ı�
		String text = element2.getText();
		System.out.println(text);
	}

}
