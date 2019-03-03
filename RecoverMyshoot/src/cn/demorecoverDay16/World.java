package cn.demorecoverDay16;
/**英雄机设计第十天上午*/
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;                                               //定时器
import java.util.TimerTask;                                          //定时任务
import java.util.Random;
import java.util.Arrays;
import java.awt.event.MouseAdapter;                                  //鼠标侦听器
import java.awt.event.MouseEvent;
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
			enemies =Arrays.copyOf(enemies,enemies.length+1);        //获取敌人对象，扩容大一个容量。类似循环，
			enemies[enemies.length-1]=obj;                                                 //将敌人添加到最后一个元素上,,敌人没出现的原因？顶上数组{}中对象为0，重新调用paint，paint要反复画
				
		}
		
	}
	/**子弹入场计数*/
	int shootIndex=0; 
	/**子弹入场（英雄机发射子弹）*/
	public void shootAction(){                                                            //每10mm走一次
		shootIndex++;
		if(shootIndex%30==0){                                                        //控制子弹发射频率1.获取子弹对象，2.将子弹对象添加到Bullet数组中，向调用shoot需要接收
			Bullet[] bs = hero.shoot();
			bullets=Arrays.copyOf(bullets,bullets.length+bs.length);                //子弹单双倍或火力随时变化，值随时变化,只是扩容，扩容后的新空间为null
			System.arraycopy(bs,0,bullets,bullets.length-bs.length,bs.length);          //数组的追加，要填充null，就需要后边这句循环的语句，才能生成子弹
		  
		
		}
		
	}
    public void stepAction(){                                                               //10mm走一次
		sky.step();                                                   
		hero.step();
		
		for(int i=0;i<enemies.length;i++) {
			enemies[i].step();	
			
		}for(int i=0;i<bullets.length;i++){
			bullets[i].step();
		}
		
	}
   
    public void outOfBoundsAction(){                                                  //10mm走一次
    	 int index =0;   //下标、个数
    	 FlyingObject[] enemyLives=new FlyingObject[enemies.length];
    	for (int i = 0; i < enemies.length; i++) {
			FlyingObject f = enemies[i];
			if (!f.outOfBounds()) {                                   //不越界装在一个enemies数组中，***不越界留下跟越界的删除意思一样？？？？******                                            //越界了
				   enemyLives[index]=f;                                                                   //将f从emeies中删除（缩容）效率低，
				index++;
			}
		}
    	enemies = Arrays.copyOf(enemyLives, index);
    	 
    	index=0;  //下标、个数
    	Bullet[] bulletLives=new Bullet[bullets.length];
    	for (int i = 0; i < bullets.length; i++) {
			Bullet t =bullets[i];
			if(!t.outOfBounds()){
				bulletLives[index]=t;
				index++;
			}	
		}
    	 bullets = Arrays.copyOf(bulletLives,index);
    }
    	
    
   
    
 /**子弹与敌人碰撞*/  
    int score=0;
    public void bulletBangAction(){                                                           //10mm走一次//每个子弹与所有敌人的进行对比（遍历敌人与子弹），嵌套循环 
	   
	  for (int i = 0; i < bullets.length; i++) {
		 Bullet b=bullets[i];
		 for (int j = 0; j < enemies.length; j++) {	 
		 FlyingObject f=enemies[j];
		if (b.isLife()&&f.isLife()&&f.hit(b)) {                                                          //撞上了
			b.goDead();                                                                                        //子弹去死
			f.goDead();                                                                                     //敌人去死
			 if(f instanceof Enemy){
				 Enemy en =(Enemy)f;
				 score+=en.getScore();
		
			}
			 if (f instanceof Award) {
				 Award aw=(Award)f;
				 int type=aw.getAwardType();                                                          //获取奖励类型
				 switch(type){                                                                          //根据奖励类型获取不同的奖励类型
				 case Award.DOUBLE_Fire:
					 hero.addDoublieFire();
				 break;
				 case Award.LIFE:
					 hero.addLife();
					 break;
				 }
				 
				
			}
			
		}
		
		
		} 
		
	}                                                                                      
  }  
	
/**启动程序执行*/	
	public void action(){                                                                           //测试代码，图片准备好后，在world中调用，调用之前把action中的代码全部删除
		MouseAdapter l= new MouseAdapter(){                                                         //创建侦听器,匿名内部类
			public void mouseMoved(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				hero.moveTo(x,y);
				
			}
			
		
		}; 
		this.addMouseListener(l);                                                                    //处理鼠标操作事件
		this.addMouseMotionListener(l);                                                             //处理鼠标滑动事件
		Timer timer = new Timer();
		int intervel=10;                                                                           //敌人入场，是定时发生的，所以设置定时器，定时间隔，以毫秒为单位，
		timer.schedule(new TimerTask(){
    public void run(){                                                                           //定时器做的事情
				enterAction();
				shootAction();
				bulletBangAction();                                                          
			    stepAction();
			    outOfBoundsAction();                                                             //越界删除
			    
			    repaint();                                                                      //敌人对象要反复画调用paint（）{}方法一旦用repaint,系统自动调用paint（）{}工具
				
    }                                                     
		},intervel,intervel);
	}

	public void paint(Graphics g){                                                            //需要调用对象11
		sky.paintObject(g);
		hero.paintObject(g);
		
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);                                                           //敌人对象来源于数组
			
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);
			
		}
		g.drawString("SCORE"+score, 10, 25);
		g.drawString("LIFE"+hero.getLife(), 10,45);
		
	}

	public static void main(String[] args) {
		World world=new World();
		world.action();                                                                           //启动程序的执行
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.add(world);

	}

}
