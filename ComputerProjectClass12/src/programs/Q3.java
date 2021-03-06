package programs;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.println("Enter the values in the array: ");
        int a[][] = new int[m][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        } // input of the first array
        
        // Calculations
        int c[][] = new int[m][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                for(int k=0; k<m; k++){
                    c[i][j] += a[i][k]*a[j][k];
                }
            }
        }
        
        // Display output
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

}

/**
 * Input:
 * 3
 * 1
 * 2
 * 3
 * 1
 * 2
 * 3
 * 1
 * 2
 * 3
 * 
 * Output:
 * 14 14 14
 * 14 14 14
 * 14 14 14
 */
