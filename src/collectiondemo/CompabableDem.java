package collectiondemo;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CompabableDem {
	public static void main(String[] args) {

		// Comparable - at the time of value insertion - natural sorting 
		// Comparator - customized sorting

		
		Set<Student> i = new TreeSet<Student>();
		int k = 0;
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Your number");
			int j = scan.nextInt();
			System.out.println("Enter Your name");
			String s = scan.next();
			Student st1 = new Student();
			st1.studentId = j;
			st1.studentName= s;
			
			i.add(st1);
			System.out.println("---------");
			for(Student m : i) {
				System.out.println(m.studentId + " - " + m.studentName);
			}
			System.out.println("---------");
		}
		
	}
}


class Student implements Comparable<Student>{
	int studentId;
	String studentName;
	@Override
	public int compareTo(Student o) {
		int diff = o.studentId-studentId;
		if(diff == 0) {
			diff = o.studentName.compareTo(studentName);
		}
		return diff;
	}
}