package cn.demorecoverDay10;
/**Ӣ�ۻ���Ƶ���������*/
import javax.swing.JFrame;
import javax.swing.JPanel;
/**Ӣ�ۻ���Ƶ��������磬���ر��������������ã���д�����ڿ�����*�����ó������Ϊ�����õ�ʱ�����������н�����д*/
public class World extends JPanel{                                            //�˴�new�ˣ�֮��ֱ���ü��ɲ����ظ�д
	public static final int WIDTH=400;    //���ڵĿ�
	public static final int HEIGHT=700;
	private Sky sky = new Sky();
	private Hero hero =new Hero();
	private FlyingObject[] enemies = {};                               //С�л�����л���С�۷����Ϊһ������Ӣ�ۻ��ĵ��ˣ�
	private Bullet[]bts = {};
	
	public void action(){ //���Դ���
		sky.step();
		hero.step();
		enemies = new FlyingObject[3];
		enemies[0] = new Airplane();
		enemies[1] = new BigAirplane();
		enemies[2] = new Bee();
		for (int i = 0; i < enemies.length; i++) {
			
		    enemies[i].step();                                 //ÿһ���������ƶ��ķ�ʽ����һ����Ҫ��ʵ���Լ����ƶ���ʽ������Ҫ��д
		
		}
	Bullet[]bullets=new Bullet[1];
	bullets[0]= new Bullet(100,200);
	bullets[0].step();
	}

	public static void main(String[] args) {
		World world=new World();
		world.action();                                //���������ִ��
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.add(world);

	}

}
