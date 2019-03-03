package day0008;
import java.awt.image.BufferedImage;
/**��������������þ����ô������࣬�����Ը����ڵ��õ�ʱ���Լ������Լ���*/
import java.util.Random;
import javax.imageio.ImageIO;  // ͼƬ��д����
import java.awt.Graphics;

/**���࣬������super*��������ֵ����д����*/
public abstract class FlyingObject {                                              //�������������ò���private������protected���ɣ������л���Ҫ�õ��˴�������
	public static  final int LIFE=0; 
	public static  final int DEAD=1;
	public static  final int REMOVE=2;
	protected int state = LIFE;                                                   //��ǰ״̬
	
	
	protected int width;                                                         //���в���
	protected int height;                                                      //���в���
	protected int x;                                                          //���в���
	protected int y;                                                         //���в���
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
		x=rand.nextInt(World.WIDTH-this.width);                                     //x:0�������ڿ�-С�л���֮�ڵ����������ΪС�л����������������������û�й̶���x����
		y=-this.height;                                                                 //����С�л��ĸ�
		
		
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
		
		
	}/**��ȡͼƬ*/
	public abstract BufferedImage getImage();                     
	public boolean isLife(){ //�ж�״̬
		return state==LIFE;
	}
	public boolean isDead(){//�ж�״̬
		return state==DEAD;
	}
	public boolean isRemove(){//�ж�״̬
		return state==REMOVE;
	}
	/**������g:����*/
	public void paintObject(Graphics g){
		g.drawImage(this.getImage(), x, y, null);
		
/**���������Ƿ�Խ��*/		
	}public abstract boolean outOfBounds();
	

}
