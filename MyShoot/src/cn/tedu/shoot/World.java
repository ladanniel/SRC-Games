package cn.tedu.shoot;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.Arrays;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
/** �������� */
public class World extends JPanel { //����
	public static final int WIDTH = 400;  //���ڿ�
	public static final int HEIGHT = 700; //���ڸ�
	public static final int START=0;// ����״̬
	public static final int RUNNING=1;//����״̬
	public static final int PAUSE=2;//��ͣ״̬
	public static final int GAME_OVER=3;//��Ϸ����
	public  int state=START;//��ǰ״̬��Ĭ��״̬��
	
	private static BufferedImage start;//����ͼ
	private static BufferedImage pause;//��ͣͼ
	private static BufferedImage gameover;//��Ϸ����ͼ
	static{
		start=FlyingObject.loadImage("start.png");
		pause=FlyingObject.loadImage("pause.png");
		gameover=FlyingObject.loadImage("gameover.png");
	}
	
	private Sky sky = new Sky();    //��ն���
	private Hero hero = new Hero(); //Ӣ�ۻ�����
	private FlyingObject[] enemies = {}; //����(С�л�����л���С�۷�)����
	private Bullet[] bullets = {}; //�ӵ�����
	
	/** ���ɵ���(С�л�����л���С�۷�)���� */
	public FlyingObject nextOne(){
		Random rand = new Random(); //���������
		int type = rand.nextInt(20); //0��19֮��
		if(type<4){ //0��3ʱ������С�۷����
			return new Bee();
		}else if(type<12){ //4��11ʱ������С�л�����
			return new Airplane();
		}else{ //12��19ʱ�����ɴ�л�����
			return new BigAirplane();
		}
	}
	
	int enterIndex = 0; //�����볡����
	/** ����(С�л�����л���С�۷�)�볡 */
	public void enterAction(){ //10������һ��
		enterIndex++; //ÿ10������1
		if(enterIndex%40==0){ //ÿ400(10*40)������һ��
			FlyingObject obj = nextOne(); //��ȡ���˶���
			enemies = Arrays.copyOf(enemies,enemies.length+1); //����
			enemies[enemies.length-1] = obj; //��������ӵ�enemies�����һ��Ԫ����
		}
	}
	
	int shootIndex = 0; //�ӵ��볡����
	/** �ӵ��볡(Ӣ�ۻ������ӵ�) */
	public void shootAction(){ //10������һ��
		shootIndex++; //ÿ10������1
		if(shootIndex%30==0){ //ÿ300(30*10)������һ��
			Bullet[] bs = hero.shoot(); //��ȡ�ӵ�����(Ӣ�ۻ����������)
			bullets = Arrays.copyOf(bullets,bullets.length+bs.length); //����(bs�м���Ԫ�ؾ����󼸸�����)
			System.arraycopy(bs,0,bullets,bullets.length-bs.length,bs.length); //�����׷��
		}
	}
	
	/** �������ƶ� */
	public void stepAction(){ //10������һ��
		sky.step();  //����ƶ�
		hero.step(); //Ӣ�ۻ��ƶ�
		for(int i=0;i<enemies.length;i++){ //�������е���
			enemies[i].step(); //�����ƶ�
		}
		for(int i=0;i<bullets.length;i++){ //���������ӵ�
			bullets[i].step(); //�ӵ��ƶ�
		}
	}
	
	/** ɾ��Խ��ķ����� */
	public void outOfBoundsAction(){ //10������һ��
		int index = 0; //1)��Խ����������±�  2)��Խ����˸���
		FlyingObject[] enemyLives = new FlyingObject[enemies.length]; //��Խ���������
		for(int i=0;i<enemies.length;i++){ //������������
			FlyingObject f = enemies[i]; //��ȡÿһ������
			if(!f.outOfBounds()){ //��Խ��
				enemyLives[index] = f; //����Խ�������ӵ���Խ�����������
				index++; //1)��Խ����������±���һ  2)��Խ����˸�����һ
			}
		}
		enemies = Arrays.copyOf(enemyLives,index); //����Խ��������鸴�Ƶ�enemies�У�enemies�ĳ���Ϊindex
		
		index = 0; //1)��Խ���ӵ������±�  2)��Խ���ӵ�����
		Bullet[] bulletLives = new Bullet[bullets.length]; //��Խ���ӵ�����
		for(int i=0;i<bullets.length;i++){ //�����ӵ�����
			Bullet b = bullets[i]; //��ȡÿһ���ӵ�
			if(!b.outOfBounds()){ //��Խ��
				bulletLives[index] = b; //����Խ���ӵ���ӵ���Խ���ӵ�������
				index++; //1)��Խ���ӵ������±���һ  2)��Խ���ӵ�������һ
			}
		}
		bullets = Arrays.copyOf(bulletLives,index); //����Խ���ӵ����鸴�Ƶ�bullets�У�bullets�ĳ���Ϊindex
		
	}
	
	int score=0;//��ҵĵ÷�
	/** �ӵ��͵���ײ���� */
	public void bulletBangAction(){//10������һ��
		for(int i=0;i<bullets.length;i++){//���������ӵ�
			Bullet b=bullets[i];//��ȡÿһ���ӵ�
			for(int j=0;j<enemies.length;j++){//�������е���
				FlyingObject f=enemies[j];//��ȡÿһ������
				
				if(b.isLife()&&f.isLife()&&f.hit(b)){//ײ����
					b.goDead();//�ӵ�ȥ��
					f.goDead();//����ȥ��
					if(f instanceof Enemy){
						Enemy en =(Enemy)f;
						score+= en.getScore();//��ҵ÷�
					}
					if(f instanceof Award){//����ײ����Ϊ����
						Award aw=(Award)f;//������ǿתΪ�����ӿ�
						int type=aw.getAwardType();//��ȡ��������
						switch(type){//���ݽ������ͻ�ȡ��ͬ�Ľ���
						case Award.DOUBLE_FIRE://��������Ϊ����ֵ
							hero.addDoubleFier();//��Ӣ�ۻ����˫������ֵ
							break;
						case Award.LIFE://��������Ϊ��
							hero.addLife();//��Ӣ�ۻ�����
							break;
						}
					}
				}
				
			}
		}
		
	}
	/** Ӣ�ۻ��͵���ײ����*/
	public void heroBangAction(){
		for(int i=0;i<enemies.length;i++){
			FlyingObject f = enemies[i];
			if(f.isLife() && hero.isLife()&& f.hit(hero)){
				f.goDead();
				hero.subtractLife();//Ӣ�ۻ�����
				hero.clearDoubleFire();//Ӣ�ۻ���ջ���ֵ
			}
		}
	}
	public void chenkGameOverAction(){//10������һ��
		if(hero.getLife()<=0){//��Ϸ����
			state=GAME_OVER;//��Ϸ����ͼ
			
		}
		
	}
	/** ���������ִ�� */
	public void action(){
		//��������������
		MouseAdapter l = new MouseAdapter(){
			/** ��дmouseMoved()����ƶ��¼� */
			public void mouseMoved(MouseEvent e){
				if(state==RUNNING){
					int x = e.getX(); //��ȡ����x����
					int y = e.getY(); //��ȡ����y����
					hero.moveTo(x, y); //Ӣ�ۻ���������ƶ�
				}
				
			}
			/**  ��д������¼�*/
			public void mouseClicked(MouseEvent e){
				switch(state){//���ݵ�ǰ״̬����ͬ����
				case START://����ʱ״̬
					state=RUNNING;//����ǰ״̬�޸�Ϊ����״̬
					break;
				case GAME_OVER://��Ϸ����ʱ״̬
					score=0;//�����ֳ�
					sky= new Sky();
					hero=new Hero();
					enemies=new FlyingObject[0];
					bullets=new Bullet[0];
					state=START;// ����ǰ״̬�޸�Ϊ����״̬
					break;
				}
			}
			/**  ��д������¼�*/
			public void mouseExited(MouseEvent e){
				if(state==RUNNING){//����״̬ʱ
					state=PAUSE;//��״̬��Ϊ��ͣ״̬
					
				}
				
			}
			/**  ��д������¼�*/
			public void mouseEntered(MouseEvent e){
				if(state==PAUSE){//��ͣ״̬ʱ
					state=RUNNING;//�޸�Ϊ����״̬
					
				}
			}
		};
		this.addMouseListener(l);       //�����������¼�
		this.addMouseMotionListener(l); //������껬���¼�
		
		Timer timer = new Timer(); //��ʱ������
		int intervel = 10; //��ʱ���(�Ժ���Ϊ��λ)
		timer.schedule(new TimerTask(){
			public void run(){ //��ʱ�ɵ��Ǹ���--ÿ10������һ��
				if(state==RUNNING){
					enterAction(); //����(С�л�����л���С�۷�)�볡
					shootAction(); //�ӵ��볡(Ӣ�ۻ������ӵ�)
					stepAction();  //�������ƶ�
					outOfBoundsAction(); //ɾ��Խ��ķ�����
					bulletBangAction();
					heroBangAction();
					chenkGameOverAction();
				}
				repaint();     //�ػ�(����paint()����)
			}
		},intervel,intervel); //��ʱ�ƻ�
	}
	
	/** ��дpaint()��   g:���� */
	public void paint(Graphics g){
		sky.paintObject(g);  //�����
		hero.paintObject(g); //��Ӣ�ۻ�
		for(int i=0;i<enemies.length;i++){ //�������е���
			enemies[i].paintObject(g); //������
		}
		for(int i=0;i<bullets.length;i++){ //���������ӵ�
			bullets[i].paintObject(g); //���ӵ�
		}
		g.drawString("SCORE��"+score,10,25);//����
		g.drawString("LIFE��"+hero.getLife(),10,45);//����
		switch(state){
		case START://����״̬
			g.drawImage(start,0,0,null);
			break;
		case PAUSE://��ͣ״̬
			g.drawImage(pause,0,0,null);
			break;
		case GAME_OVER://��Ϸ����
			g.drawImage(gameover,0,0,null);
			break;
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(); //����
		World world = new World();   //���
		frame.add(world); //�������ӵ�������
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ùرմ���ʱ�˳�����
		frame.setSize(WIDTH,HEIGHT); //���ô��ڵĿ�͸�
		frame.setLocationRelativeTo(null); //���þ�����ʾ
		frame.setVisible(true); //1)���ô��ڿɼ�   2)�������paint()����
		
		world.action(); //���������ִ��
	}

}
