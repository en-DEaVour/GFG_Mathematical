package GFG_Mathematical;

public class CheckPerfectSquare {
    public static void main(String[] args) {

        System.out.println(checkPerfectSquare(35));
        System.out.println(checkPerfectSquare(49));
    }
    static int checkPerfectSquare(int N){
        // code here
        for(int i = 1; i*i <= N; i++){
            if(i*i == N){
                return 1;
            }
        }
        return 0;
    }
}
