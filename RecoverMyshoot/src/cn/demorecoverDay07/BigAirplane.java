package cn.demorecoverDay07;
/**英雄机设计第四天下午*/
import java.util.Random;

public class BigAirplane extends FlyingObject {
	
	int speed;
	/**构造法*/
	BigAirplane(){
		super(69,99);
                      //负的大敌机的高
		speed=2;
	}
	//重写
	void step(){
		System.out.println("大敌机的y坐标移动啦！"+speed);
	}

}
