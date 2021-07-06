package programs;

import java.util.*;

public class Convert {
	int binum, decinum;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		binum = sc.nextInt();
		sc.close();
	}
	int bintodeci(int d, int p) {
		if(d == 0) return 0;
		else {
			return ((d%10) * (int)Math.pow(2,p)) + bintodeci(d/10 , p+1); 
		}
	}
	void display() {
		decinum = bintodeci(binum, 0);
		System.out.println("Decimal equivalent is: "+decinum);
	}
	
	public static void main(String[] args) {
		Convert obj = new Convert();
		obj.input();
		obj.display();
	}
}
/*
 * Input:
 * Enter the decimal number: 
 * 1101
 * 
 * Output:
 * Decimal equivalent is: 13
 */