package cn.demorecoverday03;
/**Ӣ�ۻ���Ƶ�����*/
import java.util.Random;

public class Bullet {
	int width;
	int height;
	int x;
	int y;
	int speed;
	
	Bullet(int x,int y){              //�ӵ���λ�ò���д�̶���ֻ�ܴ��Σ������ӵ���xy��Ҫ�ò���������
		width=60;
		height=50;
		this.x=x;
		this.y=y;
		speed=3;
	
	}
	void step(){
		System.out.println("�ӵ���y�����ƶ�����"+speed);
	}

}
