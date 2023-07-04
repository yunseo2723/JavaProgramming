
abstract class Mammal{
	abstract public Object clone();
}

public class Ex6_3 {
	String _name;
	int _age;
	public Ex6_3(String name, int age) {
		_name = name;
		_age = age;
		
	}
	
	public static void main(String args[]) {
		//문자열 정수변환
		String str = "314";
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		//문자열 실수변환
		String str2 = "31.4";
		double d = Double.parseDouble(str2);
		System.out.println(d);
		//정수 문자열 변환
		int a = 345;
		String str3 = Integer.toString(a);
		
		Integer I = 389;
		String str4 = I.toString();
		
		//실수 문자열 변환
		double k = 3.45;
		str = Double.toString(k);
	}
}
