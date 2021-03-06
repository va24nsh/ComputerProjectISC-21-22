package programs;

import java.util.*;

public class Fascinating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		String concatenated = Integer.toString(num) + Integer.toString(num*2) + Integer.toString(num*3);
		char arr[] = new char[concatenated.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = concatenated.charAt(i);
		}
		
		int f=1;
		Arrays.sort(arr);
		int check = 0;
		for(char ch: arr) {
			check += 1;
			if((int)ch-48 == check) {
				continue;
			}
			else {
				f=0;
				break;
			}
		}
		if(f == 1) {
			System.out.println("Fascinating number");
		}
		else {
			System.out.println("Not a fascinating number");
		}
	}
	

}
/**
 * Input:
 * Enter a number: 
 * 192
 * 
 * Output:
 * Fascinating number
 */