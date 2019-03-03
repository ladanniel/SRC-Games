package cn.demorecoverDay13;
/**英雄机设计第八天上午*/
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
		doubleFire = 0;          
		
		
	}//重写
	public void step(){        //public权限
		                                                        //System.out.println("英雄机切换图片啦！");
	}
	
	/**英雄机随着鼠标移动，x,y鼠标的xy坐标*/
	void moveTo(int x, int y){
		System.out.println("英雄机随着鼠标移动啦！");
		
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
	public Bullet[] shoot(){
		int xStep = this.width/4;                                      //1/4英雄机的宽
		int yStep = 20; 
		
		if (doubleFire>0) {                                            //但双倍火力判断//双倍火力，必须有返回值,火力在双翼
			Bullet[] bs =new Bullet[2];
			bs[0]=new Bullet(this.x+1*xStep,this.y-yStep);
			bs[1]=new Bullet(this.x+3*xStep,this.y-yStep);            //   3/4英雄机的宽（火力在双翼）
			doubleFire-=2;                                             //发射一次双倍火力，活力值减2
			return bs;
		}else{                                  
			
			Bullet[]bs= new Bullet[1];
			bs[0]=new Bullet(this.x+2*xStep,this.y-yStep);            //单倍火力,必须有返回值，火力在英雄机中间 
			
			return bs;
		}
		
	}

}
