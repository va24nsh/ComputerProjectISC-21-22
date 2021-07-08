package programs;

import java.util.*;

public class Q25 {
	static boolean composite(int n) {
		int fac=0;
		for(int i=1; i<n; i++) {
			if(n%1 == 0) {
				fac++;
			}
		}
		return fac>2?true:false;
	}
	
	static boolean magic(int n) {
		int sum=0;
		while(n > 0 || sum > 9) {
			if(n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n%10;
			n /= 10;
		}
		return (sum == 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start and end index: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++) {
			if(composite(i) && magic(i)) {
				System.out.println(i+" is a composite magic number");
			}
		}
		sc.close();
	}
}
/**
 * Input:
 * Enter the start and end index: 
 * 1
 * 100
 * 
 * Output:
 * 10 is a composite magic number
 * 19 is a composite magic number
 * 28 is a composite magic number
 * 37 is a composite magic number
 * 46 is a composite magic number
 * 55 is a composite magic number
 * 64 is a composite magic number
 * 73 is a composite magic number
 * 82 is a composite magic number
 * 91 is a composite magic number
 * 100 is a composite magic number
 */