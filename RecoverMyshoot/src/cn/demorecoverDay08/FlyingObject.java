package cn.demorecoverDay08;
/**��������������þ����ô������࣬�����Ը����ڵ��õ�ʱ���Լ������Լ���*/
import java.util.Random;

/**���࣬������super*��������ֵ����д����*/
public class FlyingObject {               //�������������ò���private������protected���ɣ������л���Ҫ�õ��˴�������
	protected int width;        //���в���
	protected int height;       //���в���
	protected int x;            //���в���
	protected int y;            //���в���
	/**ר�Ÿ�Ӣ�ۻ�����ա��ӵ��ṩ�Ĺ���*/
	public FlyingObject(int width,int height,int x,int y){
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
	}

	/**ר�Ÿ�С�л�����л���С�۷��ṩ�Ĺ���*/
	public FlyingObject(int width,int height){
		this.width=width ;
		this.height=height;
		Random rand = new Random();
		x=rand.nextInt(400-this.width);      //x:0�������ڿ�-С�л���֮�ڵ����������ΪС�л����������������������û�й̶���x����
		y=-this.width;                       //����С�л��ĸ�
		
		
	}
	/**ר�Ÿ�С�л�����л���С�۷��ṩ�Ĺ���*/
	public void step(){
		System.out.println("�������ƶ�����");
	}

}
