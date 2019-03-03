package cn.demorecoverDay07;
/**英雄机设计第四天下午*/
import java.util.Random;
public class Airplane extends FlyingObject{
	
	int speed;
	/**构造方法*/
	Airplane(){
		super(49,36);
		speed=2;
	}
	//重写
	void step(){
		System.out.println("小敌机的y坐标移动啦！"+speed);
	}

}
