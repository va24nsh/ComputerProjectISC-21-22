package programs;

import java.util.*;

public class Q9 {
	// Trim the blank spaces in the string
	String trimmed(String s) {
		StringTokenizer st = new StringTokenizer(s, " .?!");
		int c = st.countTokens();
		String new_s = "";
		for(int i=0; i<c; i++) {
			new_s += st.nextToken()+" ";
		}
		return new_s;
	}
	
	// Delete a particular word in the string 
	String delete(String s, String wrd, int in) {
		StringTokenizer st = new StringTokenizer(s, " .?!");
		int c = st.countTokens();
		String new_s = "";
		for(int i=0; i<c; i++) {
			String part_wrd = st.nextToken();
			if(!(wrd.equalsIgnoreCase(part_wrd))) {
			new_s += part_wrd +" ";
			}
			else {
				if(i != in-1) {
					return "Error!";
				}
			}
		}
		return new_s;
	}
	
	public static void main(String[] a) {
		Q9 obj = new Q9();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string terminated by a '.', '?' or '!' only");
		String str = sc.nextLine().toUpperCase();
		
		System.out.println(obj.trimmed(str));
		
		System.out.println("Enter the word to be deleted and it's position: ");
		String del_word = sc.nextLine();
		int n = sc.nextInt();
		
		System.out.println(obj.delete(obj.trimmed(str), del_word, n));
		
	}
}

/**
 * Input:
 * A HEALTHY  MIND   OF    LIVES   IN    A  HEALTHY            BODY.
 * OF
 * 4
 * 
 * Output:
 * A HEALTHY MIND LIVES IN A HEALTHY BODY
 */
