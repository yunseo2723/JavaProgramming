
public class Shape {
	int x1, y1, x2, y2;
	
	public Shape() {
		setPos(0,0,0,0);
	}
	public Shape(int x1, int y1, int x2, int y2) {
		setPos(x1,y1,x2,y2);
	}
	public void setPos(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		}
	public double getArea() {
		return 0;
	}
}