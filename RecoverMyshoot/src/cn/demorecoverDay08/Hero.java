package cn.demorecoverDay08;
/**Ӣ�ۻ���Ƶ���������*/
public class Hero extends FlyingObject{
	
	private int life;
	private int doubleFire;
	/**���취*/
	Hero(){
		super(97,124,150,400);
		life = 3;
		doubleFire = 0;
		
		
	}//��д
	public void step(){        //publicȨ��
		System.out.println("Ӣ�ۻ��л�ͼƬ����");
	}
	
	/**Ӣ�ۻ���������ƶ���x,y����xy����*/
	void moveTo(int x, int y){
		System.out.println("Ӣ�ۻ���������ƶ�����");
		
	}

}
