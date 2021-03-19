package org.kobyliuk.solutions.simple_problem;

import java.io.*;
import java.util.*;

/**
 * Link : https://www.e-olymp.com/en/problems/1
 * Status :  Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {
    public static void main(String[] args)   {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String input = in.next();

        out.println(input.charAt(0) +" " + input.charAt(1));

        out.flush();
    }
}