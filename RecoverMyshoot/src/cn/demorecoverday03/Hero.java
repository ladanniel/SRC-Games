package cn.demorecoverday03;
/**Ӣ�ۻ���Ƶ�����*/
public class Hero {
	int width;
	int height;
	int x;
	int y;
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
	
	void step(){
		System.out.println("Ӣ�ۻ��л�ͼƬ����");
	}/**Ӣ�ۻ���������ƶ���x,y����xy����*/
	void moveTo(int x, int y){
		System.out.println("Ӣ�ۻ���������ƶ�����");
		
	}

}
