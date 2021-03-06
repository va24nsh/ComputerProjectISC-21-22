package programs;

import java.util.*;

public class Q8 {
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		count(n);
	}
	void count(int number) {
		int temp = number;
		int count_digit = 0;
		while(number>0) {
			count_digit++;
			number /= 10;
		}
		check(temp, count_digit);
	}
	void check(int num, int c) {
		int arr[] = new int[c];
		for(int i = 0; i < c; i++) {
			arr[i] = num%10;
			num /= 10;
		}
		
		int f_inc = 0;
		int f_dec = 0;
		for(int i=0; i<c-1; i++) {
			if(arr[i]<arr[i+1]) {
				f_inc = 1;
			}
			if(arr[i]>arr[i+1]) {
				f_dec = 1;
			}
		}
		if(f_inc == 1 && f_dec == 1) {
			System.out.println("Bouncy Number");
		}
		else if(f_inc == 0 && f_dec == 1) {
			System.out.println("Increasing Number");
		}
		else {
			System.out.println("Decreasing Number");
		}
	}
	
	public static void main(String[] a) {
		Q8 obj = new Q8();
		obj.input();
	}

}
/**
 * Input:
 * 4478
 * Output:
 * Increasing Number
 * 
 * Input:
 * 95310
 * Output
 * Decreasing Number
 * 
 * Input:
 * 805349
 * Output:
 * Bouncy Number
 */
