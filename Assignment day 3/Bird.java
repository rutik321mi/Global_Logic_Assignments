/*Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
*/

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
