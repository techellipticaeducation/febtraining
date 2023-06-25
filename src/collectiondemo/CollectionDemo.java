package collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
public static void main(String[] args) {
	
//	int[] i = new int[3];
//	List<Integer> i = new ArrayList<Integer>();
	Set<Integer> i = new TreeSet<Integer>();
	int k = 0;
	while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your number");
		int j = scan.nextInt();
		i.add(j);
		k++;
		
		for(int m : i) {
			System.out.print(m +" ");
		}
		System.out.println();
	}
	
	
	// Linked - Sequential
	// Hash - iteration fast
	// Tree - sort
	
}
}



