package cn.demorecoverDay13;
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
		doubleFire = 0;          
		
		
	}//��д
	public void step(){        //publicȨ��
		                                                        //System.out.println("Ӣ�ۻ��л�ͼƬ����");
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
			state=REMOVE;                                               //��״̬�޸�Ϊɾ��״̬
		}
			return null;
	}
	/**Ӣ�ۻ������ӵ��������ӵ������з���ֵBullet,�ӵ��е���˫��������������*/
	public Bullet[] shoot(){
		int xStep = this.width/4;                                      //1/4Ӣ�ۻ��Ŀ�
		int yStep = 20; 
		
		if (doubleFire>0) {                                            //��˫�������ж�//˫�������������з���ֵ,������˫��
			Bullet[] bs =new Bullet[2];
			bs[0]=new Bullet(this.x+1*xStep,this.y-yStep);
			bs[1]=new Bullet(this.x+3*xStep,this.y-yStep);            //   3/4Ӣ�ۻ��Ŀ�������˫��
			doubleFire-=2;                                             //����һ��˫������������ֵ��2
			return bs;
		}else{                                  
			
			Bullet[]bs= new Bullet[1];
			bs[0]=new Bullet(this.x+2*xStep,this.y-yStep);            //��������,�����з���ֵ��������Ӣ�ۻ��м� 
			
			return bs;
		}
		
	}

}
