package GFG.Mathematical;

//Given a really large number N,
//break it into 3 whole numbers such that they sum up to the original number
//and count number of ways to do so.

//0 + 0 + 2 = 2
//0 + 2 + 0 = 2
//2 + 0 + 0 = 2
//0 + 1 + 1 = 2
//1 + 1 + 0 = 2
//1 + 0 + 1 = 2


//0+0+3 = 3
//0+3+0 = 3
//3+0+0 = 3
//0+1+2 = 3
//0+2+1 = 3
//1+0+2 = 3
//1+2+0 = 3
//2+0+1 = 3
//2+1+0 = 3
//1+1+1 = 3
public class BreakANumber {
    public static void main(String[] args) {
        System.out.println(waysToBreakNumber(2));
    }
    static int waysToBreakNumber(int N){
        // code here
        N++;
        return(N*(N+1)/2);
    }
}
