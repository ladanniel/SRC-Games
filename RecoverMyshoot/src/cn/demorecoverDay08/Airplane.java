package cn.demorecoverDay08;
/**英雄机设计第五天上午*/
import java.util.Random;
public class Airplane extends FlyingObject{
	
	 private int speed;
	/**构造方法*/
	Airplane(){
		super(49,36);
		speed=2;
	}
	//重写
	public void step(){     //public权限
		System.out.println("小敌机的y坐标移动啦！"+speed);
	}

}
