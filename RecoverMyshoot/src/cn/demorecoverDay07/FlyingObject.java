package cn.demorecoverDay07;
/**��������������þ����ô������࣬�����Ը����ڵ��õ�ʱ���Լ������Լ���*/
import java.util.Random;

/**���࣬������super*��������ֵ����д����*/
public  class FlyingObject {
	int width;        //���в���
	int height;       //���в���
	int x;            //���в���
	int y;            //���в���
	/**ר�Ÿ�Ӣ�ۻ�����ա��ӵ��ṩ�Ĺ���*/
	FlyingObject(int width,int height,int x,int y){
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
	}

	/**ר�Ÿ�С�л�����л���С�۷��ṩ�Ĺ���*/
	FlyingObject(int width,int height){
		this.width=width ;
		this.height=height;
		Random rand = new Random();
		x=rand.nextInt(400-this.width);      //x:0�������ڿ�-С�л���֮�ڵ����������ΪС�л����������������������û�й̶���x����
		y=-this.height;                       //����С�л��ĸ�
		
		
	}
	/**ר�Ÿ�С�л�����л���С�۷��ṩ�Ĺ���*/
	void step(){
		System.out.println("�������ƶ�����");
	}
	

}
