package cn.demorecoverDay10;

import java.awt.image.BufferedImage;

/**Ӣ�ۻ���Ƶ���������*/
public class Hero extends FlyingObject{
	private static BufferedImage []images;
	static{
		images=new BufferedImage[2];
	for (int i = 0; i < images.length; i++) {
		images[i]=loadImage("hero"+i+".png");
	}
		
	}
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
