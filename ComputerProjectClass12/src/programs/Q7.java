package programs;

import java.util.*;

public class Q7 {
	public static void main(String[] a) {
		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of matrix: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array: ");
		int arr[][] = new int[n][n];
		
		// New 1D array with indexes 
		int arr1D[] = new int[n*n];
		int rows[] = new int[n*n];
		int columns[] = new int[n*n];
		int f=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
				arr1D[f] = arr[i][j];
				rows[f] = i+1;
				columns[f] = j+1;
				f++;
			}
		}
		
		// Sort 1
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n-1-i; j++) {
					if(arr[k][j] > arr[k][j+1]) {
						int temp = arr[k][j];
						arr[k][j] = arr[k][j+1];
						arr[k][j+1] = temp;
					}
				}
			}
		}
		
		// Sort 2
		for(int i=0; i<f; i++) {
			for(int j=0; j<f-1-i; j++) {
				if(arr1D[j]<arr1D[j+1]) {
					int temp = arr1D[j];
					arr1D[j] = arr1D[j+1];
					arr1D[j+1] = temp;
					int temp1 = rows[j];
					rows[j] = rows[j+1];
					rows[j+1] = temp1;
					int temp2 = columns[j];
					columns[j] = columns[j+1];
					columns[j+1] = temp2;
				}
			}
		}
		
		// Display
		System.out.println("The largest element "+arr1D[0]+" is in row "+rows[0]+" and column "+columns[0]);
		System.out.println("The second largest element "+arr1D[1]+" is in row "+rows[1]+" and column "+columns[1]);
		System.out.println("Sorted list: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/**
 * Input:
 * 3
 * 
 * 5
 * 1
 * 3
 * 7
 * 4
 * 6
 * 9
 * 8
 * 2
 * 
 * Output:
 * The largest element 9 is in row 3 and column 1
 * The second largest element 8 is in row 3 and column 2
 * Sorted list: 
 * 1 3 5 
 * 4 6 7 
 * 2 8 9 
 */