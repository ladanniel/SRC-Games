package cn.demorecoverday03;
/**Ӣ�ۻ���Ƶ�����*/
import java.util.Random;
public class Airplane {
	int width;
	int height;
	int x;
	int y;
	int speed;
	
	Airplane(){
		width = 49;
		height = 36;
		Random rand = new Random();
		x=rand.nextInt(400-this.width);      //x:0�������ڿ�-С�л���֮�ڵ����������ΪС�л����������������������û�й̶���x����
		y=-this.height;                       //����С�л��ĸ�
		speed=2;
	}
	void step(){
		System.out.println("С�л���y�����ƶ�����"+speed);
	}

}
