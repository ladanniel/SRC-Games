package cn.demorecoverDay05;
/**Ӣ�ۻ���Ƶ���������super*/
public class Hero extends FlyingObject{
	
	int life;
	int doubleFire;
	/**���취*/
	Hero(){
		super(97,124,150,400);
		life = 3;
		doubleFire = 0;
		
		
	}
	
	/**Ӣ�ۻ���������ƶ���x,y����xy����*/
	void moveTo(int x, int y){
		System.out.println("Ӣ�ۻ���������ƶ�����");
		
	}

}
