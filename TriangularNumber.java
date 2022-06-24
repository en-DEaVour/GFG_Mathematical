package GFG.Mathematical;

//List Of Triangular Numbers
//0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55 and so on.

//So the sequence formed here is in the pattern:
//1, 1 + 2, 1 + 2 + 3, 1 + 2 + 3 + 4,  and so on.
public class TriangularNumber {
    public static void main(String[] args) {
        System.out.println(isTriangular(10));
    }

    static int isTriangular(int N) {
        //code here
        if (N < 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 1; sum <= N; i++) {
            sum = sum + i;

            if (sum == N) {
                return 1;
            }

        }

        return 0;
    }
}
