import java.util.Scanner;

public class SuccessOrFail {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		
		int score = s.nextInt();
		
		if(score>=80) {
			System.out.println("�հ��Դϴ�.");
		}
		else
			System.out.println("���հ��Դϴ�.");
		
		s.close();
	}
}
