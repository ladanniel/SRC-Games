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
		 * ����dom4j��ȡXML�ļ�
		 */
		FileInputStream in = new FileInputStream("music.xml");
		SAXReader reader = new SAXReader();
		//���XML�ļ���ʽ�������׳��쳣
		Document doc=reader.read(in);
		in.close();
		//����doc����,doc��������music.xml��������ͬ
		System.out.println(doc.asXML());
		
		
		
		
		/*
		 * ����doc�еĸ�Ԫ�أ�����music.xml�ĸ�Ԫ��
		 * Root�� ElementԪ��
		 */
		Element root = doc.getRootElement();
		
		
		//Element���͵Ķ��󣬾ʹ���XML�ļ��е�һ��Ԫ��
		//���root����Ϣ����������Ԫ�ص�ȫ����Ϣ
		System.out.println(root.asXML());
		
		//���Ҹ�Ԫ�صĵ�һ����Ԫ�أ���������Ԫ�ص�����
		Element music = root.element("ballad");
		System.out.println(music.asXML());
		
		
		//����musicȫ����Ԫ��
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
			
			//��ȡһ��Ԫ���е��ı�
			String str = n.getText();
			System.out.println(str);
		}
	}
	
}
