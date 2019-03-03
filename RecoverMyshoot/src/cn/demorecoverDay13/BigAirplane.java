package cn.demorecoverDay13;
/**Ӣ�ۻ���Ƶڰ���*/
import java.awt.image.BufferedImage;
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
		y+=speed;                               //y�����ƶ�
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
