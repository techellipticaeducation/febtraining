package oopsdemo;

public class Human {
// characteristics
	
	// instance variable
	// 100 
	
	int i = j+10;
	static int j = 10;
	
	String name;
	int height;
	double weight;
	int age;
	
	static String country = "Hello"; // shared, memory save
	static int counter =1;
	
	
	// sabse pahle = static
	// object - instance 
	
	// You need not to create any object, 
	// to access any static entity
	
	
	// Behaviour
	public void speak(String content) {
		System.out.println(name + " : " + content);
	}
	
	public void birthday() {
		age++;
	}
	
	public void weightLoss(double howmuch) {
		int k = 10;
		weight = weight - howmuch;
	}
	
	private void test() {
		
	}
	
	public void tellMeYourCountry() {
		speak("i am from " + country);
	}
	
}

