package cn.demorecoverday03;
/**Ӣ�ۻ���Ƶ�����*/
public class Sky {
	int width;
	int height;
	int x;
	int y;
	int speed;
	int y1;     
	
	Sky(){
		width = 400;
		height = 700;
		x = 0;
		y = 0;
		speed = 1;
		y1 = -700;
	}
	
	//��������ͼƬ�л�
	void step(){
		System.out.println("��յ�y��y1�����ƶ�����"+speed);
	}

}
