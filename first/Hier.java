package first;

public class Hier {
	void eat(){
		System.out.println("animal...");
	}
}
class Cat extends Hier{
	void meow(){
		System.out.println("meowing...");
	}
}
class Dog extends Hier{
	void bark(){
		System.out.println("barking...");
	}
}
class Hierarchical{
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
		
	}
	}

