package cn.tedu.myShoot;

import java.awt.image.BufferedImage;
import java.util.Random;

public class Bee extends FlyingObject {
	private static BufferedImage[]images;
	static {
		images = new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("bee"+i+".png");
		}
	}
	private int xSpeed;
	private int ySpeed;
	private int awardType;
	 public Bee() {
		 super(60,50);
		 xSpeed=2;
		 ySpeed=3;
		 Random rand = new Random();
		 awardType = rand.nextInt(2);
		
	 }
	 public void step() {
		 xSpeed=1;
		 ySpeed=2;
	 }
	 int deadindex=1;
	 public BufferedImage getImage() {
		if (isLife()) {
			return images[0];
		}else if(isDead()) {
			BufferedImage img = images[deadindex++];
			if (deadindex==images.length) {
				state=REMOVE;
			}
			
			return img;
			
		}
		return null;
	 }
	

}