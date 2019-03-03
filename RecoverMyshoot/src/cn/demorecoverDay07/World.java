package cn.demorecoverDay07;
/**英雄机设计第四天下午*/
import javax.swing.JFrame;
import javax.swing.JPanel;



/**英雄机设计第四天下午，重载编译器看参数引用，重写运行期看对象*当觉得超类的行为不够好的时候在派生类中进行重写*/
public class World extends JPanel{                                            //此处new了，之后直接用即可不用重复写
	Sky sky = new Sky();
	Hero hero =new Hero();
	
	FlyingObject[] enemies = {};                               //小敌机，大敌机，小蜜蜂合三为一，都是英雄机的敌人，
	Bullet[]bts = {};
	
	void action(){ //测试代码
		sky.step();
		hero.step();
		enemies = new FlyingObject[5];
		enemies[0] = new Airplane();
		enemies[1] = new Airplane();
		enemies[2] = new BigAirplane();
		enemies[3] = new BigAirplane();
		enemies[4] = new Bee();
		for (int i = 0; i < enemies.length; i++) {
			
		    enemies[i].step();                                 //每一个派生类移动的方式都不一样，要想实现自己的移动方式，就需要重写
		
		}
	Bullet[]bullets=new Bullet[1];
	bullets[0]= new Bullet(100,200);
	bullets[0].step();
	}

	public static void main(String[] args) {
		World world=new World();
		world.action();                                //启动程序的执行
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.add(world);

	}

}
