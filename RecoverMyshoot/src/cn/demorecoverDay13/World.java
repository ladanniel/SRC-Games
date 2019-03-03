package cn.demorecoverDay13;
/**Ӣ�ۻ���Ƶڰ�������*/
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;                                               //��ʱ��
import java.util.TimerTask;                                          //��ʱ����
import java.util.Random;
import java.util.Arrays;
/**���ر��������������ã���д�����ڿ�����*�����ó������Ϊ�����õ�ʱ�����������н�����д*/
public class World extends JPanel{                                  //�˴�new�ˣ�֮��ֱ���ü��ɲ����ظ�д
	 
	public static final int WIDTH=400;                           //���ڵĿ�
	public static final int HEIGHT=700;
	private Sky sky = new Sky();
	private Hero hero =new Hero();
	private FlyingObject[] enemies = { };                           //���ö���11�����Ԫ��  //ԭ��new�Ķ���ɾ��                            //С�л�����л���С�۷����Ϊһ������Ӣ�ۻ��ĵ��ˣ�
	private Bullet[]bullets = {};                                   //ԭ�������еĶ���ɾ��
	
/**���ɵ��ˣ�С�л�����л���С�۷䣩����ԭ�������еĶ���ɾ��*/
	public FlyingObject nextOne(){                                 //FlyingObject���գ�����paint
		Random rand =new Random();
		int type =rand.nextInt(20);                                //���˳��ֵ�����������0��19֮��
		if(type<4){                                                //Ϊ�˿��Ƹ��ʣ�����ѡ��<4�ȵķ�Χ
			return new Bee();
		}else if(type<12){
			return new Airplane();
			
		}else{
			return new BigAirplane();
		}
	}
/**�����볡����*/
	int enterIndex=0; 
/**���ˣ�С�л�����л���С�۷��볡���������ɴ��ڲ�����*/
	public void enterAction(){                                           //10mm��һ��
		enterIndex++;                                                    //ÿ10mm��1
		
		if(enterIndex%40==0){                                          //ÿ400���루10*40����һ��1.��ȡ���˶���2�����˶�����ӵ�enemies�����У����Ķ��󶼴������л�ȡ��
			
			FlyingObject obj = nextOne();                             //��������һ��Ҫ�Ƚ���
			enemies =Arrays.copyOf(enemies,enemies.length+1);        //��ȡ���˶������ݴ�һ��������ԭ����Ϊnull��
			enemies[enemies.length-1]=obj;                                                 //��������ӵ����һ��Ԫ����,,����û���ֵ�ԭ�򣿶�������{}�ж���Ϊ0�����µ���paint��paintҪ������
				
		}
		
	}
	/**�ӵ��볡����*/
	int shootIndex=0; 
	/**�ӵ��볡��Ӣ�ۻ������ӵ���*/
	public void shootAction(){                                                          //ÿ10mm��һ��
		shootIndex++;
		if(shootIndex%30==0){                                                        //�����ӵ�����Ƶ��1.��ȡ�ӵ�����2.���ӵ�������ӵ�Bullet�����У������shoot��Ҫ����
			Bullet[] bs = hero.shoot();
			bullets=Arrays.copyOf(bullets,bullets.length+bs.length);                //�ӵ���˫���������ʱ�仯��ֵ��ʱ�仯
			System.arraycopy(bs,0,bullets,bullets.length-bs.length,bs.length);          //�����׷�ӣ�
		    System.out.println(bullets.length);
		
		
		}
		
	}
	
/**��������ִ��*/	
	public void action(){                                                             //���Դ��룬ͼƬ׼���ú���world�е��ã�����֮ǰ��action�еĴ���ȫ��ɾ��
		
		Timer timer = new Timer();
		int intervel=10;                                                              //�����볡���Ƕ�ʱ�����ģ��������ö�ʱ������ʱ������Ժ���Ϊ��λ��
		timer.schedule(new TimerTask(){
    public void run(){                                                             //��ʱ����������
				enterAction();
				shootAction();
				repaint();                                                              //���˶���Ҫ����������paint����{}����һ����repaint,ϵͳ�Զ�����paint����{}����
			}                                                     
		},intervel,intervel);
	}
	public void paint(Graphics g){                                                        //��Ҫ���ö���11
		sky.paintObject(g);
		hero.paintObject(g);
		
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);                                   //���˶�����Դ������
			
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);
			
		}
		
	}

	public static void main(String[] args) {
		World world=new World();
		world.action();                                                     //���������ִ��
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.add(world);

	}

}
