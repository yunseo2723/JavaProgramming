import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
   import javax.swing.JFrame;
   import javax.swing.JLabel;
   import javax.swing.JPanel;
   import javax.swing.JTextField;

   public class Ex9_4 extends JFrame {
      Ex9_4(){
         setTitle("덧셈 프로그램");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         Container cp = getContentPane();
         JPanel panel1 = new JPanel();
         JPanel panel2 = new JPanel();

         cp.add(panel1, BorderLayout.CENTER);
         cp.add(panel2, BorderLayout.SOUTH);

         panel1.setLayout(new FlowLayout());

         JTextField t1 = new JTextField();
         t1.setColumns(10);
         panel1.add(t1);

         panel1.add(new JLabel(" + "));

         JTextField t2 = new JTextField();
         t2.setColumns(10);
         panel1.add(t2);

         panel1.add(new JLabel(" = "));

         JTextField t3 = new JTextField();
         t3.setColumns(10);
         panel1.add(t3);

         panel2.setLayout(new FlowLayout());
         panel2.add(new JButton("확인"));
         panel2.add(new JButton("취소"));
         setPreferredSize(new Dimension(500, 100));
         pack();
         setVisible(true);   
      }
         
   
      public static void main(String [] args) {
         new Ex9_4();   
      }
   }

