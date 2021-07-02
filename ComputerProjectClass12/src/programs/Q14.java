package programs;

import java.util.*;

public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size and then Fill the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n ; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			int f = 0;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					f=1;
					continue;
				}
			}
			if(f == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}

/**
 * Input: 
 * 10
 * 2 5 4 6 2 7 3 8 2 6
 * 
 * Output:
 * 2 5 4 6 7 3 8
 */
