package cn.tedu.myShoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public abstract class  FlyingObject {
	public static final int LIFE=0;
	public static final int DEAD=1;
	public static final int REMOVE=2;
	protected int state = LIFE;
	protected int width;
	protected int height;
	protected int x;
	protected int y;
	//给小敌机、大敌机、小蜜蜂
	public FlyingObject(int width, int height) {
		
		this.width = width;
		this.height = height;
		Random rand = new Random();
		x = rand.nextInt(World.WIDTH-this.width);
		y = this.height;
		
	}
	//给英雄机，天空，子弹 
	public FlyingObject(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		
	}
	public abstract void step();
	public static BufferedImage loadImage(String filename) {
		 try {
			BufferedImage im = ImageIO.read(FlyingObject.class.getResource(filename));
			
			return im;
		} catch (IOException e) {
			
			e.printStackTrace();
			throw new RuntimeException();
		}
	
	}
	public abstract BufferedImage getImage();
	public boolean isLife() {
		return state ==LIFE;
	}
	public boolean isDead() {
		return state == DEAD;
	}
	public boolean isRemove() {
		return state == REMOVE;
	}
	public void paintObject(Graphics g) {
		g.drawImage(this.getImage(),x,y,null);
		
	}
	
	
	

}
