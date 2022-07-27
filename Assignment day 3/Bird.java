class Animal{
	
	void eat() {
		System.out.println("This is Animal class eat method");
	}
	void sleep() {
		System.out.println("This is Animal class sleep method");
	}
	
	
	
}
public class Bird extends Animal {

	void eat() {
		System.out.println("This is Bird class eat method");
	}
	void sleep() {
		System.out.println("This is Bird class sleep method");
	}
	void fly() {
		System.out.println("This is Bird class fly method");
	}
	public static void main(String[] args) {
		Animal obj1=new Animal();
		obj1.eat();
		obj1.sleep();
		Bird obj2=new Bird();
		obj2.eat();
		obj2.sleep();
		obj2.fly();

	}

}
