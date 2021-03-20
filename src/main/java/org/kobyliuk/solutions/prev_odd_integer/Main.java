package org.kobyliuk.solutions.prev_odd_integer;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/8885
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int res =  n - 1 - (Math.abs(n) % 2);

        out.println(res);
        out.flush();
    }
}
