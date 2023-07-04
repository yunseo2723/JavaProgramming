import javax.swing.*;
import java.awt.*;
public class Ex12_1 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Ex12_1() {
		setTitle("Ex12_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(1000, 1000);
		setVisible(true);
		}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(new Color(255,235,205));
			g.fillOval(300,200,400,500);
			g.setColor(new Color(0,0,0));
			g.drawOval(300,200,400,500);
			g.setColor(new Color(221,160,221));
			g.fillRect(350,80,300,100);
			g.setColor(new Color(0,0,205));
			g.drawRect(350, 80, 300, 100);
			g.setColor(new Color(221,160,221));
			g.fillRect(250,180,500,80);
			g.setColor(new Color(0,0,205));
			g.drawRect(250,180,500,80);
			}
		}
	public static void main(String [] args) {
		new Ex12_1();
		}
	}