package programs;

import java.util.*;

public class Q21 {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of order: ");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        String b ="";
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==j) || (i+j)==(n-1))
                sum = sum + a[i][j];
                if((i==0)||(i==(n-1))||(j==0)||(j==(n-1)))
                b = b + Integer.toString(a[i][j]) + " ";
            }
        }
        System.out.println("Sum is: "+sum);
        StringTokenizer st = new StringTokenizer (b);
        int l = st.countTokens();
        int ar[] = new int[l];
        for(int i=0;i<l;i++)
        {
            ar[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(ar);
        for(int i=0;i<l;i++)
        {
        	int count = 0;
            for(int j=1;j<=ar[i];j++)
            {
                if(ar[i]%j == 0)
                count++;
            }
            if(count == 2)
            System.out.print(ar[i]+" ");
         }
        in.close();
    }
}
/**
 * Input:
 * Enter the value of order: 
 * 3
 * 
 * Output:
 * Enter the numbers: 
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * Sum is 25
 * 2 3 7 
 */