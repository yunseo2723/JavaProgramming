import javax.swing.*;
import java.awt.*;

public class Ex9_3 extends JFrame {
	public Ex9_3() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);

		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		c.setPreferredSize(new Dimension(300, 200));
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex9_3();
	}
}