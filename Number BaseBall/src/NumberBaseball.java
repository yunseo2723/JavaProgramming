import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberBaseball {
	public static void main(String[] args) {
			
		Random random=new Random();
		random.setSeed(System.currentTimeMillis());
			
		int Answer[] = new int[3];
			
		Answer[0]=random.nextInt(10);
			
		Answer[1]=random.nextInt(10);
		while(Answer[0] == Answer[1]) {
			Answer[1]=random.nextInt(10);
		}
			
		Answer[2]=random.nextInt(10);
		while(Answer[0]==Answer[2] || Answer[1]==Answer[2]) {
			Answer[2]=random.nextInt(10);
		}
			
		/*
		for(int i=0; i<3; i++)
			System.out.print(Answer[i]+"  ");
		System.out.println(" ");				*/
		//숫자 뽑기 끝
		
		int Number[] = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		
		int strike=0;
		int value=0;
		while(strike != 3) {
		
		System.out.print("Guess 3 numbers: \n");
		for(int i=0; i<3; i++) {
			try {
				Number[i]=scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("다시입력");
				scanner.nextLine();
				i--;
				continue;
			}
		//System.out.print(Number[i]);
		}
		
		System.out.print("\n");
		
		//숫자 받아오기 끝
		
		strike = 0;
		for(int j=0; j<3; j++) {
			if(Answer[j]==Number[j])
				strike++;
		}
		
		int ball = 0;
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
			if(Answer[a]!=Number[a] && Answer[a]==Number[b])
				ball++;
			}
		}

		if(strike == 0 && ball == 0)
			System.out.println("Out");
		else if(ball == 0) {
			System.out.println(strike + " Strike");
		}
		else if(strike == 0) {
			System.out.println(ball + " Ball");
		}
		else {
			System.out.println(strike + " Strike, " + ball + " Ball");
			}

		value++;
		}
		scanner.close();
		System.out.println("You make it on " + value + " tries");

		//결과 불러오기
	}
}