package cn.demorecoverDay07;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;
public class Airplane extends FlyingObject{
	
	int speed;
	/**���췽��*/
	Airplane(){
		super(49,36);
		speed=2;
	}
	//��д
	void step(){
		System.out.println("С�л���y�����ƶ�����"+speed);
	}

}
