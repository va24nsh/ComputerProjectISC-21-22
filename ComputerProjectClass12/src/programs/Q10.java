package programs;

import java.util.*;

public class Q10 {
	// Eventual sum	
	int evSum(int n) {
		if(n < 10) return n;
		else {
			int sum = 0;
			while(n > 0) {
				sum += Math.pow(n%10,2);
				n /= 10;
			}
			return evSum(sum);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q10 obj = new Q10();
		System.out.println("Enter the number to be verified: ");
		int number = sc.nextInt();
		if(obj.evSum(number) == 1 || obj.evSum(number) == 7) System.out.println(number+" is a Happy Number");
		else System.out.println(number+" is not a happy number");
	}
}
/**
 * Input:
 * Enter the number to be verified: 
 * 28
 * 
 * Output:
 * 28 is a Happy Number
 */