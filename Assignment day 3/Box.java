/* Create a class Box that uses a parameterized method to initialize the dimensions of a box.
 *  (dimensions are width, height, depth of double type). The class should have a method that 
 *  can return volume. Obtain an object and print the corresponding volume in main() function.
 */
 
public class Box {
int w,h,d;
Box(int w,int h,int d){
	this.w=w;
	this.h=h;
	this.d=d;
}
int volume() {
	return (w*h*d);
}
	public static void main(String[] args) {
		Box obj= new Box(10,20,5);
		System.out.println(obj.volume());

	}

}
