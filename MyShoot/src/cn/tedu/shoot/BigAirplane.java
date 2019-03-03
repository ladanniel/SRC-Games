package cn.tedu.shoot;
import java.awt.image.BufferedImage;
/** ��л�:�Ƿ����� */
public class BigAirplane extends FlyingObject implements Enemy{
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("bigplane"+i+".png");
		}
	}
	
	private int speed;
	/** ���췽�� */
	public BigAirplane(){
		super(69,99);
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
		}
		return null;
	}
	
	/** ��дoutOfBounds()���Խ�� */
	public boolean outOfBounds(){
		return this.y>=World.HEIGHT; //��л���y>=���ڵĸߣ���ΪԽ���� 
	}
	public int getScore(){
		return 3;
	}
	
}

