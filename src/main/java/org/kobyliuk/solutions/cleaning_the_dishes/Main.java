package org.kobyliuk.solutions.cleaning_the_dishes;

import java.io.PrintWriter;
import java.util.*;

/**
 * Link : https://www.e-olymp.com/en/problems/8712033
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    private static Deque<Integer> dirtyDishes = new LinkedList<>();
    private static Deque<Integer> washedDishes = new LinkedList<>();
    private static Deque<Integer> dryDishes = new LinkedList<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int totalDishes = in.nextInt();
        for (int i = 1; i <= totalDishes; i++){
            dirtyDishes.add(i);
        }

        while (in.hasNext()){
            int type = in.nextInt();
            int count = in.nextInt();

            if (type  == 1){
                clean(count);
            }

            if (type == 2){
                dry(count);
            }
        }

        StringJoiner stringJoiner = new StringJoiner("\n");
        dryDishes.forEach(d -> stringJoiner.add(String.valueOf(d)));

        out.println(stringJoiner);
        out.flush();

    }

    private static void clean(int n){

        for (int i = 0; i < n; i++){
            if (!dirtyDishes.isEmpty()){
                int dishId = dirtyDishes.getFirst();
                dirtyDishes.removeFirst();
                washedDishes.addFirst(dishId);
            }
        }
    }

    private static void dry(int n){
        for (int i = 0; i < n; i++){
            if (!washedDishes.isEmpty()){
                int dishId = washedDishes.getFirst();
                washedDishes.removeFirst();
                dryDishes.addFirst(dishId);
            }
        }
    }
}