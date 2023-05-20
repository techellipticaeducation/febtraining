package oopsdemo;

public class MethodOverloading {

	public static void main(String...args) {
		
		int sum = Calculator.add();
		System.out.println(sum);
//		float sum1 = Calculator.add(10.5f, 10.8f);
//		System.out.println(sum1);
		
		
//		varargs = various  arguments, minimum = 0 , max = infinite 
		
	}
}

class Calculator{
	
	// Compile time polymorhsm
	// can create same name method but with different number of param and  type of param
	// method overloading return type not play any role
	
	// Diwali -> 
	
	// 2 param
	
	public static int add(int...input) {
		// array 
		int sum = 0;
		for(int i : input) {
			sum  = sum + i;
		}
		return sum;
	}
	
	public static int add(int i , int j) {
		int k = i + j;
		return k;
	}
	
	public static int add(int i , int j, int m) {
		int k = i + j+m;
		return k;
	}
	
	public static float add(float i , float j) {
		float k = i + j;
		return k;
	}
	
	
	
	
}