
public class Cat {
	int _age;
	String _name;
	static int population = 0;
	
	public Cat() {
		this(1,"NAVI");
	}
	
	public Cat(int age) {
		this(age,"NAVI");
	}
	
	public Cat(int age, String name) {
		_age=age;
		_name=name;
		System.out.println("a cat born!");
		++population;	
	}
	
	public void speak() {
		System.out.println("¾ß¿Ë!");
	}
	
	public static void printPopulation() {
		System.out.println("Cat #: "+ population);
	}
	
}


