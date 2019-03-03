package cn.tedu.myShoot;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel{
	public static int WIDTH=400;
	public static int HEIGHT=700;
	private Sky sky= new Sky();
	private Hero hero = new Hero();
    private FlyingObject[] enemies = {new Airplane(),new BigAirplane(),new Bee()};
	private Bullet []bullets= {new Bullet(100,200)};
	public void action() {
		sky.step();
		hero.step();
		
	}
	public void paint(Graphics g) {
		sky.paintObject(g);
		hero.paintObject(g);
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);
		}
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);
		}
	
		
	}
	public static void main(String[] args) {
		World world = new World();
		world.action();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(world.WIDTH,world.HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(world);
		
	}
	

}
