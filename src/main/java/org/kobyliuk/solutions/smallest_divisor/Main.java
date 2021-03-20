package org.kobyliuk.solutions.smallest_divisor;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/8927
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = in.nextLong();
        long res = 1;

        for (long i = 2; i < Math.sqrt(n) + 1; i++){

            if (n % i == 0){
                res = i;
                break;
            }
        }

        if (res == 1) res = n;

        out.println(res);
        out.flush();
    }
}
