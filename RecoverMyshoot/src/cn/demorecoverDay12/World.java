package cn.demorecoverDay12;
/**Ӣ�ۻ���Ƶ�����*/
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;//��ʱ��
import java.util.TimerTask;//��ʱ����
import java.util.Random;
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
	
	
	public FlyingObject nextOne(){
		Random rand =new Random();
		int type =rand.nextInt(20);                                //0��19֮��
		if(type<4){                                                //Ϊ�˿��Ƹ��ʣ�����ѡ��<4�ȵķ�Χ
			return new Bee();
		}else if(type<12){
			return new Airplane();
			
		}else{
			return new BigAirplane();
		}
		
		
		
		
	}
	
	int enterIndex=0;
	
	public void enterAction(){
		enterIndex++;
		
		
		
		if(enterIndex%40==0){}
		
	}
	
	
	
	public void action(){ //���Դ��룬ͼƬ׼���ú���world�е��ã�����֮ǰ��action�еĴ���ȫ��ɾ��
		
		Timer timer = new Timer();
		int intervel=10;                                         //��ʱ������Ժ���Ϊ��λ
		timer.schedule(new TimerTask(){
                    public void run(){                          //��ʱ��������
				enterAction();
			}                                                     
		},intervel,intervel);
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
