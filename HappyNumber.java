package GFG.Mathematical;

//Explanation:

//19 is a Happy Number,
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1
//As we reached to 1,
//19 is a Happy Number.

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    static int isHappy(int N) {
        //code here
        int sum = 0, r;
        while (N != 0) {
            r = N % 10;
            sum = sum + (r * r);
            N = N / 10;
        }

        if (sum == 1)
            return 1;
        else if (sum < 10)
            return 0;
        else
            return isHappy(sum); // Recursion

    }
}
