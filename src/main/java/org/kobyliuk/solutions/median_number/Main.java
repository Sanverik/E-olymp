package org.kobyliuk.solutions.median_number;

/**
 * Link : https://www.e-olymp.com/en/problems/8711759
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        if (n1 > n2 && n2 > n3 || n3 > n2 && n2 > n1 ){
            out.println(n2);
        } else if (n2 > n3 && n3 > n1 || n1 > n3 &&  n3 > n2){
            out.println(n3);
        } else {
            out.println(n1);
        }

        out.flush();
    }
}