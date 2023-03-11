package febtraining;

public class Assignment1Demo {
	public static void main(String[] args) {
		int i = 34; // 4,   40 + 9 // 94


		int reminder = i%10; // 9
		int d = i/10; // 4
		System.out.println(reminder+d);

		// how can we reverse this number ?
		System.out.println((reminder*10)+d);

		// Swap the values
		int k1 = 12; // 15
		int k2 = 15; // 12
		
//		int temp = k1;
//		k1 = k2;
//		k2 = temp;
		
// Without using third variable
k1 = k1+k2; // before k1=12,k2=15 , after k1=27, k2=15
k2 = k1-k2; // before k1=27, k2=15 , after k1=27, k2=12
k1 = k1-k2; //  k1 = 15, k2=12
		
		
		
		

	}
}
