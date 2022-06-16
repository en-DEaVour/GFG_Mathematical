package GFG_Mathematical;

public class CountSquares {
    public static void main(String[] args) {
        //countSquares(16);
        System.out.println(countSquares(16));

    }
    static int countSquares(int N) {
        // code here
        int i =1;
        int count = 0;
        while((i*i)<N)
        {
            i++;
            count++;
        }
        return count;
    }
}
