
public class Ex3_1 {
	public static void main(String[] args) {
		for(int i='A'; i<='E'; i++) {		//엔터 5번
			for(int j=i; j<='E'; j++)	//ABCDE BCDE CDE ...
				System.out.print((char)j);
			System.out.print("\n");
		}
	}
}
