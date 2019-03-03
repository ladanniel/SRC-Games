package cn.demorecoverDay08;
/**英雄机设计第五天上午*/
import java.util.Random;

public class Bullet extends FlyingObject{
	
	private int speed;
	/**构造法*/
	Bullet(int x,int y){              //子弹的位置不能写固定，只能传参，所以子弹的xy需要用参数传过来
		super(8,14,x,y);
		speed=3;
	
	}//重写
	public void step(){                //public权限
		System.out.println("子弹的y坐标移动啦！"+speed);
	}
}
