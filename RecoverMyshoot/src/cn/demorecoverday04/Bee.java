package cn.demorecoverday04;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;

public class Bee extends FlyingObject{
	int xSpeed;
	int ySpeed;
	int awardType;//��������
	/**���취*/
	Bee(){
		width=60;
		height=50;
		Random rand =new Random();
		x=rand.nextInt(400-this.width);
		y=-this.height;
		xSpeed=1;
		ySpeed=2;
		awardType=rand.nextInt(2);//���ֽ������ͣ������о�д2�����м��ֽ�����д��
		
		
		
	}
	

}
