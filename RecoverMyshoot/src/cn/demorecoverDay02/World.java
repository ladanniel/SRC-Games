package cn.demorecoverDay02;
/**����������Ƶڶ���*/
/*��������ظ����Ľ���취����д���죻
 * */
public class World {
	Sky sky;
	Hero hero;
	Airplane a1;
	Airplane a2;
	Bullet bt1;
	Bullet bt2;
	Bee b1;
	Bee b2;
	BigAirplane ba1;
	BigAirplane ba2;
	
	void action(){ //���Դ���
		sky=new Sky();             //new�Ĺ��̾����ڵ��ù���Ĺ��̣�
		hero=new Hero();
		a1=new Airplane();
		a2=new Airplane();
		b1=new Bee();
		b2=new Bee();
		ba1=new BigAirplane();
		ba2=new BigAirplane();
		bt1=new Bullet(100,200);
		bt2=new Bullet(20,50);
		System.out.println("Ӣ�ۻ��Ŀ�:"+hero.width+",Ӣ�ۻ��ĸ�:"+hero.height+",Ӣ�ۻ���x:"+hero.x+",Ӣ�ۻ���y:"+hero.y+",Ӣ�ۻ�����:"+hero.life+",Ӣ�ۻ��Ļ���ֵ:"+hero.doubleFire);
		System.out.println("С�л��Ŀ�:"+a1.width+",С�л��ĸ�:"+a1.height+",С�л���x:"+a1.x+",С�л���y:"+a1.y+",С�л����ٶ�:"+a1.speed);
		System.out.println("С�л��Ŀ�:"+a2.width+",С�л��ĸ�:"+a2.height+",С�л���x:"+a2.x+",С�л���y:"+a2.y+",С�л����ٶ�:"+a2.speed);
		System.out.println("С�۷�Ŀ�:"+b1.width+",С�۷�ĸ�:"+b1.height+",С�۷��x:"+b1.x+",С�۷��y:"+b1.y+",С�۷���ٶ�:"+b1.xSpeed+",С�۷���ٶ�:"+b1.ySpeed+"��С�۷�Ľ�����"+b1.awardType);
		System.out.println("С�۷�Ŀ�:"+b2.width+",С�۷�ĸ�:"+b2.height+",С�۷��x:"+b2.x+",С�۷��y:"+b2.y+",С�۷���ٶ�:"+b2.xSpeed+",С�۷���ٶ�:"+b2.ySpeed+"��С�۷�Ľ�����"+b2.awardType);
		System.out.println("��л��Ŀ�:"+ba1.width+",��л��ĸ�:"+ba1.height+",��л���x:"+ba1.x+",��л���y:"+ba1.y+",��л����ٶ�:"+ba1.speed);
		System.out.println("��л��Ŀ�:"+ba1.width+",��л��ĸ�:"+ba2.height+",��л���x:"+ba2.x+",��л���y:"+ba2.y+",��л����ٶ�:"+ba2.speed);
		System.out.println("�ӵ��Ŀ�:"+bt1.width+",�ӵ��ĸ�:"+bt1.height+",�ӵ���x:"+bt1.x+",�ӵ���y:"+bt1.y+",�ӵ����ٶ�:"+bt1.speed);
		System.out.println("�ӵ��Ŀ�:"+bt2.width+",�ӵ��ĸ�:"+bt2.height+",�ӵ���x:"+bt2.x+",�ӵ���y:"+bt2.y+",�ӵ����ٶ�:"+bt2.speed);
		//��������ظ���������������
		
	}
		
	
	

	public static void main(String[] args) {
		World world = new World();
		world.action();

	}

}
