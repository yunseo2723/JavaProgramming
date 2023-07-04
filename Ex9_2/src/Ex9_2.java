import java.awt.*;
import javax.swing.*;
public class Ex9_2 extends JFrame {
	public Ex9_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		JTextField text1 = new JTextField();
		text1.setPreferredSize(new Dimension(100,20));
		cp.add(text1, BorderLayout.WEST);
		cp.add(new JButton("확인"), BorderLayout.EAST);
		cp.add(new JLabel("Hello"), BorderLayout.SOUTH);
		pack();
		setVisible(true);
		setTitle("Hello Program");
		
	}
	public static void main(String[] args) {
		new Ex9_2();
	}
}