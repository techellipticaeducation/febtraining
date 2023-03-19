package oopsdemo;

public class Human {
// characteristics
	
	String name;
	int height;
	double weight;
	int age;
	
	// Behaviour
	public void speak(String content) {
		System.out.println(name + " : " + content);
	}
	
	public void birthday() {
		age++;
	}
	
	public void weightLoss(double howmuch) {
		weight = weight - howmuch;
	}
	
	private void test() {
		
	}
}

