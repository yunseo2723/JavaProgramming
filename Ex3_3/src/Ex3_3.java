import java.util.Scanner;

public class Ex3_3 {
	public static int sum(int n) {
		int sum = 0;
		for(int i=0; i<=n; i++)
			sum+=i;
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int n = scanner.nextInt();
		System.out.print("1부터 "+n+"까지의 합계는 "+ sum(n) +"입니다.");
	}
}
