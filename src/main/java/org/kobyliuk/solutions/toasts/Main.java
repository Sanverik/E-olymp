package org.kobyliuk.solutions.toasts;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/510
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();
        int res;

        if (n == 0){
            res = 0;
        } else if (n <= k){
            res = 4;
        } else {
            res = 2*n/k;
            if (2*n % k != 0){
                res++;
            }
            res *= 2;
        }

        out.println(res);
        out.flush();
    }
}
