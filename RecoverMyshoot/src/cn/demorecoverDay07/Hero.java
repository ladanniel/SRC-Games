package cn.demorecoverDay07;
/**英雄机设计第四天下午*/
public class Hero extends FlyingObject{
	
	int life;
	int doubleFire;
	/**构造法*/
	Hero(){
		super(97,124,150,400);
		life = 3;
		doubleFire = 0;
		
		
	}//重写
	void step(){
		System.out.println("英雄机切换图片啦！");
	}
	
	/**英雄机随着鼠标移动，x,y鼠标的xy坐标*/
	void moveTo(int x, int y){
		System.out.println("英雄机随着鼠标移动啦！");
		
	}

}
