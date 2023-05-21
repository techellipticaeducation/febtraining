package inheritance;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		G1 g1 = new G3();
		g1.sweet1();
		//g1.sweet2();		
	}
}

class G1{
	public void sweet1() {
		System.out.println("sweet1-40%");
	}
}


class G2 extends G1{
	public void sweet1() {
		System.out.println("sweet1-40%");
	}
	public void sweet2() {
		System.out.println("sweet2-70%");
	}
}
class G3 extends G2{
	public void sweet1() {
		System.out.println("sweet1-80%");
	}
	public void sweet2() {
		System.out.println("sweet2-70%");
	}
}
