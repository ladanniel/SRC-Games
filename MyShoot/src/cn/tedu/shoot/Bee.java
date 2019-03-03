package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;
/** С�۷� */
public class Bee extends FlyingObject implements Award{
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("bee"+i+".png");
		}
	}
	private int xSpeed; //x�����ƶ��ٶ�
	private int ySpeed; //y�����ƶ��ٶ�
	private int awardType; //��������(0��1)
	/** ���췽�� */
	public Bee(){
		super(60,50);
		xSpeed = 1;
		ySpeed = 2;
		Random rand = new Random();
		awardType = rand.nextInt(2); //0��1
	}
	
	/** ��дstep()�ƶ� */
	public void step(){
		x+=xSpeed; //x+(���������)
		y+=ySpeed; //y+(����)
		if(x<=0 || x>=World.WIDTH-this.width){ //����ͷ��
			xSpeed*=-1; //�л�����(�л�����)
		}
	}
	
	int deadIndex = 1; //���˵��±�
	/** ��дgetImage()��ȡͼƬ */
	public BufferedImage getImage(){ //ÿ10������һ��
		if(isLife()){ //��������
			return images[0]; //����images[0]
		}else if(isDead()){
			BufferedImage img = images[deadIndex++]; //�ӵ�2�ſ�ʼ��ת
			if(deadIndex==images.length){ //�������һ����
				state = REMOVE; //���޸ĵ�ǰ״̬Ϊɾ��״̬
			}
			return img;
		}
		return null;
	}
	
	/** ��дoutOfBounds()���Խ�� */
	public boolean outOfBounds(){
		return this.y>=World.HEIGHT; //С�۷��y>=���ڵĸߣ���ΪԽ���� 
	}
	public int getAwardType(){
		return awardType;
	}
}

