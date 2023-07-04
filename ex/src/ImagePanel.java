
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
    private Point a;
    private Point b;
    
    public ImagePanel(Point a, Point b) {
        this.a = a;
        this.b = b;
        setBackground(Color.WHITE);
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(a.x, a.y, 50, 50);  // a를 원으로 그리기
        g.setColor(Color.BLUE);
        g.fillOval(b.x, b.y, 50, 50);  // b를 원으로 그리기
    }
}
