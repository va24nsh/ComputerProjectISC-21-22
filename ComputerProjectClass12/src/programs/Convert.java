package programs;

import java.util.*;

public class Convert {
	int binum, decinum;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		binum = sc.nextInt();
		String check = Integer.toString(binum);
		if(check.indexOf('2') >= 0 || check.indexOf('3') >= 0 || check.indexOf('4') >= 0 || check.indexOf('5') >= 0 || check.indexOf('6') >= 0 || check.indexOf('7') >= 0 || check.indexOf('8') >= 0 || check.indexOf('9') >= 0){
			System.out.println("Wrong Input!!");
			System.exit(0);
		}
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
 * Enter the binary number: 
 * 1101
 * 
 * Output:
 * Decimal equivalent is: 13
 */