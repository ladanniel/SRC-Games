package cn.demorecoverDay11;
/**Ӣ�ۻ���Ƶ���������*/
import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
	private static BufferedImage []images;
	static{
		images=new BufferedImage[2];
	for (int i = 0; i < images.length; i++) {
		images[i]=loadImage("hero"+i+".png");
	}
		
	}
	private int life;
	private int doubleFire;
	/**���취*/
	Hero(){
		super(97,124,150,400);
		life = 3;
		doubleFire = 0;
		
		
	}//��д
	public void step(){        //publicȨ��
		System.out.println("Ӣ�ۻ��л�ͼƬ����");
	}
	
	/**Ӣ�ۻ���������ƶ���x,y����xy����*/
	void moveTo(int x, int y){
		System.out.println("Ӣ�ۻ���������ƶ�����");
		
	}
	int index=0;
	/**��д��ȡͼƬ*/
	public BufferedImage getImage(){
		if(isLife()){
			
			return images[index++%2];
		}else if(isDead()){
			state=REMOVE; //��״̬�޸�Ϊɾ��״̬
		}
			return null;
	}

}
