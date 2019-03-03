package cn.tedu.shoot;
import java.awt.image.BufferedImage;
/** Ӣ�ۻ� */
public class Hero extends FlyingObject {
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[2];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("hero"+i+".png");
		}
	}
	
	private int life;   //��
	private int doubleFire; //����ֵ
	/** ���췽�� */
	public Hero(){
		super(97,124,150,400);
		life = 3;
		doubleFire = 0; //Ĭ�ϵ�������
	}
	
	/** Ӣ�ۻ���������ƶ�  x,y:����x�����y���� */
	public void moveTo(int x,int y){
		this.x = x-this.width/2;  //Ӣ�ۻ���x=����x-1/2Ӣ�ۻ��Ŀ�
		this.y = y-this.height/2; //Ӣ�ۻ���y=����y-1/2Ӣ�ۻ��ĸ�
	}
	
	/** ��дstep()�ƶ� */
	public void step(){
		
	}

	int index = 0; //���ŵ��±�
	/** ��дgetImage()��ȡͼƬ */
	public BufferedImage getImage(){ //ÿ10������һ��
		if(isLife()){ //��������
			return images[index++%2];
		}
		/*
		 * ���ŵ�:
		 * 10M ����images[0] index=1
		 * 20M ����images[1] index=2
		 * 30M ����images[0] index=3
		 * 40M ����images[1] index=4
		 * 50M ����images[0] index=5
		 */
		return null;
	}
	
	/** Ӣ�ۻ������ӵ�(�����ӵ�����) */
	public Bullet[] shoot(){
		int xStep = this.width/4; //1/4Ӣ�ۻ��Ŀ�
		int yStep = 20;           //�̶���20 
		if(doubleFire>0){ //˫
			Bullet[] bs = new Bullet[2]; //2���ӵ�
			bs[0] = new Bullet(this.x+1*xStep,this.y-yStep); //x:Ӣ�ۻ���x+1/4Ӣ�ۻ��Ŀ� y:Ӣ�ۻ���y-�̶���20
			bs[1] = new Bullet(this.x+3*xStep,this.y-yStep); //x:Ӣ�ۻ���x+3/4Ӣ�ۻ��Ŀ� y:Ӣ�ۻ���y-�̶���20
			doubleFire-=2; //����һ��˫�����������ֵ��2
			return bs;
		}else{ //��
			Bullet[] bs = new Bullet[1]; //1���ӵ�
			bs[0] = new Bullet(this.x+2*xStep,this.y-yStep); //x:Ӣ�ۻ���x+2/4Ӣ�ۻ��Ŀ� y:Ӣ�ۻ���y-�̶���20
			return bs;
		}
	}
	
	/** ��дoutOfBounds()���Խ�� */
	public boolean outOfBounds(){
		return false; //����Խ��
	}
	/** Ӣ�ۻ�����*/
	public void addLife(){
		life++;//������һ
	}
	
	/** ��ȡӢ�ۻ����� */
	public int getLife(){
		return life;
	}
	public void subtractLife(){
		life--;//����
	}
	
	public int getDoubleFire(){
		return doubleFire;
	}
	public void addDoubleFier(){
		doubleFire+=40;//����ֵ��40
	}
	public void clearDoubleFire(){
		doubleFire = 0;//����ֵ����
	}
}
