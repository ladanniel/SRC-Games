package cn.demorecoverDay08;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;

public class Bee extends FlyingObject{
	private int xSpeed;
	private int ySpeed;
	private int awardType;//��������
	/**���취*/
	Bee(){
		super(60,50);
		Random rand =new Random();
		xSpeed=1;
		ySpeed=2;
		awardType=rand.nextInt(2);//���ֽ������ͣ������о�д2�����м��ֽ�����д��
		
		
		
	}//��д
	public void step(){           //publicȨ��
		System.out.println("С�۷��x�����ƶ�������"+xSpeed+",С�۷��x�����ƶ�������"+ySpeed);
	}
	

}
