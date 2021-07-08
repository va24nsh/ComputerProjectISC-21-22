package programs;

import java.util.*;

public class Q23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int p, q, r;
		p = sc.nextInt();
		q = sc.nextInt();
		r = sc.nextInt();
		if(p>q && p>r) {
			System.out.print(p+",");
			if(q>r) System.out.println(q+","+r);
			else System.out.println(r+","+q);
		}
		else if(q>p && q>r) {
			System.out.print(q+",");
			if(p>r) System.out.println(p+","+r);
			else System.out.println(r+","+p);
		}
		else if(r>q && r>p) {
			System.out.print(r+",");
			if(q>p) System.out.println(q+","+p);
			else System.out.println(p+","+q);
		}
		
		else System.out.println(p+","+q+","+r);
		sc.close();
	}
}
/**
 * Input:
 * Enter three numbers: 
 * 7
 * 2
 * 9
 * 
 * Output:
 * 9,7,2
 */