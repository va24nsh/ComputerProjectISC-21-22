package programs;

import java.util.Scanner;

public class Piglatin {
	// Data Members
	String word, newword;
	
	// Default Constructor
	Piglatin() {
		word="";
		newword="";
	}
	
	// Input
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word: ");
		word=sc.nextLine();
	}
	
	// Convert
	void convert() {
		int start_i=0;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U') {
				start_i = i;
				break;
			}
		}
		newword=word.substring(start_i).concat(word.substring(0,start_i));
	}
	
	// Display
	void output() {
		System.out.println("The original word is "+word);
		System.out.println("The converted word is "+newword);
	}
	
	// Main
	public static void main(String[] a) {
		Piglatin obj=new Piglatin();
		obj.input();
		obj.convert();
		obj.output();
	}

}
