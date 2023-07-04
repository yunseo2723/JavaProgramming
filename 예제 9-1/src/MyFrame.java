import java.awt.Dimension;

import javax.swing.*;
public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setPreferredSize(new Dimension(300,300));
		pack();		//하위 컴포넌트 크기 계산
		setVisible(true);	//프레임 출력
}
	
	public static void main(String[] args) {
		MyFrame frame=new MyFrame();
	}
}
