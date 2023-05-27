package seleniumimplemention;

public class ConstructorChainingDemo {
	public static void main(String[] args) {
		Y y1 = new Y(10);
	}
}
class W{
	W(){
		System.out.println("W constructor");
	}
	W(int i){
		System.out.println("W constructor with " +i);
	}
}
class X extends W{
	X(){
		System.out.println("X constructor");
	}
	X(int i){
		super(i);
		System.out.println("X constructor with "+ i);
	}
}
class Y extends X{
	Y(){
		System.out.println("Y constructor");
	}
	Y(int i){		
		super(i);
		System.out.println("Y constructor with " + i);
	}
	
	// super() or this() - MUST be the fiest statement in constrcutor call - NOOOOOOOOOOOOO
}