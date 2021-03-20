package org.kobyliuk.solutions.turtle;


import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/4018
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    private static int[][] matrix = new int[][]{
            {5, 9, 4, 3},
            {3, 1, 6, 9},
            {8, 6, 8, 12}};

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] matrix = new int[n][m];
        int[][] distances  = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = in.nextInt();
                distances[i][j] = Integer.MAX_VALUE;
            }
        }

        distances[0][0] = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > 0) {
                    distances[i][j] = Math.min(distances[i][j], distances[i - 1][j] + matrix[i][j]);
                }

                if (j > 0) {
                    distances[i][j] = Math.min(distances[i][j], distances[i][j - 1] + matrix[i][j]);
                }
            }
        }

        out.println(distances[n-1][m-1]);
        out.flush();
    }
}
