package cn.demorecoverDay06;

import javax.swing.JFrame;

/**英雄机设计第四天上午*每种方法都有自己的好处，*/
public class World {                                            //此处new了，之后直接用即可不用重复写
	Sky sky = new Sky();
	Hero hero =new Hero();
	
	FlyingObject[] enemies = {};                               //小敌机，大敌机，小蜜蜂合三为一，都是英雄机的敌人，
	Bullet[]bts = {};
	
	void action(){ //测试代码
		enemies = new FlyingObject[5];
		enemies[0] = new Airplane();
		enemies[1] = new Airplane();
		enemies[2] = new BigAirplane();
		enemies[3] = new BigAirplane();
		enemies[4] = new Bee();
		for (int i = 0; i < enemies.length; i++) {
		
		    enemies[i].step();                                 //每一个派生类移动的方式都不一样，要想实现自己的移动方式，就需要重写
		
		}
		
		
	}
		
	
	

	public static void main(String[] args) {
		World world = new World();
		world.action();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		

	}

}
