public class Ex4_4 {
	public static void main(String args[]) {
		Machine Microwave = new Machine("���ڷ�����","LG","����",200000);
			
		System.out.println("����: " + Microwave.name);
		System.out.println("�귣��: " + Microwave.brand);
		System.out.println("����: " + Microwave.color);
		System.out.println("����: " + Microwave.cost);
		Microwave.start();
		Microwave.stop();
	}
}