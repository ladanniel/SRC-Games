package cn.demorecoverday04;
/**Ӣ�ۻ���Ƶ���������*/
import java.util.Random;
public class Airplane extends FlyingObject{
	
	int speed;
	/**���췽��*/
	Airplane(){
		width = 49;
		height = 36;
		Random rand = new Random();
		x=rand.nextInt(400-this.width);      //x:0�������ڿ�-С�л���֮�ڵ����������ΪС�л����������������������û�й̶���x����
		y=-this.width;                       //����С�л��ĸ�
		speed=2;
	}

}
