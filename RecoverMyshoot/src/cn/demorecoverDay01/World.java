package cn.demorecoverDay01;
/**整个世界*/
public class World {
	Sky sky;
	Hero hero;
	Airplane a1;
	Airplane a2;
	Bullet bt1;
	Bullet bt2;
	Bee b1;
	Bee b2;
	BigAirplane ba1;
	BigAirplane ba2;
	
	void action(){//测试代码
		sky = new Sky();
		sky.width=400;
		sky.height=700;
		sky.x=0;
		sky.y=0;
		sky.y1=-700;
		sky.speed=1;
		sky.step();
		
		hero = new Hero();
		hero.width=97;
		hero.height=124;
		hero.x=150;
		hero.y=400;
		hero.life=3;
		hero.doubleFire=0;
		hero.step();
		hero.moveTo(100, 200);
		
		a1=new Airplane();
		a1.width=49;
		a1.height=36;
		a1.x=38;
		a1.y=200;
		a1.speed=2;
		a1.step();
		
		a2=new Airplane();
		a2.width=49;
		a2.height=36;
		a2.x=38;
		a2.y=200;
		a2.speed=2;
		a2.step();
		
		ba1=new BigAirplane();
		ba1.width=69;
		ba1.height=99;
		ba1.x=38;
		ba1.y=200;
		ba1.speed=2;
		ba1.step();
		
		ba2=new BigAirplane();
		ba2.width=69;
		ba2.height=99;
		ba2.x=38;
		ba2.y=200;
		ba2.speed=2;
		ba2.step();
		
		bt1=new Bullet();
		bt1.width=8;
		bt1.height=14;
		bt1.x=0;
		bt1.y=2;
		bt1.speed=2;
		bt1.step();
		
		bt2=new Bullet();
		bt2.width=8;
		bt2.height=14;
		bt2.x=0;
		bt2.y=2;
		bt2.speed=2;
		bt2.step();
		
		b1=new Bee();
		b1.width=60;
		b1.height=50;
		b1.x=0;
		b1.y=0;
		b1.xSpeed=20;
		b1.ySpeed=30;
		b1.step();
		
		b2=new Bee();
		b2.width=60;
		b2.height=50;
		b2.x=0;
		b2.y=0;
		b2.xSpeed=20;
		b2.ySpeed=30;
		b2.step();
		
		
	}
		
	
	

	public static void main(String[] args) {
		World world = new World();
		world.action();

	}

}
