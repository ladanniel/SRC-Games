package cn.demorecoverday04;
/**英雄机设计第三天下午*/
public class Hero extends FlyingObject{
	
	int life;
	int doubleFire;
	/**构造法*/
	Hero(){
		width=97;
		height=124;
		x = 150;
		y =400;
		life = 3;
		doubleFire = 0;
		
		
	}
	
	/**英雄机随着鼠标移动，x,y鼠标的xy坐标*/
	void moveTo(int x, int y){
		System.out.println("英雄机随着鼠标移动啦！");
		
	}

}
