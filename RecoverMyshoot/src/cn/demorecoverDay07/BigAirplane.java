package cn.demorecoverDay07;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;

public class BigAirplane extends FlyingObject {
	
	int speed;
	/**���취*/
	BigAirplane(){
		super(69,99);
                      //���Ĵ�л��ĸ�
		speed=2;
	}
	//��д
	void step(){
		System.out.println("��л���y�����ƶ�����"+speed);
	}

}
