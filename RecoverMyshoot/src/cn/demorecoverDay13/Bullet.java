package cn.demorecoverDay13;
/**Ӣ�ۻ���Ƶڰ�������*/
import java.util.Random;
import java.awt.image.BufferedImage;                   //ר��װͼƬ��

public class Bullet extends FlyingObject{              //��̬�齨�����������ϱߣ���ִ�о�̬��
	private static BufferedImage image;
	static{                                           //��̬���Ŀ�ľ��Ǹ���̬��Դ��ֵ
		image= loadImage("bullet.png");
	}
	
	private int speed;
	/**���취*/
	Bullet(int x,int y){                                     //�ӵ���λ�ò���д�̶���ֻ�ܴ��Σ������ӵ���xy��Ҫ�ò���������
		super(8,14,x,y);
		speed=3;
	
	}//��д
	public void step(){                                       //publicȨ��
		     y-=speed;                                                  //,�ӵ����Ϸɵ�ʱ��x���겻��System.out.println("�ӵ���y�����ƶ�����"+speed);
	}
	/**��д��ȡͼƬ*/
	public BufferedImage getImage(){
		if(isLife()){
			return image;
			
		}else if(isDead()){
			state=REMOVE; //��״̬�޸�Ϊɾ��״̬
		}
			return null;
		
		
		
	}
}