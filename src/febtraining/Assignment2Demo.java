package febtraining;

public class Assignment2Demo {
public static void main(String[] args) {
	int k = 12563537;
	
	int sum = sumOfDigit(k);
	System.out.println(sum);
}




static int sumOfDigit(int k) {
	if(k == 0) {
		return 0;
	}
	if(k < 0) {
		return 0;
	}
	int sum = 0;
	
	while(k != 0) {
		sum = sum + k%10 ;
		k = k / 10;
	}
	return sum;
}


}
