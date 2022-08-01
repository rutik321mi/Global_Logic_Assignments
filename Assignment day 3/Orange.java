/*Create  a base class Fruit with name ,taste and size as its attributes. 
Create a method called eat() which describes the name of the fruit and its taste. 
Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
*/


class Fruit{
	String name,taste;
	int size;
	void eat(String x,String y,int s) {
		System.out.println("Name of fruit is "+x);
		System.out.println("size of fruit is "+s);
		System.out.println("Taste of fruit is "+y);
	}
	
}
class Apple extends Fruit{
	void eat(String x,String y,int s) {
		System.out.println("Name of fruit is "+x);
		System.out.println("size of fruit is "+s);
		System.out.println("Taste of fruit is "+y);
		
	}
	
	
}

public class Orange extends Fruit {
	void eat(String x,String y,int s) {
		System.out.println("Name of fruit is "+x);
		System.out.println("size of fruit is "+s);
		System.out.println("Taste of fruit is "+y);
		
	}

	public static void main(String[] args) {
		Fruit obj1= new Fruit();
		obj1.eat("xyz","unknown",0);
		Apple obj2 = new Apple();
		obj2.eat("apple", "sweet", 5);
		Orange obj3= new Orange();
		obj3.eat("orange", "sweet and sour", 6);
		

	}

}
