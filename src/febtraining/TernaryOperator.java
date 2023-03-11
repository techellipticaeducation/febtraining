package febtraining;

public class TernaryOperator {
public static void main(String[] args) {
	// condition?true:false
	
	int age = 34;
	String ageGroup = age < 18 ? "Child" : 
		((age>=18 && age <=30) ? "adult" : "mature");
	
	System.out.println(ageGroup);
}
}
