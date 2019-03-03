package cn.demorecoverDay16;
/**英雄机设计第十天上午*/
import java.util.Random;
import java.awt.image.BufferedImage;                   //专门装图片的

public class Bullet extends FlyingObject{              //静态块建议放在类的最上边，先执行静态块
	private static BufferedImage image;
	static{                                           //静态块的目的就是给静态资源赋值
		image= loadImage("bullet.png");
	}
	
	private int speed;
	/**构造法*/
	Bullet(int x,int y){                                     //子弹的位置不能写固定，只能传参，所以子弹的xy需要用参数传过来
		super(8,14,x,y);
		speed=10;
	
	}//重写
	public void step(){                                       //public权限
		     y-=speed;                                                  //,子弹向上飞的时候x坐标不变System.out.println("子弹的y坐标移动啦！"+speed);
	}
	/**重写获取图片*/
	public BufferedImage getImage(){
		if(isLife()){
			return image;
			
		}else if(isDead()){
			state=REMOVE; //将状态修改为删除状态
		}
			return null;		
	}
	/**重写检测飞行物是否越界*/
	public boolean outOfBounds(){
		return this.y<=-this.height;                                      //子弹小于等于自身的高即为越界了
	}
}
