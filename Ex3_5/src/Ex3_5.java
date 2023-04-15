import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		
		int n=0,sum=0, value =0;
		String[] grade= {"국어","수학","영어"};
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		for(int i=0;i<grade.length;i++) {
			System.out.print(grade[i]+">>");
			try {
				n=scanner.nextInt();				//n에 각 점수 저장
			}
			catch(InputMismatchException e) {		//Exception e 가능
				System.out.println("정수가 아닙니다. 다시입력하세요");
				scanner.nextLine();
				i--;								//인덱스 증가하지 않도록 줄이기
				continue;
			}
			sum+=n;

		}
		value=sum/grade.length;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("평균은 " +value+"점입니다.");
		scanner.close();
	}
}
