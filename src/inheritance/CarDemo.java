package inheritance;

public class CarDemo {
	public static void main(String[] args) {
		Audi1 a1 = new Audi1();
		a1.brakes();
		a1.abs();
		
	}
}


class Car1{
	public void brakes() {
		System.out.println("Car1 -> brakes old");
	}
}

class SportCar1 extends Car1{

}

class Maruti1 extends SportCar1{
	public void brakes() {
		System.out.println("Maruti1 ->  brakes sytem");
	}
	
	public void abs() {
		System.out.println("Maruti1 -> abs braking system");
	}
	
}


class Audi1 extends SportCar1{
	public void brakes() {
		System.out.println("Audi1 -> special brakes");
	}
	
	public void abs() {
		System.out.println("audi -> abs braking system");
	}
	
}
