package cn.demorecoverDay10;
import java.awt.image.BufferedImage;
/**超类派生类的作用就是让代码更简洁，复用性更好在调用的时候自己调用自己的*/
import java.util.Random;
import javax.imageio.ImageIO;  // 图片读写工具

/**超类，飞行物super*给变量赋值必须写构造*/
public abstract class FlyingObject {               //超类里的数据最好不用private，保护protected即可，子类中还需要用到此处的数据
	protected int width;        //共有部分
	protected int height;       //共有部分
	protected int x;            //共有部分
	protected int y;            //共有部分
	/**专门给英雄机、天空、子弹提供的构造*/
	public FlyingObject(int width,int height,int x,int y){
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
	}

	/**专门给小敌机、大敌机、小蜜蜂提供的构造*/
	public FlyingObject(int width,int height){
		this.width=width ;
		this.height=height;
		Random rand = new Random();
		x=rand.nextInt(World.WIDTH-this.width);      //x:0到（窗口宽-小敌机宽）之内的随机数，因为小敌机的坐标是随机产生的所以没有固定的x坐标
		y=-this.height;                       //负的小敌机的高
		
		
	}
	/**专门给小敌机、大敌机、小蜜蜂提供的构造*/
	public abstract void step();
	/**读图片*/
	public static BufferedImage loadImage(String fileName){
		try{
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));                   //同包中读取fileName对象
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	};

}
