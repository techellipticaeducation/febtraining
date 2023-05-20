package pac1;

public class Test1 {
	public int i = 10;
	static Test1 test1 = null; // shared, one time created 
	private Test1(){
		
	}
	// Only Single object in entire framework
	// Single object in ton of class -  design pattern	
	public static Test1 getObject() {
		if(test1 == null) {
			System.out.println("now creating object");
			test1 = new Test1();
		}
		return test1;
	}
}
