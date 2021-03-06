package programs;

import java.util.*;

public class Q15 {
	int num;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be validated: ");
		num = sc.nextInt();
		if(num < 0) {
			System.out.println("Wrong Input, the number must be a positive whole number.");
			System.exit(0);
		}
		sc.close();
	}
	
	void drabon() {
		// Binary Equivalent
		int temp=num;
		int ones=0;
		while(temp>0) {
			if(temp%2 == 1) {
				ones++;
			}
			temp /= 2;
		}
		
		// Check
		if(ones%2 == 0) {
			System.out.println(num+" is a drabon number");
		}
		else {
			System.out.print(num+" is not a drabon number");
		}
	}
	
	public static void main(String[] args) {
		Q15 obj = new Q15();
		obj.input();
		obj.drabon();
	}	
}
/**
 * Input: 
 * 5
 * 
 * Output:
 * 5 is a drabon number
 */