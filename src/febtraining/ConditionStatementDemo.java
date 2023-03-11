package febtraining;

public class ConditionStatementDemo {
	public static void main(String[] args) {
		// if else 
		// age < 18 = child 
		// age >=18 and age <=30 = adult
		// 30 - 45  = mature
		// 45   = old 
		
		
		int age = 27;
		String ageGroup = "";
		if(age < 18) {
			ageGroup = "Child";
		}else if(age >=18 && age <=30){
			ageGroup = "Adult";
		}else if(age > 25 && age <= 45) {
			ageGroup = "Mature";
		}else {
			ageGroup = "Old";
		}
		System.out.println(age + " = " +  ageGroup);
		
	}
}
