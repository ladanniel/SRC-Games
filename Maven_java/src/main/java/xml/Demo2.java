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
		 * ����dom4j��ȡ�ļ�
		 */
		try {
			FileInputStream in = new FileInputStream("books.xml");
			SAXReader reader = new SAXReader();
			//���XML�ļ���ʽ�������׳��쳣
			Document doc = reader.read(in);
			
			//in.close();
			//ʻ��doc���ݣ�doc��������books.xml��neirongxiangtong
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
