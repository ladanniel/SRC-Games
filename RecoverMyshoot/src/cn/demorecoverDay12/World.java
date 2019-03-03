package cn.demorecoverDay12;
/**英雄机设计第七天*/
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;//定时器
import java.util.TimerTask;//定时任务
import java.util.Random;
/**重载编译器看参数引用，重写运行期看对象*当觉得超类的行为不够好的时候在派生类中进行重写*/
public class World extends JPanel{                                            //此处new了，之后直接用即可不用重复写
	 
	public static final int WIDTH=400;    //窗口的宽
	public static final int HEIGHT=700;
	private Sky sky = new Sky();
	private Hero hero =new Hero();
	private FlyingObject[] enemies = {
			new Airplane(),new BigAirplane(),new Bee()
	}; //调用对象11，填充元素                              //小敌机，大敌机，小蜜蜂合三为一，都是英雄机的敌人，
	private Bullet[]bullets = {new Bullet(100,200)};
	
	
	public FlyingObject nextOne(){
		Random rand =new Random();
		int type =rand.nextInt(20);                                //0到19之间
		if(type<4){                                                //为了控制概率，所有选择<4等的范围
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
	
	
	
	public void action(){ //测试代码，图片准备好后，在world中调用，调用之前把action中的代码全部删除
		
		Timer timer = new Timer();
		int intervel=10;                                         //定时间隔，以毫秒为单位
		timer.schedule(new TimerTask(){
                    public void run(){                          //定时做的事情
				enterAction();
			}                                                     
		},intervel,intervel);
	}
	public void paint(Graphics g){//需要调用对象11
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
		world.action();                                //启动程序的执行
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.add(world);

	}

}
