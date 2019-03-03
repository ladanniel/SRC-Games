package tn.day01;

public class Word {
	TiK tik;
	YiX yix;
	ZiD z1;
	ZiD z2;
	XiDj x1;
	XiDj x2;
	DiDj d1;
	DiDj d2;
	MiF m1;
	MiF m2;
	
	void core(){
		yix =new YiX();
		yix.width=200;
		yix.height=250;
		yix.x=256;
		yix.y=526;
		yix.step();
		yix.toDo();
		
		tik=new TiK();
		tik.width=400;
		tik.height=700;
		tik.x=0;
		tik.y=0;
		tik.y1=-700;
		tik.step();
		
		x1=new XiDj();
		x1.width=25;
		x1.height=25;
		x1.x=250;
		x1.y=253;
		x1.speed=2;
		x1.step();
		
	}

	public static void main(String[] args) {
		Word word=new Word();
		word.core();

	}

}
