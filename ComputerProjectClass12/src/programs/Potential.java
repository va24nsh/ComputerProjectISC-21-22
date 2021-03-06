package programs;

import java.util.*;

public class Potential {
	String str;
	int sum;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		if(str.charAt(str.length()-1) != '.' && str.charAt(str.length()-1) != '?') {
			System.out.println("Wrong string input.");
			System.exit(0);
		}
		sc.close();
	}
	
	void calculation() {
		sum = 0;
		str = str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) {
				sum += (int)ch - 64;
			}
		}
	}
	
	void display() {
		System.out.println("Potential is: "+sum);
	}
	
	public static void main(String args[]) {
		Potential obj = new Potential();
		obj.input();
		obj.calculation();
		obj.display();
	}
}
/**
 * Input:
 * Enter the string: 
 * Did7@ Ate &9?
 * 
 * Output:
 * Potential is: 43
 */