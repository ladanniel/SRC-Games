package cn.demorecoverDay07;
/**Ӣ�ۻ���Ƶ���������*/
public class Hero extends FlyingObject{
	
	int life;
	int doubleFire;
	/**���취*/
	Hero(){
		super(97,124,150,400);
		life = 3;
		doubleFire = 0;
		
		
	}//��д
	void step(){
		System.out.println("Ӣ�ۻ��л�ͼƬ����");
	}
	
	/**Ӣ�ۻ���������ƶ���x,y����xy����*/
	void moveTo(int x, int y){
		System.out.println("Ӣ�ۻ���������ƶ�����");
		
	}

}
