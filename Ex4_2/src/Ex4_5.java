import java.util.Scanner;

public class Ex4_5 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input N?");
		
		int n=s.nextInt();
		Machine[] machines = new Machine[n];
		for(int i=0;i<n;i++) {
			System.out.println("Machine ��ü�� ������ ");
			machines[i]=new Machine("���ڷ�����","LG","����",200000);
		}
		for(int j=0;j<machines.length;j++) {
			machines[j].start();
		}
	}
}
