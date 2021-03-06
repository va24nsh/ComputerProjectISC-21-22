package programs;

import java.util.*;

public class Q5 {
	public static void main(String[] a) {
		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a paragraph: ");
		String para = sc.nextLine();
		
		// Breaking the paragraph into sentences and storing in an array
		StringTokenizer st = new StringTokenizer(para, "!?.");
		int count = st.countTokens();
		String arr[] = new String[count];
		int arr2[] = new int[count];
		for(int i=0; i<count; i++) {
			String one = st.nextToken();
			arr[i] = one;
			StringTokenizer s = new StringTokenizer(one, " ");
			arr2[i] = s.countTokens();
		}
		
		// Sorting
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2.length-1-i; j++) {
				if(arr2[j]>arr2[j+1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
					String t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
		// Display the output
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" = "+arr2[i]);
		}
	}
}
/**
 * Input:
 * Whose dog is this? Oh! It is yours.
 *
 * Output:
 * Oh = 1
 * It is yours = 3
 * Whose dog is this = 4 
 */

