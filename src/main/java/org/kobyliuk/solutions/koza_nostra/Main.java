package org.kobyliuk.solutions.koza_nostra;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/8927
 * Status :  Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int res = 0;

        if (n == 1) res = 2;
        else if (n == 2) res = 3;
        else if (n == 3) res = 4;
        else {
            int prev = 3, curr = 4;
            for (int i = 4; i<= n; i++){
                res = prev + curr;
                prev = curr;
                curr = res;
            }
        }

        out.println(res);
        out.flush();
    }
}
