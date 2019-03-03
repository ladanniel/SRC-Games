package xml;
import org.dom4j.io.SAXReader;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


public class Demo1 {
	public static void main(String[] args) throws DocumentException, IOException {
		/*
		 * 利用dom4j读取XML文件
		 */
		FileInputStream in = new FileInputStream("music.xml");
		SAXReader reader = new SAXReader();
		//如果XML文件格式错误，则抛出异常
		Document doc=reader.read(in);
		in.close();
		//输入doc内容,doc的内容与music.xml的内容相同
		System.out.println(doc.asXML());
		
		
		
		
		/*
		 * 查找doc中的根元素，就是music.xml的根元素
		 * Root根 Element元素
		 */
		Element root = doc.getRootElement();
		
		
		//Element类型的对象，就代表XML文件中的一个元素
		//输出root的信息，则会输入根元素的全部信息
		System.out.println(root.asXML());
		
		//查找根元素的第一个子元素，参数是子元素的名字
		Element music = root.element("ballad");
		System.out.println(music.asXML());
		
		
		//查找music全部子元素
		List list = root.elements("ballad");
	    //Element e1 = (Element)list.get(0);
	    //Element e2 = (Element)list.get(1);
		//Element e3 = (Element)list.get(2);
		
		//System.out.println(e1.asXML());
		//System.out.println(e2.asXML());
		//System.out.println(e3.asXML());
		
		for(int i=0;i<list.size();i++){
			Element e = (Element)list.get(i);
			System.out.println(e.asXML());
			
			Element n = e.element("name");
			System.out.println(n.asXML());
			
			//获取一个元素中的文本
			String str = n.getText();
			System.out.println(str);
		}
	}
	
}
