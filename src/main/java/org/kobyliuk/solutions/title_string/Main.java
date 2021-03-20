package org.kobyliuk.solutions.title_string;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/8320
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        StringBuilder str = new StringBuilder(in.nextLine());
        boolean isLetter = false;


        for (int i = 0; i < str.length(); i++){

            char symbol = str.charAt(i);

            if (!isLetter && Character.isLetter(symbol)){
                isLetter = true;
                str.replace(i, i+1, String.valueOf(symbol).toUpperCase());
            }

            if (isLetter && !Character.isLetter(symbol)){
                isLetter = false;
            }
        }

        out.println(str.toString());
        out.flush();
    }
}
