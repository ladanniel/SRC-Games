package cn.demorecoverDay16;
/**Ӣ�ۻ���Ƶ�ʮ������*/
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Timer;                                               //��ʱ��
import java.util.TimerTask;                                          //��ʱ����
import java.util.Random;
import java.util.Arrays;
import java.awt.event.MouseAdapter;                                  //���������
import java.awt.event.MouseEvent;
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
			enemies =Arrays.copyOf(enemies,enemies.length+1);        //��ȡ���˶������ݴ�һ������������ѭ����
			enemies[enemies.length-1]=obj;                                                 //��������ӵ����һ��Ԫ����,,����û���ֵ�ԭ�򣿶�������{}�ж���Ϊ0�����µ���paint��paintҪ������
				
		}
		
	}
	/**�ӵ��볡����*/
	int shootIndex=0; 
	/**�ӵ��볡��Ӣ�ۻ������ӵ���*/
	public void shootAction(){                                                            //ÿ10mm��һ��
		shootIndex++;
		if(shootIndex%30==0){                                                        //�����ӵ�����Ƶ��1.��ȡ�ӵ�����2.���ӵ�������ӵ�Bullet�����У������shoot��Ҫ����
			Bullet[] bs = hero.shoot();
			bullets=Arrays.copyOf(bullets,bullets.length+bs.length);                //�ӵ���˫���������ʱ�仯��ֵ��ʱ�仯,ֻ�����ݣ����ݺ���¿ռ�Ϊnull
			System.arraycopy(bs,0,bullets,bullets.length-bs.length,bs.length);          //�����׷�ӣ�Ҫ���null������Ҫ������ѭ������䣬���������ӵ�
		  
		
		}
		
	}
    public void stepAction(){                                                               //10mm��һ��
		sky.step();                                                   
		hero.step();
		
		for(int i=0;i<enemies.length;i++) {
			enemies[i].step();	
			
		}for(int i=0;i<bullets.length;i++){
			bullets[i].step();
		}
		
	}
   
    public void outOfBoundsAction(){                                                  //10mm��һ��
    	 int index =0;   //�±ꡢ����
    	 FlyingObject[] enemyLives=new FlyingObject[enemies.length];
    	for (int i = 0; i < enemies.length; i++) {
			FlyingObject f = enemies[i];
			if (!f.outOfBounds()) {                                   //��Խ��װ��һ��enemies�����У�***��Խ�����¸�Խ���ɾ����˼һ����������******                                            //Խ����
				   enemyLives[index]=f;                                                                   //��f��emeies��ɾ�������ݣ�Ч�ʵͣ�
				index++;
			}
		}
    	enemies = Arrays.copyOf(enemyLives, index);
    	 
    	index=0;  //�±ꡢ����
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
    	
    
   
    
 /**�ӵ��������ײ*/  
    int score=0;
    public void bulletBangAction(){                                                           //10mm��һ��//ÿ���ӵ������е��˵Ľ��жԱȣ������������ӵ�����Ƕ��ѭ�� 
	   
	  for (int i = 0; i < bullets.length; i++) {
		 Bullet b=bullets[i];
		 for (int j = 0; j < enemies.length; j++) {	 
		 FlyingObject f=enemies[j];
		if (b.isLife()&&f.isLife()&&f.hit(b)) {                                                          //ײ����
			b.goDead();                                                                                        //�ӵ�ȥ��
			f.goDead();                                                                                     //����ȥ��
			 if(f instanceof Enemy){
				 Enemy en =(Enemy)f;
				 score+=en.getScore();
		
			}
			 if (f instanceof Award) {
				 Award aw=(Award)f;
				 int type=aw.getAwardType();                                                          //��ȡ��������
				 switch(type){                                                                          //���ݽ������ͻ�ȡ��ͬ�Ľ�������
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
	
/**��������ִ��*/	
	public void action(){                                                                           //���Դ��룬ͼƬ׼���ú���world�е��ã�����֮ǰ��action�еĴ���ȫ��ɾ��
		MouseAdapter l= new MouseAdapter(){                                                         //����������,�����ڲ���
			public void mouseMoved(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				hero.moveTo(x,y);
				
			}
			
		
		}; 
		this.addMouseListener(l);                                                                    //�����������¼�
		this.addMouseMotionListener(l);                                                             //������껬���¼�
		Timer timer = new Timer();
		int intervel=10;                                                                           //�����볡���Ƕ�ʱ�����ģ��������ö�ʱ������ʱ������Ժ���Ϊ��λ��
		timer.schedule(new TimerTask(){
    public void run(){                                                                           //��ʱ����������
				enterAction();
				shootAction();
				bulletBangAction();                                                          
			    stepAction();
			    outOfBoundsAction();                                                             //Խ��ɾ��
			    
			    repaint();                                                                      //���˶���Ҫ����������paint����{}����һ����repaint,ϵͳ�Զ�����paint����{}����
				
    }                                                     
		},intervel,intervel);
	}

	public void paint(Graphics g){                                                            //��Ҫ���ö���11
		sky.paintObject(g);
		hero.paintObject(g);
		
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);                                                           //���˶�����Դ������
			
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);
			
		}
		g.drawString("SCORE"+score, 10, 25);
		g.drawString("LIFE"+hero.getLife(), 10,45);
		
	}

	public static void main(String[] args) {
		World world=new World();
		world.action();                                                                           //���������ִ��
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.add(world);

	}

}
