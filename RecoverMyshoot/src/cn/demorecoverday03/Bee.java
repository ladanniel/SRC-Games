package cn.demorecoverday03;
/**Ӣ�ۻ���Ƶ�����*/
import java.util.Random;

public class Bee {
	int width;
	int height;
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	int awardType;//��������
	
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
	void step(){
		System.out.println("С�۷��x��������"+xSpeed+",С�۷��y�����ƶ���"+ySpeed);
	}

}
