package org.kobyliuk.solutions.odd_divisors;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/2863
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        for (int i = 1; i <= n; i += 2){
            if (n % i == 0){
                out.println(i);
            }
        }

        out.flush();
    }
}
