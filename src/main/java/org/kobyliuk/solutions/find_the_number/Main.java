package org.kobyliuk.solutions.find_the_number;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/8824
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();

        out.println((firstNumber + secondNumber)/2);
        out.flush();
    }
}
