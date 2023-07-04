
public class Ex2_5 {
	public static void main(String args[]) {
		
		int i;
		for(i=0; i<100; i++) {
			if(i%10==9)
				System.out.print(i+"\n");	//println은 줄바꿈이 자동
			else
				System.out.print(i+" ");
		}
	}
}
