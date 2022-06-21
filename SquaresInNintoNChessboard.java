package GFG.Mathematical;

import java.util.Scanner;

public class SquaresInNintoNChessboard {
    public static void main(String[] args) {
        //System.out.println(squaresInChessBoard(N));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N -: ");
        int N = sc.nextInt();

//        For a grid of size n*n the total number of squares formed are:
//        1^2 + 2^2 + 3^2 + ... + n^2 = n(n+1)(2n+1) / 6

        int Z = (N * (N + 1) / 2) * (2 * N + 1) / 3;
        System.out.println(Z);
    }
}
