package cn.demorecoverDay08;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;

public class BigAirplane extends FlyingObject {
	
	private int speed;
	/**���취*/
	BigAirplane(){
		super(69,99);
                      //���Ĵ�л��ĸ�
		speed=2;
	}
	//��д
	public void step(){                      //publicȨ��
		System.out.println("��л���y�����ƶ�����"+speed);
	}

}
