package programs;

import java.util.*;

public class Q24 {
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int a[] = new int[10];
	        System.out.println("Enter the elements: ");
	        for(int i=0;i<a.length;i++)
	        {
	            a[i] = sc.nextInt();
	        }
	        int f = 0;
	        for(int i=0;i<a.length;i++)
	        {
	            int c = 0;
	            for(int j=1;j<=a[i];j++)
	            {
	                if(a[i]%j == 0)
	                c++;
	            }
	            if(c == 2)
	            System.out.println(a[i]);
	            c = 0;
	        }
	        for(int i=0;i<a.length;i++)
	        {
	            int c = 0;
	            for(int j=1;j<=a[i];j++)
	            {
	                if(a[i]%j == 0)
	                c++;
	            }
	            if(c != 2)
	            {
	                if(a[i]%2 == 0)
	                System.out.println(a[i]);
	            }
	        }
	        for(int i=0;i<a.length;i++)
	        {
	            int c = 0;
	            for(int j=1;j<=a[i];j++)
	            {
	                if(a[i]%j == 0)
	                c++;
	            }
	            if(c != 2)
	            {
	                if(a[i]%2 != 0)
	                System.out.println(a[i]);
	            }
	            sc.close();
	        }
	    }
	/*
	 * Input:
	 * Enter the elements 
	    11
	    12
	    13
	    14
	    15
	    16
	    17
	    18
	    19
	    20
	    
	    Output:
	    11
	    13
	    17
	    19
	    12
	    14
	    16
	    18
	    20
	    15
	     */
}