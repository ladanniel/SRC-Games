package cn.demorecoverday03;
/**英雄机设计第三天*/
import java.util.Random;

public class Bullet {
	int width;
	int height;
	int x;
	int y;
	int speed;
	
	Bullet(int x,int y){              //子弹的位置不能写固定，只能传参，所以子弹的xy需要用参数传过来
		width=60;
		height=50;
		this.x=x;
		this.y=y;
		speed=3;
	
	}
	void step(){
		System.out.println("子弹的y坐标移动啦！"+speed);
	}

}
