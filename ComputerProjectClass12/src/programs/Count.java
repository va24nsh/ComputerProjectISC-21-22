package programs;

import java.util.*;

public class Count {
	String st;
	int v, c, s, sp;
	Count() {
		st = "";
		v = 0;
		c = 0;
		s = 0;
		sp = 0;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be validated: ");
		st = sc.nextLine();
		Count_Char(st, 0);
		sc.close();
	}
	
	void Count_Char(String strin, int n) {
		if(n<st.length())
        {
            char ch = st.charAt(n);
            int a = (int)ch;
            
            // Check if the string has a number
            if(a >= 48 && a <= 57)
            {
              System.out.println("Wrong Input");
              System.exit(0);
            }
            
            // Check if the string has a special character
            else if((a>32 && a<=47) || (a>=58 && a<= 64)|| (a>=91 && a<=96)|| (a>=123 && a<=126))
            {
                sp++;
            }
            
            // Check for space
            else if(a == 32)
            s++;
            
            // Check for vowels
            else if((ch==97 || ch==101 || ch==105 || ch==111 || ch==117 || 
            ch==65 || ch==69  || ch==73  || ch==79  || ch==85))
            {
               v++;
            }
            
            // Consonants
            else
            c++;
            Count_Char(st,n+1);
        }
        else
        {
           System.out.println("Number of vowels = "+v); 
           System.out.println("Number of consonants = "+c); 
           System.out.println("Number of spaces = "+s); 
           System.out.println("Number of secial characters = "+sp);
        }            
	}
	
	public static void main(String[] a) {
		Count obj = new Count();
		obj.input();
	}
}
/**
 * Input:
 * vansh
 * 
 * Output:
 * Number of vowels = 1
 * Number of consonants = 4
 * Number of spaces = 0
 * Number of special characters = 0 
 */