public class Ex4_3 {
	public static void main(String args[]) {
		Machine Microwave = new Machine();
		Microwave.name="���ڷ�����";
		Microwave.brand = "LG";
		Microwave.color = "����";
		Microwave.cost = 200000;
			
		System.out.println("����: " + Microwave.name);
		System.out.println("�귣��: " + Microwave.brand);
		System.out.println("����: " + Microwave.color);
		System.out.println("����: " + Microwave.cost);
		Microwave.start();
		Microwave.stop();
	}
}
