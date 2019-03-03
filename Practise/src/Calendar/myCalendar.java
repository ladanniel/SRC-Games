package Calendar;

import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class myCalendar {
	  private JPanel imagePanel,datePanel,p,p2,p3;
	  private JLabel label,l,l2,l3,l4,l5;
	    private ImageIcon background;
	    private JButton b,b2;
	    private JTextField t;
	    private JComboBox<String> month_list = new JComboBox<String>();
	    private Font f = new Font("微软雅黑",Font.PLAIN,15);
	    private String columns[] = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
	    private Date now = new Date();
	    private JLabel[] day = new JLabel[42];
	
	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	}

}
