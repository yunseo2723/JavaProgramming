import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		
		int n=0,sum=0, value =0;
		String[] grade= {"����","����","����"};
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		
		for(int i=0;i<grade.length;i++) {
			System.out.print(grade[i]+">>");
			try {
				n=scanner.nextInt();				//n�� �� ���� ����
			}
			catch(InputMismatchException e) {		//Exception e ����
				System.out.println("������ �ƴմϴ�. �ٽ��Է��ϼ���");
				scanner.nextLine();
				i--;								//�ε��� �������� �ʵ��� ���̱�
				continue;
			}
			sum+=n;

		}
		value=sum/grade.length;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("����� " +value+"���Դϴ�.");
		scanner.close();
	}
}
