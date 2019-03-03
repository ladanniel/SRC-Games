package day0009;
/**英雄机设计第九天上午*/
import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
	private static BufferedImage []images;
	static{
		images=new BufferedImage[2];
	for (int i = 0; i < images.length; i++) {
		images[i]=loadImage("hero"+i+".png");
	}
		
	}
	private int life;
	private int doubleFire;
	/**构造法*/
	Hero(){
		super(97,124,150,400);
		life = 3;
		doubleFire = 6;          
		
		
	}
	
	/**英雄机随着鼠标移动，x,y鼠标的xy坐标*/
	void moveTo(int x, int y){
		
		this.x = x-this.width/2;                                                //英雄机的x =鼠标的x
		this.y =y-this.height/2;                                               //英雄机的Y =鼠标的Y
		
	}
	//重写
		public void step(){                                                //public权限
			                                                                          //System.out.println("英雄机切换图片啦！");
		}
	int index=0;
	/**重写获取图片*/
	public BufferedImage getImage(){
		if(isLife()){
			
			return images[index++%2];
		}else if(isDead()){
			
			state=REMOVE;                                               //将状态修改为删除状态
		}
			return null;
	}
	/**英雄机发射子弹（生成子弹对象）有返回值Bullet,子弹有单倍双倍火力采用数组*/
	public Bullet[] shoot(){                                                           //Bullet[]有返回值类型
		int xStep = this.width/4;
		int yStep = 20;
		if(doubleFire>0){
			Bullet[]bs = new Bullet[3];
			bs[0]=new Bullet(this.x+1*xStep,this.y-yStep);
			bs[1]=new Bullet(this.x+3*xStep,this.y-yStep);
			bs[2]=new Bullet(this.x+2*xStep,this.y-yStep);
			doubleFire-=2;
			return bs;
			
		}else{
			Bullet[]bs=new Bullet[1];
			bs[0]=new Bullet(this.x+2*xStep,this.y-yStep);
			return bs;
		}
	}
	
	/**重写检测飞行物是否越界*/
	public boolean outOfBounds(){
		return false;                                                           //英雄机永不越界
	}
	public void addLife(){
		life++;
	}
	public void addDoubleFire(){
		doubleFire+=40;
		
	}
	public int getLife(){
		return life;
	}
	public void clearDoubleFire(){
		doubleFire=0;
	}
	public int subLife(){
		return life--;
	}

}
