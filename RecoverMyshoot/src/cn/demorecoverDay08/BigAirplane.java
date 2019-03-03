package cn.demorecoverDay08;
/**英雄机设计第五天上午*/
import java.util.Random;

public class BigAirplane extends FlyingObject {
	
	private int speed;
	/**构造法*/
	BigAirplane(){
		super(69,99);
                      //负的大敌机的高
		speed=2;
	}
	//重写
	public void step(){                      //public权限
		System.out.println("大敌机的y坐标移动啦！"+speed);
	}

}
