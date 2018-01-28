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
		//8、添加属性：State： GDP="99999亿"
		Document document = DOM4jUtiles.getDocument();
		Element rootElement = document.getRootElement();
		rootElement.addAttribute("GDP", "99999亿");
		DOM4jUtiles.writer(document);
		
		
		
	}

	private static void method7() throws Exception {
		//7、操作XML文件属性:打印State的Name
		Document document = DOM4jUtiles.getDocument();
		Element rootElement = document.getRootElement();
		//String attributeValue(String name)：根据指定的属性名称获取其对应的值
		String attributeValue = rootElement.attributeValue("Name");
		System.out.println(attributeValue);
	}

	private static void method5() throws Exception {
		//5、向指定元素节点上增加同级元素节点:在洛阳前面，添加一个<City>三门峡</City>
		//static Element	createElement(String name) 
		//创建City标签
		Element createElement = DocumentHelper.createElement("City");
		//给标签添加文本
		createElement.setText("三门峡");
		
		Document document = DOM4jUtiles.getDocument();
		Element rootElement = document.getRootElement();
		List<Element> es = rootElement.elements();
		//给1索引处添加文本
		es.add(1, createElement);
		DOM4jUtiles.writer(document);
	}

	private static void method4() throws Exception {
		//4、向指定元素节点中增加子元素节:添加一个新城市<City>南阳</City>
		Document document = DOM4jUtiles.getDocument();
		Element rootElement = document.getRootElement();
		//创建City标签
		Element element = rootElement.addElement("City");
		//添加文本
		element.setText("南阳");
		DOM4jUtiles.writer(document);
	}

	private static void method6() throws Exception {
		//6、删除指定元素节点:删除元素开封
		Document document = DOM4jUtiles.getDocument();
		//获取根元素
		Element rootElement = document.getRootElement();
		//根据根元素获取所有的子元素
		List<Element> es = rootElement.elements();
		//获取索引1的元素
		Element element = es.get(1);
		//找父类中的删除
		Element parent = element.getParent();
		//通过父类中的remove()方法删除1索引的元素
		parent.remove(element);
		DOM4jUtiles.writer(document);
	}

	private static void method3() throws Exception {
		//3、修改某个元素节点的主体内容:信阳-->安阳
		Document document = DOM4jUtiles.getDocument();
		//获取根元素
		Element rootElement = document.getRootElement();
		//根据根根元素获取子节点
		List<Element> es = rootElement.elements();
		//获取索引为3的元素
		Element element = es.get(3);
		//通过3索引修改元素的值
		element.setText("安阳");
		DOM4jUtiles.writer(document);
	}

	private static void method2() throws Exception {
		//2、遍历所有元素节点:打印他们的元素名称。
		Document document = DOM4jUtiles.getDocument();
		//获取根节点
		Element rootElement = document.getRootElement();
		textName(rootElement);
	}
	
	public static void textName(Element rootElement) {
		//打印元素的名字，也是递归的出口
		System.out.println(rootElement.getName());
		
		List<Element> elements = rootElement.elements();//这有一个判断是集合为空集合时
		for (Element e : elements) {
			textName(e);
		}
	}

	private static void method1() throws Exception {
		//1、得到某个具体的节点内容:打印"郑州"
		Document document = DOM4jUtiles.getDocument();
		//获取根节点
		Element rootElement = document.getRootElement();
		//根据根节点获取所有的子节点
		List<Element> es = rootElement.elements();
		//获取第一个子节点
		Element element = es.get(0);
		//根据第一个节点得到节点的名字
		Element element2 = element.element("Name");
		//根据名字获取文本
		String text = element2.getText();
		System.out.println(text);
	}

}
