package cn.tedu.myShoot;

import java.awt.image.BufferedImage;

public class Airplane extends FlyingObject {
	private static BufferedImage [] images;
	static {
		images = new BufferedImage[5];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("airplane"+i+".png");
		}
	}
	private int speed;
	public Airplane(){
		
		super(49,36);
		speed = 2;
		
	}
	public void step() {
		System.out.println("小敌机的y坐标移动啦"+speed);
	}
	int deadindex = 1;
	public BufferedImage getImage() {
		
		if (isLife()) {
			return images[0];
		}else if (isDead()) {
			BufferedImage img = images[deadindex++];
			if (deadindex==images.length) {
				state=REMOVE;
			}
			
			return img;
		}

		return null;
		
	}
	

}
