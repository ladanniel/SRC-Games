package cn.demorecoverday04;
/**英雄机设计第三天下午*/
import java.util.Random;

public class Bullet extends FlyingObject{
	
	int speed;
	/**构造法*/
	Bullet(int x,int y){              //子弹的位置不能写固定，只能传参，所以子弹的xy需要用参数传过来
		width=60;
		height=50;
		this.x=x;
		this.y=y;
		speed=3;
	
	}
	
}
