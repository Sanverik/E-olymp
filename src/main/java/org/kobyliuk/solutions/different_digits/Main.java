package org.kobyliuk.solutions.different_digits;

import java.io.PrintWriter;
import java.util.*;

/**
 * Link : https://www.e-olymp.com/en/problems/8533
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int startN = in.nextInt();
        int endN = in.nextInt();

        StringJoiner stringJoiner = new StringJoiner(" ");

        for (int i = startN; i <= endN; i++){

            String strN = String.valueOf(i);
            long n = strN.chars().distinct().count();
            if (n == 4) stringJoiner.add(strN);
        }

        out.println(stringJoiner);
        out.flush();
    }
}
