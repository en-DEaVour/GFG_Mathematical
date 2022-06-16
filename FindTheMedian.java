package GFG_Mathematical;

import java.util.Arrays;

public class FindTheMedian {
    public static void main(String[] args) {

        find_median(new int[]{90,100,78,89,67});
    }

     static void find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int length  = v.length/2;
        if(v.length%2==1)
        {
            int median = v[length];
            System.out.println(median);
        }
        else {
            int median = (v[length]+ v[length-1])/2;
            System.out.println(median);
        }
//        for(int i=0;i<v.length;i++) {
//            System.out.println(v[i]);
//        }
    }

}
