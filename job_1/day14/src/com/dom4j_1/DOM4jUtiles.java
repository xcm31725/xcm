package com.dom4j_1;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DOM4jUtiles {
	private DOM4jUtiles() {}
	
	public static Document getDocument() throws Exception{
		SAXReader reader = new SAXReader();
        Document document = reader.read("src/com/dom4j_1/city.xml");
        return document;
	}
	
	public static void writer(Document document) throws Exception{
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileOutputStream("src/com/dom4j_1/city.xml"), format );
        writer.write( document );
	}
}
