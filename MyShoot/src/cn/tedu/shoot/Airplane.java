package cn.tedu.shoot;
import java.awt.image.BufferedImage;
/** С�л�:�Ƿ����� */
public class Airplane extends FlyingObject implements Enemy{
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("airplane"+i+".png");
		}
	}
	
	private int speed; //�ƶ��ٶ�
	/** ���췽�� */
	public Airplane(){
		super(49,36);
		speed = 2;
	}
	
	/** ��дstep()�ƶ� */
	public void step(){
		y+=speed; //y+(����)
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
			/*
			 * ���˵�:
			 * 10M img=images[1] deadIndex=2 ����images[1]
			 * 20M img=images[2] deadIndex=3 ����images[2]
			 * 30M img=images[3] deadIndex=4 ����images[3]
			 * 40M img=images[4] deadIndex=5(REMOVE) ����images[4]
			 * 50M ����null
			 */
		}
		return null;
	}
	
	/** ��дoutOfBounds()���Խ�� */
	public boolean outOfBounds(){
		return this.y>=World.HEIGHT; //С�л���y>=���ڵĸߣ���ΪԽ���� 
	}
	public int getScore(){
		return 1;
	}
	
}
