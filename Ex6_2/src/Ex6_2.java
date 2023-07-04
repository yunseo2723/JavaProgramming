
abstract class Mammal{
	abstract public Object clone();
}

public class Ex6_2 {
	String _name;
	int _age;
	public Ex6_2(String name, int age) {
		_name = name;
		_age = age;
		
	}
	public String toString() {
		return _name+"고양이(" + _age + ")";
	}
	
	public boolean equals(Object obj) {
		Ex6_2 a = (Ex6_2)obj;
		return a._name.equals(_name)&&(a._age == _age);
	}
	
	public Object clone() {
		return new Ex6_2(_name,_age);
	}
	
	public static void main(String args[]) {
		Ex6_2 m = new Ex6_2("도둑", 3);
		
		Mammal m2 = (Mammal)m.clone();
		
		
	}
}
