package cn.demorecoverDay10;
import java.awt.image.BufferedImage;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;
public class Airplane extends FlyingObject{
	private static BufferedImage[] images;
	static{
		images=new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("airplane"+i+".png");
		}
		
	}
	 private int speed;
	/**���췽��*/
	Airplane(){
		super(49,36);
		speed=2;
	}
	//��д
	public void step(){     //publicȨ��
		System.out.println("С�л���y�����ƶ�����"+speed);
	}

}
