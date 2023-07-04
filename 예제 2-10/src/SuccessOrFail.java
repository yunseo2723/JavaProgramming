import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int score = s.nextInt();
		
		if(score>=80) {
			System.out.println("합격입니다.");
		}
		else
			System.out.println("불합격입니다.");
		
		s.close();
	}
}
