package org.kobyliuk.solutions.number_of_words;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/909
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String text = in.nextLine();
        boolean isLetter = false;
        int wordCount = 0;

        for (Character ch : text.toCharArray()){

            if (Character.isLetter(ch) && !isLetter){
                wordCount++;
                isLetter = true;
            };

            if (!Character.isLetter(ch) && isLetter){
                isLetter = false;
            }
        }
        out.println(wordCount);
        out.flush();
    }
}
