package cn.demorecoverday04;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;

public class Bullet extends FlyingObject{
	
	int speed;
	/**���취*/
	Bullet(int x,int y){              //�ӵ���λ�ò���д�̶���ֻ�ܴ��Σ������ӵ���xy��Ҫ�ò���������
		width=60;
		height=50;
		this.x=x;
		this.y=y;
		speed=3;
	
	}
	
}
