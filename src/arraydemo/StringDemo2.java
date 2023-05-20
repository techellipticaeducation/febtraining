package arraydemo;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = "Pune";
		String s2 = "Pune";
		
		String s3 = new String("Pune"); 
		String s4 = new String("Pune");
		s3 = s3.intern();
		
		// total Object
		
		//  referential equality check
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1 == s4);
//		System.out.println(s3 == s4);
		
		// value eqaulity check
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equals(s4));
//		System.out.println(s3.equals(s4));
		
		
		String jk = "this is india";
//		System.out.println(jk.toLowerCase());
//		System.out.println(jk.toUpperCase());
//		System.out.println(jk.trim());
//		System.out.println(jk.charAt(1));
		
//		int sum = 0;
//		String[]  ar = jk.split(" ");
//		for(String a : ar) {
//			System.out.println(a);
//			sum = sum + a.length();
//		}
//		System.out.println(sum);

//		jk= jk.replace(" ", "");
//		System.out.println(jk);
//		System.out.println(jk.length());
		
		
		
		//System.out.println(jk.substring(5,9));
		
		
		
	}
}
