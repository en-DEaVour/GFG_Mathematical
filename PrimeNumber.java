package GFG_Mathematical;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(23));
    }

    static int isPrime(int N) {

        int count = 0;
        for (int div = 2; div * div <= N; div++) {
            if (N % div == 0) {
                count++;
                break;
            }
        }

        if (count == 0 && N == 0 || N == 1) {
            return 0;
        }
        if (count == 0) {
            return 1; //System.out.println("Prime");
        }
        return 0; // Not a Prime

    }
}

