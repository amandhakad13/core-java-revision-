abstract class Animal {
	
	abstract String sound();
	
	void eat(String name) {
		System.out.println(name+" is eating");
	}
}

class Dog extends Animal {
	
	String sound;
	
	Dog(String sound) {
		this.sound = sound;
	} 
	
	String sound() {
		return sound;
	}
}

class Cat extends Animal {
	
	String sound;
	
	Cat(String sound) {
		this.sound = sound;
	}
	
	String sound() {
		return sound;
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Animal a1 = new Dog("bark bark");
		a1.eat("Dog");
		System.out.println("Dog Says : "+a1.sound());
		
		Animal a2 = new Dog("Meow");
		a1.eat("Cat");
		System.out.println("Cat Says : "+a2.sound());
	}
}