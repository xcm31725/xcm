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
 * * Dom4J的常用方法：
 * 		Document
 * 			 Element getRootElement() :获取根元素对象（根标签）
 * 		Element
 * 			 List elements() ：获取所有的子元素
 * 			 List elements(String name)：根据指定的元素名称来获取相应的所有的子元素
 * 			 Element element(String name)：根据指定的元素名称来获取子元素对象,如果元素名称重复，则获取第一个元素 
 * 			 String	elementText(String name) ：根据指定的子元素名称，来获取子元素中的文本
 * 			 String	getText() ：获取当前元素对象的文本
 * 			 void setText(String text)：设置当前元素对象的文本
 * 			 String	attributeValue(String name)：根据指定的属性名称获取其对应的值
 * 			 public Element addAttribute(String name,String value)：根据指定的属性名称和值进行添加或者修改
 * 			 addElement
 * 		DocumentHelper
 * 			static Element	createElement(String name) 
 * 
 * @author sudong
 * @date 2018年1月27日 下午3:47:20  
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
		//8、添加属性：State： GDP="99999亿"
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		Element string = rootElement.addAttribute("GDP", "99999亿");
		DOM4JUtils.write(document);
		
		
		
	}

	private static void method7() throws Exception {
		//7、操作XML文件属性:打印State的Name
		//String attributeValue(String name)：根据指定的属性名称获取其对应的值
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		String attributeValue = rootElement.attributeValue("Name");
		System.out.println(attributeValue);
	}

	private static void method5() throws Exception {
		//5、向指定元素节点上增加同级元素节点:在洛阳前面，添加一个<City>三门峡</City>
		Element createElement = DocumentHelper.createElement("City");
		createElement.setText("三门峡");
		
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		List<Element> es = rootElement.elements();
		es.add(1,createElement);
		DOM4JUtils.write(document);
	}

	private static void method4() throws Exception {
		//4、向指定元素节点中增加子元素节:添加一个新城市<City>南阳</City>
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		Element addElement = rootElement.addElement("City");
		addElement.setText("南阳");
		DOM4JUtils.write(document);
	}

	private static void method2() throws Exception {
		//2、遍历所有元素节点:打印他们的元素名称。
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
		//6、删除指定元素节点:删除元素开封	
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		List<Element> el = rootElement.elements();
		Element element = el.get(1);
		Element parent = element.getParent();
		parent.remove(element);
		DOM4JUtils.write(document);
	}

	private static void method3() throws Exception {
		//3、修改某个元素节点的主体内容:信阳-->安阳
		Document document = DOM4JUtils.doument();
		Element rootElement = document.getRootElement();
		List<Element> el = rootElement.elements();
		Element element = el.get(3);
		element.setText("安阳");
		DOM4JUtils.write(document);
	}

	private static void method() throws Exception {
		//1、得到某个具体的节点内容:打印"郑州"
		Document document = DOM4JUtils.doument();
		//System.out.println(document);
		//获取根元素对象
		Element rootElement = document.getRootElement();
		//根据根获取所有的元素
		List<Element> list = rootElement.elements();
		
		Element element = list.get(0);
		/*Element element2 = element.element("name");
		String text = element2.getText();*/
		String text = element.elementText("Name");
		System.out.println(text);
	}

}
