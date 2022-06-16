package GFG_Mathematical;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static long factorial(int N){
        // code here
        if(N==0 || N==1)
            return 1;
        else{
            return N*factorial(N-1);
        }
    }
}
