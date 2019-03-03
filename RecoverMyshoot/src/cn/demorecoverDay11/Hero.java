package cn.demorecoverDay11;
/**英雄机设计第六天下午*/
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
		System.out.println("英雄机切换图片啦！");
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
			state=REMOVE; //将状态修改为删除状态
		}
			return null;
	}

}
