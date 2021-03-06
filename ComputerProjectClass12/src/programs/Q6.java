package programs;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] a) {
		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a test word: ");
		String test = sc.nextLine().toLowerCase() + " ";
		
		// Removal of recurring alphabets
		String newStr = "";
		for(int i=0; i<test.length()-1; i++) {
			char c = test.charAt(i);
			if(test.charAt(i) == test.charAt(i+1)) {
				continue;
			}
			else {
				newStr += c;
			}
		}
		
		// Display
		System.out.println(newStr);
	}
}
/**
 * Input:
 * pppppiiiiiiiiiiiicccccccccckkkkkkkkkkkk
 * Output:
 * pick
 * 
 * Input:
 * vvvvvvvaaaaaaaaannnnnnnnnnnshhhhhhh
 * Output:
 * vansh
 */