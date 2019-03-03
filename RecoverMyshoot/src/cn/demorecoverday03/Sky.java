package cn.demorecoverday03;
/**英雄机设计第三天*/
public class Sky {
	int width;
	int height;
	int x;
	int y;
	int speed;
	int y1;     
	
	Sky(){
		width = 400;
		height = 700;
		x = 0;
		y = 0;
		speed = 1;
		y1 = -700;
	}
	
	//用于两张图片切换
	void step(){
		System.out.println("天空的y和y1坐标移动啦！"+speed);
	}

}
