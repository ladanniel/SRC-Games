package cn.demorecoverDay02;
/**整个世界设计第二天*/
/*代码大量重复，的解决办法就是写构造；
 * */
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
	
	void action(){ //测试代码
		sky=new Sky();             //new的过程就是在调用构造的过程，
		hero=new Hero();
		a1=new Airplane();
		a2=new Airplane();
		b1=new Bee();
		b2=new Bee();
		ba1=new BigAirplane();
		ba2=new BigAirplane();
		bt1=new Bullet(100,200);
		bt2=new Bullet(20,50);
		System.out.println("英雄机的宽:"+hero.width+",英雄机的高:"+hero.height+",英雄机的x:"+hero.x+",英雄机的y:"+hero.y+",英雄机的命:"+hero.life+",英雄机的活力值:"+hero.doubleFire);
		System.out.println("小敌机的宽:"+a1.width+",小敌机的高:"+a1.height+",小敌机的x:"+a1.x+",小敌机的y:"+a1.y+",小敌机的速度:"+a1.speed);
		System.out.println("小敌机的宽:"+a2.width+",小敌机的高:"+a2.height+",小敌机的x:"+a2.x+",小敌机的y:"+a2.y+",小敌机的速度:"+a2.speed);
		System.out.println("小蜜蜂的宽:"+b1.width+",小蜜蜂的高:"+b1.height+",小蜜蜂的x:"+b1.x+",小蜜蜂的y:"+b1.y+",小蜜蜂的速度:"+b1.xSpeed+",小蜜蜂的速度:"+b1.ySpeed+"，小蜜蜂的奖励："+b1.awardType);
		System.out.println("小蜜蜂的宽:"+b2.width+",小蜜蜂的高:"+b2.height+",小蜜蜂的x:"+b2.x+",小蜜蜂的y:"+b2.y+",小蜜蜂的速度:"+b2.xSpeed+",小蜜蜂的速度:"+b2.ySpeed+"，小蜜蜂的奖励："+b2.awardType);
		System.out.println("大敌机的宽:"+ba1.width+",大敌机的高:"+ba1.height+",大敌机的x:"+ba1.x+",大敌机的y:"+ba1.y+",大敌机的速度:"+ba1.speed);
		System.out.println("大敌机的宽:"+ba1.width+",大敌机的高:"+ba2.height+",大敌机的x:"+ba2.x+",大敌机的y:"+ba2.y+",大敌机的速度:"+ba2.speed);
		System.out.println("子弹的宽:"+bt1.width+",子弹的高:"+bt1.height+",子弹的x:"+bt1.x+",子弹的y:"+bt1.y+",子弹的速度:"+bt1.speed);
		System.out.println("子弹的宽:"+bt2.width+",子弹的高:"+bt2.height+",子弹的x:"+bt2.x+",子弹的y:"+bt2.y+",子弹的速度:"+bt2.speed);
		//代码大量重复，方法见第三天
		
	}
		
	
	

	public static void main(String[] args) {
		World world = new World();
		world.action();

	}

}
