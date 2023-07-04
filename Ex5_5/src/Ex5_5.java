
public class Ex5_5 {
	public static void main(String[] args) {
		Mammal[] animals = new Mammal[3];
		animals[0]=new Dog();
		animals[1]=new Cat();
		animals[2]=new Pig();
		
		for(int i=0;i<animals.length;i++)
			animals[i].speak();
	}
}
