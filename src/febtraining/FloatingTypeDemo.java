package febtraining;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FloatingTypeDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
	// . user 
		// float - 4 byte 
		// double - 8 byte 
		
//		float f1 = 12.4f;
//		System.out.println(f1);
//		
//		double d1 = 13.5d;
//		System.out.println(d1);
//		
//		double v1 = 12.0;
//		double v2 = 13.8;
//		double k = v1/v2;
//		System.out.println(k);
//		
//		
		
		// Boolean
//		boolean b1 = true;
//		boolean b2 = false;
//		//		1 bit ,  0 = false , 1 = true 
//		
//		
//		// Character
//		char c1 = 'G'; // byte , 1byte
//		// ASCII code  
//		// all chars are int
//		
//		
//		int j = (int)c1; // 4 byte
//		System.out.println(j);
//		
//		int m = 12345;
//		char mChar = (char)m;
//		System.out.println(mChar);
		
		//  char - ascii - 1 byte
		// unicode - 2 byte
		
		// Unicode 2 byte , 16 
//		PrintWriter writer = new PrintWriter(System.out, true);
		char a = '\u0920';
		System.out.println(a);
//		writer.println(a);
		
//		String sy  = "\u0919";
//		
//		byte[] charset = sy.getBytes("UTF-8");
//		String updated = new String(charset,"UTF-8");
//		System.out.println(updated);
		
	}
}
