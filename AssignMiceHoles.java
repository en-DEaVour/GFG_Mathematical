package GFG.Mathematical;

//Input:
//
//N = 3
//M = {4, -4, 2}
//H = {4, 0, 5}
//
//Output:
//4
//
//Explanation:
//If we assign mouse at 1st index to
//the hole at 1st, mouse at 2nd index
//to the hole at 2nd and the third to
//the hole at third. Then, the maximum
//time taken will be by the 2nd mouse,
//i.e. 4-0 = 4 minutes.

import java.util.Arrays;

public class AssignMiceHoles {
    public static void main(String[] args) {
        System.out.println(assignMiceHoles(3, new int[]{4,2,2}, new int[]{6,7,1}));
    }
    static int assignMiceHoles(int N , int[] M , int[] H) {
        // code here

        // Sorting the Mice
        Arrays.sort(M);

        // Sorting the holes

        Arrays.sort(H);
        int res = 0;
        for(int i = 0 ; i < N ; i++){
            res = Math.max(res , Math.abs(M[i] - H[i]));
        }

        return res;
    }
}
