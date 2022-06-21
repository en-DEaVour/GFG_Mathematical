package GFG.Mathematical;

public class SubtractionAndTwoNumbers {
    public static void main(String[] args) {
        System.out.println(repeatedSubtraction(10,20));
    }
   static int repeatedSubtraction(int A,int B){
        //code here
        int count=0;
        while(A>0 && B>0){
            if(A>B){
                A=A-B;
                count++;
            }
            else{
                B=B-A;
                count++;
            }
        }
        return count;
    }
}
