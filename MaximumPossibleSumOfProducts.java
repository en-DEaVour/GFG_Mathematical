package GFG.Mathematical;

import java.util.Arrays;

public class MaximumPossibleSumOfProducts {
    public static void main(String[] args) {
        System.out.println(MaxSum(new long[]{3,2,1},new long[]{1,2,3},3));

    }
    static long MaxSum(long []A, long []B, int N)
    {
        // code here
        Arrays.sort(A);
        Arrays.sort(B);

        long sum =0;
        for(int i =0 ; i<N; i++)
        {
            sum = sum + A[i]*B[i];
        }

        return sum;
    }
}
