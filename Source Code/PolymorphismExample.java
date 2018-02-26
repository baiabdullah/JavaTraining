class Animal {
public void makeSound() {
System.out.println("the animal makes sounds");
	}
}

class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("the dog barks");
	}
}


class Cat extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("the cat meows");
	}
}

public class PolymorphismExample {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound();
		Dog dog = new Dog();
		dog.makeSound();
		animal = new Cat();
		animal.makeSound();
	}
}
