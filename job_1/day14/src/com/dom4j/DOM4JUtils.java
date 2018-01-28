package com.dom4j;

import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DOM4JUtils {
	private DOM4JUtils() {}
	
	public static Document doument() throws Exception{
		SAXReader reader = new SAXReader();
        Document document = reader.read("src/com/dom4j/city.xml");
		return document;
	}
	
	public static void write(Document document) throws Exception {
		OutputFormat format = OutputFormat.createPrettyPrint();
		
		XMLWriter writer = new XMLWriter( new FileOutputStream("src/com/dom4j/city.xml"), format );
        writer.write( document );
	}
}
