package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("What's your name?");


		String s1 = ap.nextString("What's your name?");


		String s2 = ap.nextString("What's your name?");


		String s3 = ap.nextString("What's your name?");
		String c = s2;
		String b = s1;
		String a = s0;
		String d = s3;

		System.out.println("Greetings " + a + ", " + b + ", " + c + ", " + d + "!");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
