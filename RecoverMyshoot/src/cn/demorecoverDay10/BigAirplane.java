package cn.demorecoverDay10;
import java.awt.image.BufferedImage;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;

public class BigAirplane extends FlyingObject {
	private static BufferedImage[] images;
	static{
		images=new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bigplane"+i+".png");
		}
	}
	
	private int speed;
	/**���취*/
	BigAirplane(){
		super(69,99);
                      //���Ĵ�л��ĸ�
		speed=2;
	}
	//��д
	public void step(){                      //publicȨ��
		System.out.println("��л���y�����ƶ�����"+speed);
	}

}
