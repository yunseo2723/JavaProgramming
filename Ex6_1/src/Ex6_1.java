
public class Ex6_1 {
	String _name;
	int _age;
	public Ex6_1(String name, int age) {
		_name = name;
		_age = age;
	}
	public String toString() {
		return _name+"°í¾çÀÌ(" + _age + ")";
	}
	
	public static void main(String args[]) {
		Ex6_1 thief = new Ex6_1("µµµÏ",3);
		System.out.println(thief);
		
		StringBuffer str1 = new StringBuffer("hello");
		StringBuffer str2 = new StringBuffer("hello");
		if(str1.equals(str2))
			System.out.println("the same");
		else
			System.out.println("diff");
	}
}
