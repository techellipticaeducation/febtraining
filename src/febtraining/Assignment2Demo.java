package febtraining;

public class Assignment2Demo {
public static void main(String[] args) {
	int k = 12563537;
	int sum = 0;
	
	
//	sum = sum + k%10 ;     // sum = 5
//	k = k/10;     			// k = 12
//	
//	sum = sum  + k%10 ; // sum = 7
//	k = k/10;   		// k = 1
//	
//	sum = sum + k%10;  // sum = 8
//	k = k /10;         // k = 0
	
	
	while(k != 0) {
		sum = sum + k%10 ;
		k = k / 10;
	}
	System.out.println(sum);
}
}
