package oopsdemo;

public class ObjectDemo {

	public static void main(String[] args) {
		
		
//		Footballer fb = new Footballer();
//		fb.name = "Messi";
		
		
		Footballer a1 = new Footballer();
		a1.name = "Ashwini";
		a1.height = 156;
		a1.age = 30;
		
		Human a2 = new Human();
		a2.name = "Harshad";
		a2.height = 160;
		a2.age = 32;
		a2.weight = 60.0;

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
	}
	
	
	
}
