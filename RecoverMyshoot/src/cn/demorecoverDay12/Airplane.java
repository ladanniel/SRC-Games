package cn.demorecoverDay12;
/**Ӣ�ۻ���Ƶ���������*/
import java.awt.image.BufferedImage;

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
	int deadIndex=1;
	/**��д��ȡͼƬ*/
	public BufferedImage getImage(){
		if(isLife()){
			
			return images[0];
		}else if(isDead()){
			BufferedImage img = images[deadIndex++];
			if (deadIndex==images.length) {
				state=REMOVE;
				
			}
			return img; //��״̬�޸�Ϊɾ��״̬
		}
			return null;
	}
}
