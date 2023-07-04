import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex12_2 extends JFrame {
	private MyPanel panel = new MyPanel();
	public Ex12_2() {
		setTitle("이미지 일부분을 크기 조절하여 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(1000, 1000);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon1 = new ImageIcon("C:\\Users\\hayun\\Downloads\\TaxiL.png");
		private Image img1 = icon1.getImage();
		private ImageIcon icon2 = new ImageIcon("C:\\\\Users\\\\hayun\\\\Downloads\\\\TaxiL.png");
		private Image img2 = icon2.getImage();
		private ImageIcon icon3 = new ImageIcon("C:\\\\Users\\\\hayun\\\\Downloads\\\\TaxiL.png");
		private Image img3 = icon3.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img1, 20, 20, 300, 300, this);
			g.drawImage(img2, 320, 20, 300, 300, this);
			g.drawImage(img3, 620, 20, 300, 300, this);
			g.drawImage(img1, 20, 320, 300, 300, this);
			g.drawImage(img2, 320, 320, 300, 300, this);
			g.drawImage(img3, 620, 320, 300, 300, this);
			g.drawImage(img1, 20, 620, 300, 300, this);
			g.drawImage(img2, 320, 620, 300, 300, this);
			g.drawImage(img3, 620, 620, 300, 300, this);
			
		}
	}
	public static void main(String [] args) {
		new Ex12_2();
	}
}

