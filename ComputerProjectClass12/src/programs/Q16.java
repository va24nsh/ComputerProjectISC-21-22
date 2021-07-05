package programs;

import java.util.*;

public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q16 obj = new Q16();
		System.out.println("Enter the string: ");
		String s_args = sc.nextLine();
		obj.stringmanipulation(s_args);
		sc.close();
	}
	
	void stringmanipulation(String s) {
		System.out.println("The String is: "+s);
		StringTokenizer st = new StringTokenizer(s);
		int wrds_len = st.countTokens();
		String smallest_word = st.nextToken();
		String tok;
		for(int i=0; i<wrds_len-1; i++) {
			tok = st.nextToken();
			if(tok.length() <= smallest_word.length()) {
				smallest_word = tok;
			}
		}
		st = new StringTokenizer(s);
		for(int i=0; i<wrds_len; i++) {
			tok = st.nextToken();
			if(tok.length() == smallest_word.length()) {
				System.out.println("One of the smallest words are: "+tok);
			}
		}
		st = new StringTokenizer(s);
		for(int i=0; i<wrds_len; i++) {
			tok = st.nextToken();
			if(tok.indexOf(smallest_word) != -1 && !(tok.equalsIgnoreCase(smallest_word))) {
				System.out.println("The word "+tok+" contains the smallest word");
			}
		}
		
	}
}
/**
 * Input:
 * Enter the string: 
 * i am a vansh
 * 
 * Output:
 * The String is: i am a vansh
 * One of the smallest words are: i
 * One of the smallest words are: a
 * The word am contains the smallest word
 * The word vansh contains the smallest word
 */