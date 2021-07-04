package programs;

import java.util.*;

public class Count {
	String st;
	int v, c, s, sp;
	Count() {
		st = "";
		v = 0;
		c = 0;
		s = 0;
		sp = 0;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be validated: ");
		st = sc.nextLine();
		Count_Char(st, 0);
		sc.close();
	}
	
	void Count_Char(String strin, int n) {
		if(strin.equalsIgnoreCase("")) {
			System.exit(0);
		}
		else {
			if(Character.isWhitespace(strin.charAt(n))) {
				s++;
			}
			else if(strin.charAt(n) == 'A' ||strin.charAt(n) == 'E' ||strin.charAt(n) == 'I' || strin.charAt(n) == 'O' || strin.charAt(n) == 'U' || strin.charAt(n) == 'a' || strin.charAt(n) == 'e' || strin.charAt(n) == 'i' || strin.charAt(n) == 'o' || strin.charAt(n) == 'u') {
				v++;
			}
			else if(Character.isLetter(strin.charAt(n))) {
				c++;
			}
			else sp++;
			
			Count_Char(strin.substring(n+1), 0);
		}
	}
	void display() {
		System.out.println(v+" "+c+" "+s+" "+sp);
	}
	
	public static void main(String[] a) {
		Count obj = new Count();
		obj.input();
		obj.display();
	}
	
	
}
