package cn.demorecoverDay08;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;
public class Airplane extends FlyingObject{
	
	 private int speed;
	/**���췽��*/
	Airplane(){
		super(49,36);
		speed=2;
	}
	//��д
	public void step(){     //publicȨ��
		System.out.println("С�л���y�����ƶ�����"+speed);
	}

}
