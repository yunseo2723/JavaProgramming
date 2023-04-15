public class Ex4_3 {
	public static void main(String args[]) {
		Machine Microwave = new Machine();
		Microwave.name="전자레인지";
		Microwave.brand = "LG";
		Microwave.color = "빨강";
		Microwave.cost = 200000;
			
		System.out.println("종류: " + Microwave.name);
		System.out.println("브랜드: " + Microwave.brand);
		System.out.println("색상: " + Microwave.color);
		System.out.println("가격: " + Microwave.cost);
		Microwave.start();
		Microwave.stop();
	}
}
