import java.util.Scanner;

public class Ex4_5 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input N?");
		int n=s.nextInt();
		Machine[] machines = new Machine[n];
		for(int i=0;i<n;i++) {
			machines[i]=new Machine("전자레인지","LG","빨강",200000);
		for(i=0;i<machines.length;i++) {
			machines[i].stop();
		}
		}
	}
}
