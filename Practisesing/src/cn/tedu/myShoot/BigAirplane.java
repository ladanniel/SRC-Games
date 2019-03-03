package cn.tedu.myShoot;

import java.awt.image.BufferedImage;

public class BigAirplane extends FlyingObject{
	private static BufferedImage [] images;
	static {
		images= new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i]= loadImage("bigplane"+i+".png");
		}
	}
	private int speed;
	public BigAirplane() {
		super(69,99);
		speed=2;
	}
	public void step() {
		System.out.println("´óµÐ»úÒÆ¶¯À²"+speed);
	}
	int deadindex=1;
	public  BufferedImage getImage() {
		if (isLife()) {
			return images[0];
			
		}else if (isDead()) {
			BufferedImage img = images[deadindex++];
			if (deadindex==images.length) {
				state = REMOVE;
			}
			return img;
		}
		return null;
		
	}
	

}
