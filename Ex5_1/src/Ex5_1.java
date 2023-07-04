
public class Ex5_1 {
	public static void main(String[] args) {
		/*Rectangle r = new Rectangle(0,0,100,200);
		System.out.println("Rectangle: " + r.getArea());
		
		Triangle t = new Triangle(0,0,300,200);
		System.out.println("Triangle: " + t.getArea());*/
	
		Shape [] objs = new Shape[2];
		objs[0]=new Rectangle(0,0,100,200);
		objs[1]=new Triangle(0,0,300,200);
		
		for(int i=0;i<objs.length;++i)
			System.out.println(i+"s Area is: "+objs[i].getArea());
		
		
		int rectangleCount=0;
		for(int i=0;i<objs.length;++i) {
			if(objs[i] instanceof Rectangle)
				rectangleCount++;
			}
			System.out.println("Rectangle Count is: "+rectangleCount);
	}
		
		
}
