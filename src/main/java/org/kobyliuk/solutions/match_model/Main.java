package org.kobyliuk.solutions.match_model;

import java.io.*;
import java.util.*;

/**
 * Link : https://www.e-olymp.com/en/problems/3
 * Status :  TODO - Partially accepted, 78%
 *
 * @author Andrii kobyliuk
 */
import static java.lang.StrictMath.pow;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();

        int i = 0, k = 1, res;

        for (; k < N; i++) {
            k = (int) pow(i + 1, 3);
        }

        if (i == 0) i++;

        if ((i - 1) * (i - 1) * (i - 1) < N && N <= (i - 1) * (i - 1) * i) {
            res = (int) (3 * (i - 1) * pow(i, 2));
            N -= (int) pow(i - 1, 3);
        } else if ((i - 1) * (i - 1) * i < N && N <= (i - 1) * i * i) {
            res = (int) (3 * pow(i - 1, 3) + 9 * pow(i - 1, 2) + 7 * (i - 1) + 1);
            res -= pow(i - 1, 2) * i;
        } else if ((i - 1) * i * i < N && N <= i * i * i) {
            res = (int) (3 * (pow(i, 3) + pow(i, 2)) - i - 1);
            N -= (int) pow(i, 2) * (i - 1);
        } else {
            return;
        }

        for (int i1 = 1; N > 0; i1 += 2) {
            for (int i2 = 0; i2 < i1 && N > 0; i2++, N--) {
                if (i1 == 1) {
                    res += 8;
                } else if (i2 == 0 || i2 == i1 / 2) {
                    res += 5;
                } else {
                    res += 3;
                }
            }
        }

        out.println(res);
        out.flush();
    }

}