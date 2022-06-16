package GFG_Mathematical;

public class MaximumMoney {
    public static void main(String[] args) {
        maximizeMoney(5,14);
    }
    static void maximizeMoney(int N , int K) {
        // code here
        if(N%2!=0)
        {
            System.out.println( (N/2 + 1) * K);
        }
        else
        {
            System.out.println((N/2) * K);
        }
    }
}

