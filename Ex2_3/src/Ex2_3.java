import java.util.Scanner;

public class Ex2_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("What's your age? ");
		int age = s.nextInt();
		
		System.out.println("You will be " + (age+1) + " next year");
		s.close();
	}
}
