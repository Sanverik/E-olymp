package org.kobyliuk.solutions.persistent_number;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Link : https://www.e-olymp.com/en/problems/8711638
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

       while (in.hasNext()){
           int res = calcPesistence(in.nextInt());
           out.println(res);
       }

       out.flush();
    }

    private static int calcPesistence(int number){

        int persintentOfNumber = 0;
        int newNumber = 1;
        while (number  > 9){
            newNumber *= number % 10;
            number /= 10;
            if (number  < 10){
                number *= newNumber;
                newNumber = 1;
                persintentOfNumber++;
            }
        }

        return persintentOfNumber;
    }
}
