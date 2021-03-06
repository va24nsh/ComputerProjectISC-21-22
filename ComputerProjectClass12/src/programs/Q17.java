package programs;

import java.util.*;

public class Q17 {
	int b[][];
	int m, n;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m >= 3 and value of n <= 7");
		m = sc.nextInt();
		n = sc.nextInt();
		if(m < 3 || n > 7) {
			System.out.println("Wrong Input");
			System.exit(0);
		}
		b = new int[m][n];
		System.out.println("Fill the array: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}
	
	void sort_acc(int a[]) {
		for(int i=0 ; i<a.length-1 ; i++) {
			for(int j=0 ; j<a.length-i-1 ; j++) {
				if(a[j] > a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	
	void sort_dec(int a[]) {
		for(int i=0 ; i<a.length-1 ; i++) {
			for(int j=0 ; j<a.length-i-1 ; j++) {
				if(a[j] < a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	void calc() {
		for(int j=0; j<n; j++) {
			if(j%2 == 0) {
				sort_acc(b[j]);
			}
			else
			{
				sort_dec(b[j]);
			}
		}
	}
	
	void display() {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Q17 obj = new Q17();
		obj.input();
		obj.calc();
		obj.display();
	}
}
/**
 * Input:
 * Enter the value of m >= 3 and value of n <= 7
 * 4
 * 4
 * Fill the array: 
 * 6
 * 2
 * 3
 * 8
 * 3
 * 4
 * 9
 * 1
 * 2
 * 7
 * 4
 * 8
 * 4
 * 5
 * 6
 * 1
 * 
 * Output:
 * 2 3 6 8 
 * 9 4 3 1 
 * 2 4 7 8 
 * 6 5 4 1 
 */