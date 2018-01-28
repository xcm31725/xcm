package com.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * 
 * @ClassName: DOM4JDemo  
 * @Description: TODO
 * 
 * * Dom4J�ĳ��÷�����
 * 		Document
 * 			 Element getRootElement() :��ȡ��Ԫ�ض��󣨸���ǩ��
 * 		Element
 * 			 List elements() ����ȡ���е���Ԫ��
 * 			 List elements(String name)������ָ����Ԫ����������ȡ��Ӧ�����е���Ԫ��
 * 			 Element element(String name)������ָ����Ԫ����������ȡ��Ԫ�ض���,���Ԫ�������ظ������ȡ��һ��Ԫ�� 
 * 			 String	elementText(String name) ������ָ������Ԫ�����ƣ�����ȡ��Ԫ���е��ı�
 * 			 String	getText() ����ȡ��ǰԪ�ض�����ı�
 * 			 void setText(String text)�����õ�ǰԪ�ض�����ı�
 * 			 String	attributeValue(String name)������ָ�����������ƻ�ȡ���Ӧ��ֵ
 * 			 public Element addAttribute(String name,String value)������ָ�����������ƺ�ֵ������ӻ����޸�
 * 			 addElement
 * 		DocumentHelper
 * 			static Element	createElement(String name) 
 * 
 * @author sudong
 * @date 2018��1��27�� ����3:47:20  
 *
 */
public class DOM4JDemo {

	public static void main(String[] args) throws Exception {
		//method();
		//method2();
		//method3();
		//method6();
		//method4();
		//method5();
		//method7();
		//8��������ԣ�State�� GDP="99999��"
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		Element string = rootElement.addAttribute("GDP", "99999��");
		DOM4JUtils.write(document);
		
		
		
	}

	private static void method7() throws Exception {
		//7������XML�ļ�����:��ӡState��Name
		//String attributeValue(String name)������ָ�����������ƻ�ȡ���Ӧ��ֵ
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		String attributeValue = rootElement.attributeValue("Name");
		System.out.println(attributeValue);
	}

	private static void method5() throws Exception {
		//5����ָ��Ԫ�ؽڵ�������ͬ��Ԫ�ؽڵ�:������ǰ�棬���һ��<City>����Ͽ</City>
		Element createElement = DocumentHelper.createElement("City");
		createElement.setText("����Ͽ");
		
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		List<Element> es = rootElement.elements();
		es.add(1,createElement);
		DOM4JUtils.write(document);
	}

	private static void method4() throws Exception {
		//4����ָ��Ԫ�ؽڵ���������Ԫ�ؽ�:���һ���³���<City>����</City>
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		Element addElement = rootElement.addElement("City");
		addElement.setText("����");
		DOM4JUtils.write(document);
	}

	private static void method2() throws Exception {
		//2����������Ԫ�ؽڵ�:��ӡ���ǵ�Ԫ�����ơ�
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		text(rootElement);
	}
	
	public static void text(Element rootElement) {
		System.out.println(rootElement.getName());
		
		List<Element> els = rootElement.elements();
		for (Element element : els) {
			text(element);
		}
	}
	
	private static void method6() throws Exception {
		//6��ɾ��ָ��Ԫ�ؽڵ�:ɾ��Ԫ�ؿ���	
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		List<Element> el = rootElement.elements();
		Element element = el.get(1);
		Element parent = element.getParent();
		parent.remove(element);
		DOM4JUtils.write(document);
	}

	private static void method3() throws Exception {
		//3���޸�ĳ��Ԫ�ؽڵ����������:����-->����
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		List<Element> el = rootElement.elements();
		Element element = el.get(3);
		element.setText("����");
		DOM4JUtils.write(document);
	}

	private static void method() throws Exception {
		//1���õ�ĳ������Ľڵ�����:��ӡ"֣��"
		Document document = DOM4JUtils.doument();
		//System.out.println(document);
		//��ȡ��Ԫ�ض���
		Element rootElement = document.getRootElement();
		//���ݸ���ȡ���е�Ԫ��
		List<Element> list = rootElement.elements();
		
		Element element = list.get(0);
		/*Element element2 = element.element("name");
		String text = element2.getText();*/
		String text = element.elementText("Name");
		System.out.println(text);
	}

}
