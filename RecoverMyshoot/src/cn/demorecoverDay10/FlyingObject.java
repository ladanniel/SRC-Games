package cn.demorecoverDay10;
import java.awt.image.BufferedImage;
/**��������������þ����ô������࣬�����Ը����ڵ��õ�ʱ���Լ������Լ���*/
import java.util.Random;
import javax.imageio.ImageIO;  // ͼƬ��д����

/**���࣬������super*��������ֵ����д����*/
public abstract class FlyingObject {               //�������������ò���private������protected���ɣ������л���Ҫ�õ��˴�������
	protected int width;        //���в���
	protected int height;       //���в���
	protected int x;            //���в���
	protected int y;            //���в���
	/**ר�Ÿ�Ӣ�ۻ�����ա��ӵ��ṩ�Ĺ���*/
	public FlyingObject(int width,int height,int x,int y){
		this.width=width;
		this.height=height;
		this.x=x;
		this.y=y;
	}

	/**ר�Ÿ�С�л�����л���С�۷��ṩ�Ĺ���*/
	public FlyingObject(int width,int height){
		this.width=width ;
		this.height=height;
		Random rand = new Random();
		x=rand.nextInt(World.WIDTH-this.width);      //x:0�������ڿ�-С�л���֮�ڵ����������ΪС�л����������������������û�й̶���x����
		y=-this.height;                       //����С�л��ĸ�
		
		
	}
	/**ר�Ÿ�С�л�����л���С�۷��ṩ�Ĺ���*/
	public abstract void step();
	/**��ͼƬ*/
	public static BufferedImage loadImage(String fileName){
		try{
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));                   //ͬ���ж�ȡfileName����
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	};

}
