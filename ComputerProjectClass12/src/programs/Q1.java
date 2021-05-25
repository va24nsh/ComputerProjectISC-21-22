package programs;

import java.util.*;

public class Q1 {
	boolean check_Kaprekar(int n){
        int sq = n*n;
        String sq_st = Integer.toString(sq);
        int index_cut = sq_st.length()/2;
        String left = sq_st.substring(0,index_cut);
        String right = sq_st.substring(index_cut);
        //System.out.println(left);
            //System.out.println(right);
        int left_int=0, right_int=0;
        if(left.length()>0) {
        	left_int = Integer.parseInt(left);
        }	
        if(right.length()>0) {
        	right_int = Integer.parseInt(right);
        }
        
        if(left_int+right_int == n) return true;
        else return false;
    }
    void calculations(int start, int end){
        int count = 0;
        System.out.print("Kaprekar Numbers are \t");
        for(int i = start;i <= end; i++){
            if(check_Kaprekar(i)){
                System.out.print(i);
                if(i == end) System.out.print(".");
                else System.out.print(",");
                count++;
            }
        }
        System.out.print("\t Frequency = "+count);
    }
    public static void main(String[] a){
        Q1 obj = new Q1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end values.");
        int start_i = sc.nextInt();
        int end_i = sc.nextInt();
        obj.calculations(start_i, end_i);
        sc.close();
    }

}
