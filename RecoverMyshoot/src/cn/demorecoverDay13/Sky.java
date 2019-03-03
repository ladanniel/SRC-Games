package cn.demorecoverDay13;
/**英雄机设计第八天上午*/
import java.awt.Graphics;

import java.awt.image.BufferedImage;

public class Sky extends FlyingObject{
	private static BufferedImage image;
	static{
		image=loadImage("background.png");
	}
	private int speed;
	private int y1;     
	/**构造法*/
	Sky(){
		super(World.WIDTH,World.HEIGHT,0,0);
	
		speed = 1;
		y1 = -this.height;
	}//重写
	public void step(){   //public权限
		y+=speed;
		y1+=speed;
	}
	/**重写获取图片*/
	public BufferedImage getImage(){
		return image;
		
	}
	/**重写画对象，g:画笔*/
	public void paintObject(Graphics g){
		g.drawImage(this.getImage(), x, y, null);
		g.drawImage(this.getImage(), x, y1, null);
		
	}
	

}
