package cn.demorecoverDay14;
/**Ӣ�ۻ���Ƶڰ�������*/
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
		doubleFire = 4;          
		
		
	}//��д
	public void step(){        //publicȨ��
		                                                        //System.out.println("Ӣ�ۻ��л�ͼƬ����");
	}
	
	/**Ӣ�ۻ���������ƶ���x,y����xy����*/
	void moveTo(int x, int y){
		this.x = x-this.width/2;                                   //Ӣ�ۻ���x =����x
		this.y = y-this.height/2;                               //Ӣ�ۻ���Y =����Y
		
	}
	int index=0;
	/**��д��ȡͼƬ*/
	public BufferedImage getImage(){
		if(isLife()){
			
			return images[index++%2];
		}else if(isDead()){
			state=REMOVE;                                               //��״̬�޸�Ϊɾ��״̬
		}
			return null;
	}
	/**Ӣ�ۻ������ӵ��������ӵ������з���ֵBullet,�ӵ��е���˫��������������*/
	public Bullet[] shoot(){                                                           //Bullet[]�з���ֵ����
		int xStep = this.width/4;
		int yStep = 20;
		if(doubleFire>0){
			Bullet[]bs = new Bullet[2];
			bs[0]=new Bullet(this.x+1*xStep,this.y-yStep);
			bs[1]=new Bullet(this.x+3*xStep,this.y-yStep);
			return bs;
			
		}else{
			Bullet[]bs=new Bullet[1];
			bs[0]=new Bullet(this.x+2*xStep,this.y-yStep);
			return bs;
		
		}
	}
	
	/**��д���������Ƿ�Խ��*/
	public boolean outOfBounds(){
		return false;                                                           //Ӣ�ۻ�����Խ��
	}

}