package programs;

import java.util.*;

public class Q12 {
	int find(int a[],int n,int num)
	    {
	        if(a[n-1] == num)
	        	return(1);
	        else if(a[n-1] > num)
	        	return(0);
	        
	        int t = 0;
	        for(int i=0;i<n;i++)
	        {
	          t = t+a[i];
	        }
	        for(int i=0;i<n;i++)
	        {
	          if(i<(n-1))
	          a[i] = a[i+1];
	          if(i==(n-1))
	          a[n-1] = t;
	        }
	        t = 0;
	        return find(a,n,num);
	    }
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        Q12 obj = new Q12();
	        System.out.println("Enter the number: ");
	        int num = sc.nextInt();
	        String s = Integer.toString(num);
	        int l = s.length();
	        int a[] = new int[l];
	        int temp = num;
	        for(int i=l-1;i>=0;i--)
	        {
	            a[i] = temp%10;
	            temp /= 10;
	        }
	        int f = obj.find(a,l,num);
	        if(f == 1)
	        System.out.println("\n" + num+" is a Keith number");
	        else if(f == 0)
	        System.out.println("\n"+num+" is not a Keith number");
	    }
}
/**
 * Input:
 * 197
 * 
 * Output:
 * 197 is a keith number
 */