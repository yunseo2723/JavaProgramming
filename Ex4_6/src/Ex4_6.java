
public class Ex4_6 {
	public static void main(String[] args) {
		Calc c= new Calc();
		System.out.println("int: "+c.sum(1, 1)+", double: "+c.sum(2.0,3.0));
		System.out.println(c.sum(1.0,2));	
		c=null;
	}
}
