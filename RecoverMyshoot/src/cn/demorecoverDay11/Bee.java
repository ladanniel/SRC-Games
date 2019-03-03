package cn.demorecoverDay11;
/**Ӣ�ۻ���Ƶ���������*/
import java.awt.image.BufferedImage;
import java.util.Random;

public class Bee extends FlyingObject{
	private static BufferedImage [] images;
	static{
		images=new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;
	private int ySpeed;
	private int awardType;//��������
	/**���취*/
	Bee(){
		super(60,50);
		Random rand =new Random();
		xSpeed=1;
		ySpeed=2;
		awardType=rand.nextInt(2);//���ֽ������ͣ������о�д2�����м��ֽ�����д��
		
		
		
	}//��д
	public void step(){           //publicȨ��
		System.out.println("С�۷��x�����ƶ�������"+xSpeed+",С�۷��x�����ƶ�������"+ySpeed);
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
