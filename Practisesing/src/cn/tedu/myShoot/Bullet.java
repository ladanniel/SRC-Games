package cn.tedu.myShoot;

import java.awt.image.BufferedImage;

public class Bullet extends FlyingObject {
	
	private static BufferedImage image;
	static {
		image = loadImage("bullet.png");
	}
	private int speed;
	public Bullet(int x ,int y){
		super(8,14,x,y);
		speed = 2;
		
	}
	public void step() {
		y=speed;
		
	}
	public BufferedImage getImage(){
		if (isLife()) {
			return image;
		}
		if (isDead()) {
			
			state = REMOVE;
		}
		
		return null;
		
	}
	
	
	
	

}
