import java.awt.*;
import javax.swing.*;
public class Ex9_1 extends JFrame {
	public Ex9_1() {
		
		Container contentPane = getContentPane();
		setTitle("첫번째 윈도우 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1=new JLabel("내이름은 하윤서입니다.");
		contentPane.add(label1);
		setPreferredSize(new Dimension(300,150));
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex9_1();
	}
}