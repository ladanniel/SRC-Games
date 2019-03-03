package day0008;
/**Ӣ�ۻ���Ƶڰ�������*/
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
/**��дstep�����ƶ�**/	                                                                       
	public void step(){                                                    //publicȨ��
		y+=speed;                                                           //y�����ƶ�
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
			return img;                                                     //��״̬�޸�Ϊɾ��״̬
		}
			return null;
	}
/**��д���������Ƿ�Խ��*/
	public boolean outOfBounds(){
		return this.y>=World.HEIGHT;                                      //С�л����ڵ��ڴ��ڵĸ߼�ΪԽ����
	}
}
