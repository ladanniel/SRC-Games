package cn.demorecoverday03;
/**Ӣ�ۻ���Ƶ�����*/
import java.util.Random;

public class BigAirplane {
	int width;
	int height;
	int x;
	int y;
	int speed;
	
	BigAirplane(){
		width=69;
		height=99;
		Random rand = new Random();
		x = rand.nextInt(400-this.width);        //x:0�������ڿ�-��л���֮�ڵ����������Ϊ��л���λ������������ģ�����û�й̶�������
		y = -this.height;                        //���Ĵ�л��ĸ�
		speed=2;
	}
	void step(){
		System.out.println("��л���y�����ƶ�����"+speed);
	}

}
