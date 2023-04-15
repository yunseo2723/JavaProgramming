
public class Machine {
		String name;
		String brand;
		String color;
		int cost;
		
		public void start() {
			System.out.println("Start");
		}
		
		public void stop() {
			System.out.println("Stop");
		}
		
	public static void main(String args[]) {
		Machine Microwave;
		Microwave = new Machine();
		Microwave.name="전자레인지";
		Microwave.brand = "LG";
		Microwave.color = "빨강";
		Microwave.cost = 200000;
			
		System.out.println("종류: " + Microwave.name);
		System.out.println("브랜드: " + Microwave.brand);
		System.out.println("색상: " + Microwave.color);
		System.out.println("가격: " + Microwave.cost);
	}
}
