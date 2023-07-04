public class Machine {
	String name;
	String brand;
	String color;
	int cost;

	public Machine(String a, String b, String c, int d) {
		name=a;
		brand=b;
		color=c;
		cost=d;
		System.out.println("A machine is created");
	}
	
	
	public void start() {
		System.out.println("Machine Start");
	}
	
	public void stop() {
		System.out.println("Machine Stop");
	}
}