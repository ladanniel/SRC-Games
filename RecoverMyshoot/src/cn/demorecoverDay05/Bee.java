package cn.demorecoverDay05;
/**Ӣ�ۻ���Ƶ���������super*/
import java.util.Random;

public class Bee extends FlyingObject{
	int xSpeed;
	int ySpeed;
	int awardType;//��������
	/**���취*/
	Bee(){
		super(60,50);
		Random rand =new Random();
		xSpeed=1;
		ySpeed=2;
		awardType=rand.nextInt(2);//���ֽ������ͣ������о�д2�����м��ֽ�����д��
		
		
		
	}
	

}
