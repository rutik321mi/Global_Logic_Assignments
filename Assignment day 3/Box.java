
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
