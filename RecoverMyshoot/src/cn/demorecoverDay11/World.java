package cn.demorecoverDay11;
import java.awt.Graphics;

/**Ӣ�ۻ���Ƶ���������*/
import javax.swing.JFrame;
import javax.swing.JPanel;
/**���ر��������������ã���д�����ڿ�����*�����ó������Ϊ�����õ�ʱ�����������н�����д*/
public class World extends JPanel{                                            //�˴�new�ˣ�֮��ֱ���ü��ɲ����ظ�д
	 
	public static final int WIDTH=400;    //���ڵĿ�
	public static final int HEIGHT=700;
	private Sky sky = new Sky();
	private Hero hero =new Hero();
	private FlyingObject[] enemies = {
			new Airplane(),new BigAirplane(),new Bee()
	}; //���ö���11�����Ԫ��                              //С�л�����л���С�۷����Ϊһ������Ӣ�ۻ��ĵ��ˣ�
	private Bullet[]bullets = {new Bullet(100,200)};
	
	
	public void action(){ //���Դ��룬ͼƬ׼���ú���world�е��ã�����֮ǰ��action�еĴ���ȫ��ɾ��
		
		
	}
	public void paint(Graphics g){//��Ҫ���ö���11
		sky.paintObject(g);
		hero.paintObject(g);
		
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);
			
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);
			
		}
		
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
