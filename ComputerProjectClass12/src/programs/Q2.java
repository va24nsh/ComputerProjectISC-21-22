package programs;

import java.util.*;

public class Q2 {
	public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        String ones[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String teens[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String tens[] = {"ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        
        int a=0,b=0,c=0;
        String result="";
        
        if(n>=1000){
            System.out.println("Out of range.");
        }
        else{
            if(n>=100){
                a=n/100;
                result = ones[a-1] + " hundred ";
                n=n%100;
                if(n>0) result += " and ";
            }
            if(n>=20){
                b=n/10;
                result += tens[b-1];
                if(n%10 != 0) result += " " + ones[n%10 - 1];
            }
            else if(n>10 && n<20){
                c = n%10;
                result += teens[c-1];
            }
            else if(n<10 && n>0){
                result += ones[n-1];
                if(n==0) result += "zero";
            }
            else if(n==10) result += tens[0];
            else result += "zero";
        }
        System.out.println(result);
    }

}

/**
 * Input:
 * 517
 * Output:
 * five hundred and seventeen
 * 
 * Input:
 * 1008
 * Output:
 * Out of range.
 */
