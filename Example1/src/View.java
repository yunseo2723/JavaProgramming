import java.util.Scanner;

public class View {
	
	void printInputMsg() {System.out.println("Input 2 numbers : ");}
	
	void getInputData(Model m) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		m.set_a(a);
		m.set_b(b);
		
	}
	void printOutputMsg(int sumValue, int subValue) {
		System.out.println(" A+B =" + sumValue + ", A-B = " + subValue);
	}
}
