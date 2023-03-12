package febtraining;

public class JumpStatement {
public static void main(String[] args) {
	// Break;
	// Continue;
	
	int i  = 1;
	while(i < 10) {
		System.out.println("Hello this is " + i + " iteration");
		i++;
		if(i == 6) {
			continue;
		}
		
		if(i == 8) {
			continue;
		}
		System.out.println("mail send");
	}
	
}
}
