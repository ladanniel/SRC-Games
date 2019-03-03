package cn.demorecoverDay06;

import javax.swing.JFrame;

/**Ӣ�ۻ���Ƶ���������*ÿ�ַ��������Լ��ĺô���*/
public class World {                                            //�˴�new�ˣ�֮��ֱ���ü��ɲ����ظ�д
	Sky sky = new Sky();
	Hero hero =new Hero();
	
	FlyingObject[] enemies = {};                               //С�л�����л���С�۷����Ϊһ������Ӣ�ۻ��ĵ��ˣ�
	Bullet[]bts = {};
	
	void action(){ //���Դ���
		enemies = new FlyingObject[5];
		enemies[0] = new Airplane();
		enemies[1] = new Airplane();
		enemies[2] = new BigAirplane();
		enemies[3] = new BigAirplane();
		enemies[4] = new Bee();
		for (int i = 0; i < enemies.length; i++) {
		
		    enemies[i].step();                                 //ÿһ���������ƶ��ķ�ʽ����һ����Ҫ��ʵ���Լ����ƶ���ʽ������Ҫ��д
		
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
