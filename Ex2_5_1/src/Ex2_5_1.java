import java.util.Scanner;

public class Ex2_5_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input start number(0~6): ");
		int number = s.nextInt();
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 0; i < number; i++) {
			System.out.print("\t");
		}
		for(int j=1; j<=7-number;j++) {
			System.out.print(j+"\t");
		}
		System.out.println();
		for(int k=8-number; k<32; k++) {
			System.out.print(k+"\t");
			if(k>7 && (k+number)%7==0) {
				System.out.println();
			}
		}
	}
}