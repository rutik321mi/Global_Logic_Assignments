class PersonM{
String Name="Rahul";
String dob="13/12/2004";

}
class Teacher extends PersonM{
	double sal=3400.87;
	String sub="History";	
	
}
class Student extends PersonM{
	int stuid=1234;
	
}
class CollegeStudent extends PersonM{
String nameofc="SSGMCE",year="Second";

		
}



public class Application {

		
	public static void main(String[] args) {
		Teacher t = new Teacher();
		System.out.println("Name of person is "+t.Name);
		System.out.println("Date of birth of person is "+t.dob);
		System.out.println("Salary is "+t.sal);
		System.out.println("Subject is "+t.sub);
		
		
		Student s= new Student();
		System.out.println("Name of person is "+t.Name);
		System.out.println("Date of birth of person is "+t.dob);
		System.out.println("Student id is "+s.stuid);
		
		CollegeStudent obj= new CollegeStudent();
		System.out.println("Name of person is "+obj.Name);
		System.out.println("Date of birth of person is "+obj.dob);
		System.out.println("Name of college is "+obj.nameofc);
		System.out.println("Year of admission is "+obj.year);
		

	}

}
