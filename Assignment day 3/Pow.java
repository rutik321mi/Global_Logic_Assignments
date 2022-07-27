
public class Pow {
static int powerI(int x,int y) {
	 return (int) (Math.pow(x,y));
}
static double powerD(double x,double y) {
	 return (Math.pow(x,y));
}
	public static void main(String[] args) {
	
	System.out.println(Pow.powerI(2,3));
	System.out.println(Pow.powerD(2.0,3.0));

	}

}
