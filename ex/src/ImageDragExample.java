import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class ImageDragExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Drag Example");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final Point a = new Point(10, 100);  // a의 초기 좌표
        final Point b = new Point(60, 100);  // b의 초기 좌표
        
        // a를 드래그하여 이동시키는 마우스 리스너
        frame.addMouseListener(new MouseAdapter() {
            int dx, dy;  // 드래그 시 마우스 포인터의 상대적 이동 거리
            
            public void mousePressed(MouseEvent e) {
                dx = e.getX() - a.x;
                dy = e.getY() - a.y;
            }
            
            public void mouseDragged(MouseEvent e) {
                a.x = e.getX() - dx;
                a.y = e.getY() - dy;
                frame.repaint();
            }
        });
        
        // b를 드래그하여 이동시키는 마우스 리스너
        frame.addMouseMotionListener(new MouseAdapter() {
            int dx, dy;  // 드래그 시 마우스 포인터의 상대적 이동 거리
            
            public void mousePressed(MouseEvent e) {
                dx = e.getX() - b.x;
                dy = e.getY() - b.y;
            }
            
            public void mouseDragged(MouseEvent e) {
                int newX = e.getX() - dx;
                int newY = e.getY() - dy;
                
                if (newX > 50) {
                    b.x = newX;
                }
                b.y = newY;
                frame.repaint();
            }
        });
        
        frame.add(new ImagePanel(a, b));
        frame.setVisible(true);
    }
}
