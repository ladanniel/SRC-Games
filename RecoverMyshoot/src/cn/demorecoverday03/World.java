package cn.demorecoverday03;
/**��������*/ /**Ӣ�ۻ���Ƶ�����*/
/*��������ظ����Ľ���취���ǽ������飬�������������ͬ�߼���أ��Ͳ������飻
 * */
public class World {
	Sky sky;
	Hero hero;
	Airplane[]as;
	BigAirplane[]bas;
	Bee[]bs;
	Bullet[]bts;
	
	void action(){ //���Դ���
		as = new Airplane[3];
		as[0]=new Airplane();
		as[1]=new Airplane();
		as[2]=new Airplane();
		for (int i = 0; i < as.length; i++) {
//			System.out.println(as[i].x+","+as[i].y);
			as[i].step();
		}
		
		
	}
		
	
	

	public static void main(String[] args) {
		World world = new World();
		world.action();

	}

}
