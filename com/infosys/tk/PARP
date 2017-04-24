package com.javaweb.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author shannan.hu
 *这是一个解析一般xml的工具类
 */
public class ParseBook {
	//1.获取xml文件
	//2.获取根元素
	//3.获取子元素
	//3.1遍历子元素
	public static void main(String[] args) {
		File file = new File("book.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(file);
			Element root = document.getDocumentElement();
			System.out.println(root.getNodeName());
			NodeList list = root.getElementsByTagName("book");
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				NodeList node2 = node.getChildNodes();
				for (int j = 0; j < node2.getLength(); j++) {
					Node node3 = node2.item(j);
					System.out.println(node3.getNodeName());
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
