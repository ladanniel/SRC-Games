package cn.demorecoverDay17;
/**Ӣ�ۻ���Ƶ�ʮһ��*/
import java.awt.image.BufferedImage;
import java.util.Random;



public class Bee extends FlyingObject implements Award{
	private static BufferedImage [] images;
	static{
		images=new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;
	private int ySpeed;
	private int awardType;                                                                 //��������
	/**���취*/
	public Bee(){
		super(60,50);
		Random rand =new Random();
		xSpeed=1;
		ySpeed=2;
		awardType=rand.nextInt(2);                                                      //���ֽ������ͣ������о�д2�����м��ֽ�����д��
		
		
		
	}//��д
	public void step(){                                                               //publicȨ��
		x+=xSpeed;                                                                     // x+��������Ҳ��������
		y+=ySpeed;                                                                    //С�۷��ƶ�xy���궼�����仯
		if (x<=0||x>=World.WIDTH-this.width) {
			xSpeed*=-1;                                                                 //x=-1ʱ��-1*-1=1���Ҹı䷽��;x=1ʱ1*-1=-1������ı䷽��
		}
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
	/**��д���������Ƿ�Խ��*/
	public boolean outOfBounds(){
		return this.y>=World.HEIGHT;                                      //С�л����ڵ��ڴ��ڵĸ߼�ΪԽ����
	}
	public int getAwardType(){
		return awardType;
	}
	
	

}
