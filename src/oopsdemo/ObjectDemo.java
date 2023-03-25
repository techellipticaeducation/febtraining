package oopsdemo;

public class ObjectDemo {

	public static void main(String[] args) {
		
		
//		Footballer fb = new Footballer();
//		fb.name = "Messi";
		
		// Class level
		
		System.out.println(Human.country);
		
		
		Human a1 = new Human();
		a1.name = "Ashwini";
		a1.height = 156;
		a1.age = 30;
		
		a1 = null;
		System.out.println(a1.name);
		
		
		
		Human a2 = new Human();
		a2.name = "Harshad";
		a2.height = 160;
		a2.age = 32;
		a2.weight = 60.0;

		
		a1.country = "India";
		
		a1.speak("Hello Everyone");
		a2.speak("Hey Hi");
		a1.speak("Hows java session going on");
		a2.speak("All Good. we are learning oops today");
		a1.speak("Today is my birthday");
		a2.speak("What Your age now?");
		a1.birthday();
		a1.speak("my age now is " +a1.age);
		a2.birthday();
		
		System.out.println("Before going gym" + a2.weight);
		a2.weightLoss(2);
		System.out.println(a2.age);
		System.out.println("After gym " + a2.weight);
		
		System.out.println(a1.weight);
		a2.tellMeYourCountry();
		
		
		a1.counter = 10;
		a1.counter = a1.counter + 5;
		System.out.println(a1.counter);
		System.out.println(a2.counter);
		
		
	}
	
	
	
}
