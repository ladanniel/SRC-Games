package xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Demo3 {
	public static void main(String[] args) throws IOException  {
		/*
		 * 读取music.xml中全部的名字
		 */
		FileInputStream fis =null;
		Document doc = null;
		try {
			fis = new FileInputStream("music.xml");
			SAXReader reader = new SAXReader();
			doc = reader.read(fis);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (DocumentException e) {
			e.printStackTrace();
		}
		
		
		Element root = doc.getRootElement();
		List list = root.elements();
		System.out.println(root.elements());
		for(int i=0;i<list.size();i++){
			
			Element e = (Element)list.get(i);
			
			String id = e.attributeValue("id");
			
			Element n = e.element("name");
			String str = n.getText();
			System.out.println(str+id);
		}
	}
}
