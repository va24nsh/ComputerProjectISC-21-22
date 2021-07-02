package programs;

import java.util.*;

public class ST {
	String str;
	char vow[][];
	int c;
	String ofVow;
	
	ST(){
		str = "";
		c = 0;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = sc.nextLine();
	}
	
	void count() {
		String ofVow = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				ofVow = ofVow + ch + "";
				c++;
			}
		}
		if(c%2 != 0) {
			c++;
		}
		arr(ofVow);
	}
	
	void arr(String oV) {
		System.out.println(oV);
		vow = new char[c/2][c/2];
		int k=-1;
		for(int i=0; i<c/2; i++) {
			for(int j=0; j<c/2; j++) {
				k++;
				vow[i][j] = oV.charAt(k);
			}
		}
	}
	
	
	void display() {
		for(int i = 0 ; i < c/2; i++) {
			for(int j=0; j<c/2; j++) {
				System.out.print(vow[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ST obj = new ST();
		obj.input();
		obj.count();
		obj.display();
	}
	
}

/**
 * Input:
 * vanhsmaurya 
 * 
 * Output:
 * a a
 * u a
 */
