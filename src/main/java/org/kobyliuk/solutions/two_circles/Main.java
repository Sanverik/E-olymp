package org.kobyliuk.solutions.two_circles;

import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.StrictMath.pow;

/**
 * Link : https://www.e-olymp.com/en/problems/2
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double r1 = in.nextDouble();

        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double r2 = in.nextDouble();


        double centerDistance = Math.sqrt(pow(x1-x2, 2) + pow(y1-y2, 2));

        if (x1 == x2 && y1 == y2 && r1 == r2){
            out.println(-1);
        }else if (centerDistance > r1 + r2 || centerDistance + Math.min(r1, r2) < Math.max(r1, r2)){
            out.println(0);
        } else if (centerDistance == Math.abs(r1 - r2) || centerDistance == r1 + r2){
            out.println(1);
        } else {
            out.println(2);
        }

        out.flush();
    }
}
