
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
		Microwave.name="���ڷ�����";
		Microwave.brand = "LG";
		Microwave.color = "����";
		Microwave.cost = 200000;
			
		System.out.println("����: " + Microwave.name);
		System.out.println("�귣��: " + Microwave.brand);
		System.out.println("����: " + Microwave.color);
		System.out.println("����: " + Microwave.cost);
	}
}
