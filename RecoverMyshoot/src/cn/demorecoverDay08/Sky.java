package cn.demorecoverDay08;
/**Ӣ�ۻ���Ƶ���������*/
public class Sky extends FlyingObject{
	
	private int speed;
	private int y1;     
	/**���취*/
	Sky(){
		super(400,700,0,0);
	
		speed = 1;
		y1 = -700;
	}//��д
	public void step(){   //publicȨ��
		System.out.println("��յ�y��y1�����ƶ�����"+speed);
	}
	//��������ͼƬ�л�
	

}
