package cn.demorecoverday04;
/**Ӣ�ۻ���Ƶ���������*/
public class Hero extends FlyingObject{
	
	int life;
	int doubleFire;
	/**���취*/
	Hero(){
		width=97;
		height=124;
		x = 150;
		y =400;
		life = 3;
		doubleFire = 0;
		
		
	}
	
	/**Ӣ�ۻ���������ƶ���x,y����xy����*/
	void moveTo(int x, int y){
		System.out.println("Ӣ�ۻ���������ƶ�����");
		
	}

}
