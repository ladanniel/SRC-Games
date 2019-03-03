package HomeWorkDemo;

public class DrinkingWater {
	DrinkingWater(){
		int water = 3;
		int bottle = 0;
		int cap = 0;
		int count =0;
	}
	
	public static void drink2(int count,int water,int bottle,int cap){
		
		
			if(water>0){                                                            //三个事物中挑出其中一个为突破进行推理
				water--;
				count++;
				bottle++;
				cap++;
			}
			if(bottle>=2){
				water++;
				bottle-=2;
			}
			if(cap>=3){
				water++;
				cap-=3;
			}
			if(water==0&&bottle<2&&cap<3){
				System.out.println("喝了"+count+"水"+water+"瓶子"+bottle+"盖子"+cap);
				return;
			}
			drink2(count,water,bottle,cap);
	}
	public static void drink(){
		int water = 3;
		int bottle = 0;
		int cap = 0;
		int count =0;
		while(true){
			while(water>0){
				water--;
				count++;
				bottle++;
				cap++;
			}
			while(bottle>=2){
				water++;
				bottle-=2;
			}
			while(cap>=3){
				water++;
				cap-=3;
			}
			if(water==0&&bottle<2&&cap<3){
				System.out.println("喝了"+count+"水"+water+"瓶子"+bottle+"盖子"+cap);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		drink();
		drink2(0,3,0,0);
	}

}
