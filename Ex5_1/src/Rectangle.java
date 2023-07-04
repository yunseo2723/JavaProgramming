
public class Rectangle extends Shape {
	int width, height;
	
	public Rectangle(int x1,int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
		width=x2 - x1;
		height=y2 - y1;
	}
	public double getArea() {
		return((x2 - x1) * (y2 - y1));
	}
}
