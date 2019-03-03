package cn.tedu.shoot;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
/** ���:�Ƿ����� */
public class Sky extends FlyingObject {
	private static BufferedImage image;
	static{
		image = loadImage("background.png");
	}
	
	private int speed;
	private int y1; //��������ͼƬ�л�
	/** ���췽�� */
	public Sky(){
		super(World.WIDTH,World.HEIGHT,0,0);
		speed = 1;
		y1 = -this.height;
	}
	
	/** ��дstep()�ƶ� */
	public void step(){
		y+=speed;  //y+(����)
		y1+=speed; //y1+(����)
		if(y>=World.HEIGHT){ //y>=���ڵĸߣ���ζ�ŵ���������
			y=-World.HEIGHT; //��y���õ�������
		}
		if(y1>=World.HEIGHT){ //y1>=���ڵĸߣ���ζ�ŵ���������
			y1=-World.HEIGHT; //��y1���õ�������
		}
	}
	
	/** ��дgetImage()��ȡͼƬ */
	public BufferedImage getImage(){
		return image; //ֱ�ӷ���image����
	}
	
	/** ��дpaintObject()������ */
	public void paintObject(Graphics g){
		g.drawImage(getImage(),x,y,null);
		g.drawImage(getImage(),x,y1,null);
	}
	
	/** ��дoutOfBounds()���Խ�� */
	public boolean outOfBounds(){
		return false; //����Խ��
	}
	
}
