import java.util.Scanner;

public class Ex2_4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.print("input number: ");
		int number = s.nextInt();
		System.out.printf("reversed bits: 0x%x\n",reverseBits(number));
	}
	public static int reverseBits(int x) {
		int reverse=0;
		for(int i=0; i<4*8; ++i, x>>=1) {
			reverse <<=1;
			reverse |= (x&1);
		}
		return reverse;
			
	}
}
