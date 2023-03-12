package febtraining;

public class SwitchDemo {
	public static void main(String[] args) {
		
		// week
		
		// 7 days 
		// sunday, Sun, Sunday, daynumber = 1 
		// monday, Sun, Sunday, daynumber = 2 
		// tuesday, Sun, Sunday, daynumber = 3 
		// wednesday, Sun, Sunday, daynumber = 4 
		// thursday, Sun, Sunday, daynumber = 5 
		// friday, Sun, Sunday, daynumber = 6 
		// saturday, Sun, Sunday, daynumber = 7 
		
		String dayvalue = "Fri";
		int dayNumber = 0;
		switch(dayvalue) {
			case "Sunday":
			case "Sun":
			case "sunday":
				dayNumber = 1;
				break;
			case "Monday":
			case "Mon":
			case "monday":
				dayNumber =2;
				break;
			
			case "Tuesday":
			case "Tue":
			case "tuesday":
				dayNumber = 3;
				break;
			default:
				dayNumber = -1;
		}
		System.out.println(dayNumber);
		
	}
}
