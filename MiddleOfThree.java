package GFG_Mathematical;

import java.sql.SQLOutput;

public class MiddleOfThree {
    public static void main(String[] args) {
        middle(107,95,70);
    }
    static void middle(int A, int B, int C){
        //code here
        if(A>B && A<C || A>C && A<B)
        {
            System.out.println(A);
        }
        else if(B>A && B<C || B>C && B<A)
        {
            System.out.println(B);
        }
        else
        {
            System.out.println(C);
        }

    }
}
