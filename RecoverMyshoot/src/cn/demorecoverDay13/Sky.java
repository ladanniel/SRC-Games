package cn.demorecoverDay13;
/**Ӣ�ۻ���Ƶڰ�������*/
import java.awt.Graphics;

import java.awt.image.BufferedImage;

public class Sky extends FlyingObject{
	private static BufferedImage image;
	static{
		image=loadImage("background.png");
	}
	private int speed;
	private int y1;     
	/**���취*/
	Sky(){
		super(World.WIDTH,World.HEIGHT,0,0);
	
		speed = 1;
		y1 = -this.height;
	}//��д
	public void step(){   //publicȨ��
		y+=speed;
		y1+=speed;
	}
	/**��д��ȡͼƬ*/
	public BufferedImage getImage(){
		return image;
		
	}
	/**��д������g:����*/
	public void paintObject(Graphics g){
		g.drawImage(this.getImage(), x, y, null);
		g.drawImage(this.getImage(), x, y1, null);
		
	}
	

}
