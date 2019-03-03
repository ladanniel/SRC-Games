package cn.demorecoverDay13;
/**英雄机设计第八天上午*/
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;                                               //定时器
import java.util.TimerTask;                                          //定时任务
import java.util.Random;
import java.util.Arrays;
/**重载编译器看参数引用，重写运行期看对象*当觉得超类的行为不够好的时候在派生类中进行重写*/
public class World extends JPanel{                                  //此处new了，之后直接用即可不用重复写
	 
	public static final int WIDTH=400;                           //窗口的宽
	public static final int HEIGHT=700;
	private Sky sky = new Sky();
	private Hero hero =new Hero();
	private FlyingObject[] enemies = { };                           //调用对象11，填充元素  //原有new的对象删除                            //小敌机，大敌机，小蜜蜂合三为一，都是英雄机的敌人，
	private Bullet[]bullets = {};                                   //原有数组中的对象删除
	
/**生成敌人（小敌机、大敌机、小蜜蜂）对象，原有数组中的对象删除*/
	public FlyingObject nextOne(){                                 //FlyingObject接收，接收paint
		Random rand =new Random();
		int type =rand.nextInt(20);                                //敌人出现的数量控制在0到19之间
		if(type<4){                                                //为了控制概率，所有选择<4等的范围
			return new Bee();
		}else if(type<12){
			return new Airplane();
			
		}else{
			return new BigAirplane();
		}
	}
/**敌人入场计数*/
	int enterIndex=0; 
/**敌人（小敌机、大敌机、小蜜蜂入场）敌人是由窗口产生的*/
	public void enterAction(){                                           //10mm走一次
		enterIndex++;                                                    //每10mm增1
		
		if(enterIndex%40==0){                                          //每400毫秒（10*40）走一次1.获取敌人对象，2将敌人对象添加到enemies数组中，画的对象都从数组中获取的
			
			FlyingObject obj = nextOne();                             //，调方法一定要先接收
			enemies =Arrays.copyOf(enemies,enemies.length+1);        //获取敌人对象，扩容大一个容量。原数组为null，
			enemies[enemies.length-1]=obj;                                                 //将敌人添加到最后一个元素上,,敌人没出现的原因？顶上数组{}中对象为0，重新调用paint，paint要反复画
				
		}
		
	}
	/**子弹入场计数*/
	int shootIndex=0; 
	/**子弹入场（英雄机发射子弹）*/
	public void shootAction(){                                                          //每10mm走一次
		shootIndex++;
		if(shootIndex%30==0){                                                        //控制子弹发射频率1.获取子弹对象，2.将子弹对象添加到Bullet数组中，向调用shoot需要接收
			Bullet[] bs = hero.shoot();
			bullets=Arrays.copyOf(bullets,bullets.length+bs.length);                //子弹单双倍或火力随时变化，值随时变化
			System.arraycopy(bs,0,bullets,bullets.length-bs.length,bs.length);          //数组的追加，
		    System.out.println(bullets.length);
		
		
		}
		
	}
	
/**启动程序执行*/	
	public void action(){                                                             //测试代码，图片准备好后，在world中调用，调用之前把action中的代码全部删除
		
		Timer timer = new Timer();
		int intervel=10;                                                              //敌人入场，是定时发生的，所以设置定时器，定时间隔，以毫秒为单位，
		timer.schedule(new TimerTask(){
    public void run(){                                                             //定时器做的事情
				enterAction();
				shootAction();
				repaint();                                                              //敌人对象要反复画调用paint（）{}方法一旦用repaint,系统自动调用paint（）{}工具
			}                                                     
		},intervel,intervel);
	}
	public void paint(Graphics g){                                                        //需要调用对象11
		sky.paintObject(g);
		hero.paintObject(g);
		
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);                                   //敌人对象来源于数组
			
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);
			
		}
		
	}

	public static void main(String[] args) {
		World world=new World();
		world.action();                                                     //启动程序的执行
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.add(world);

	}

}
