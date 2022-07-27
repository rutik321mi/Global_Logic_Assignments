import java.util.ArrayList;



class MyArrayList<E> extends ArrayList<E> {
	
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}
public class Datatype {

	public static void main(String[] args) {
	
MyArrayList<Object> list = new MyArrayList<>();
		
		try {
			list.add(100);
			list.add(3.14F);
			list.add(2.2323D);
			list.add("XYZ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
	}

}
