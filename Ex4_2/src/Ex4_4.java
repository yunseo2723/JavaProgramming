public class Ex4_4 {
	public static void main(String args[]) {
		Machine Microwave = new Machine("전자레인지","LG","빨강",200000);
			
		System.out.println("종류: " + Microwave.name);
		System.out.println("브랜드: " + Microwave.brand);
		System.out.println("색상: " + Microwave.color);
		System.out.println("가격: " + Microwave.cost);
		Microwave.start();
		Microwave.stop();
	}
}