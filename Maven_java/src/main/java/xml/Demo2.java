package xml;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * 利用dom4j读取文件
		 */
		try {
			FileInputStream in = new FileInputStream("books.xml");
			SAXReader reader = new SAXReader();
			//如果XML文件格式错误，则抛出异常
			Document doc = reader.read(in);
			
			//in.close();
			//驶入doc内容，doc的内容与books.xml的neirongxiangtong
			System.out.println(doc.asXML());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
