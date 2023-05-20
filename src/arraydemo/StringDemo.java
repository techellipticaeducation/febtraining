package arraydemo;

public class StringDemo {
	public static void main(String[] args) {
		/// string is widley used - special management 
		
		
		
		String s1 = "Pune";  // String literal way 
		String s2 = "Mumbai";
		String s3 = "Pune";
		String s4 = "Pune";
		
		s3 = "Goa";
		String s5 = "Goa";
		s5 = "Delhi";
		// String object = 3
		// once string is created.we cant change it  (im-mutability of string)
		// 1 milion - city  - pune , // 4milion char 
		
		// array => array of character , 4 size
		
		String st3 = new String("Chennai");  // object way
		String st9 = "Chennai";
		String st10 = new String("Chennai");  // 7
		String st11 = new String("Chennai");  // 8
		String st12 = new String("Kolkata"); // 10
		
		// Pune, Mumbai, Goa, Delhi , Chennai, ChennaiP1, ChennaiP2, Kolkata, kolkataP3 
		
		// == equal to operator
	
		
		
		
	}
}


class Student1{
	static String name;
	static String country;
	public static void showData(){
		String j;
		// Local variable - must be initialzed;
		System.out.println(name +  country );
	}
}

class R{

	public static void main(String[]args){
		//Student.showData();
		Student1 obj = new Student1();
		obj.showData();
	}
}
