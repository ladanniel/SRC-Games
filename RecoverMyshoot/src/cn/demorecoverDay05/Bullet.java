package cn.demorecoverDay05;
/**Ӣ�ۻ���Ƶ���������super*/
import java.util.Random;

public class Bullet extends FlyingObject{
	
	int speed;
	/**���취*/
	Bullet(int x,int y){              //�ӵ���λ�ò���д�̶���ֻ�ܴ��Σ������ӵ���xy��Ҫ�ò���������
		super(8,14,x,y);
		speed=3;
	
	}
	
}
