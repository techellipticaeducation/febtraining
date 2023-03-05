package febtraining;

public class IncrementDemo {
	public static void main(String[] args) {
		
		int i = 10;
		
		// Pre Increment  - first increase then assign    ++i
		// Post Increment  - first assign then increase   i++
		
		// pre increment is faster then post increment ? - assignment 
		
		
		// Shortcut , jab variable dikhe - value likh do, then jab incredment 
		
		int k = i++ + i++ + i-- + i++ + --i + i++ + i-- + i++;
		//     10      11   12    11      11 + 11 + 12   11
		
		System.out.println("k - " + k);
		System.out.println("i - " + i);
		
		
		
		
		
	}
}
