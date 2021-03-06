package programs;

import java.util.*;

public class Q19 {
	int A[][];
	int MergeA[];
	int n;
	Scanner sc = new Scanner(System.in);
	Q19(){
		System.out.println("Enter the dimension of array: ");
		n = sc.nextInt();
		A = new int[n][n];
		MergeA = new int[n+n-1];
	}
	
	void input() {
		
		System.out.println("Fill the array");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				A[i][j] = sc.nextInt();
			}
		}
	}
	void merge() {
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					MergeA[k] = A[i][j];
					k++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j == (n-1) && i != j) {
					MergeA[k] = A[i][j];
					k++;
				}
			}
		}
	}
	void sort() {
		Arrays.sort(MergeA);
	}
	void display() {
		for(int i=0;i<n+n-1;i++) {
			System.out.print(MergeA[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Q19 obj = new Q19();
		obj.input();
		obj.merge();
		obj.sort();
		obj.display();
	}
}
/*
 * Input:
 * Enter the dimension of array: 
 * 3
 * Fill the array
 * 2
 * 5
 * 6
 * 8
 * 6
 * 7
 * 1
 * 2
 * 3
 * 
 * Output:
 * 1 2 3 6 6 
 */