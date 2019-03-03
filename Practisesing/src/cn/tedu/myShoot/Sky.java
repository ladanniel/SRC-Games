package cn.tedu.myShoot;

import java.awt.image.BufferedImage;

public class Sky extends FlyingObject{
	private static BufferedImage  image;
	static {
		image = loadImage("background.png");
	}
	
	private int speed;
	public Sky() {
		super(400,700,0,0);
		speed=1;
	}
	public void step() {
		System.out.println("Ìì¿ÕÇÐ»»Í¼Æ¬À²"+speed);
	}
	public BufferedImage getImage() {
		return image;
		
	}
	
}
