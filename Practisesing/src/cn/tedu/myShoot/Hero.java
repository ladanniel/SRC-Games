package cn.tedu.myShoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Hero extends FlyingObject {
	private static BufferedImage[] images;
	static {
		images = new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {
			images[i]=loadImage("hero"+i+".png");
		}
	}
	private int life;
	private int doubleFire;
	public Hero() {
		super(97,124,150,400);
		life = 3;
		doubleFire = 0;
	}
	
	public void step() {
		System.out.println("Ó¢ÐÛ»úÇÐ»»Í¼Æ¬À²");
	}
	public void  moveto(int x,int y) {
		System.out.println("Ó¢ÐÛ»úËæ×ÅÊó±êÒÆ¶¯À²");
	}
	int index=0;
	public BufferedImage getImage() {
		if (isLife()) {
			return images[index++%2];
		}else if (isDead()) {
			state = REMOVE;
		}
		return null;
		
	}
	public void paintObject(Graphics g) {
		g.drawImage(this.getImage(),x,y,null);
		
	}
	
}
