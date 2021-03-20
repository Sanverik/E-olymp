package org.kobyliuk.solutions.wertyu;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Link : https://www.e-olymp.com/en/problems/2034
 * Status : Accepted
 *
 * @author Andrii kobyliuk
 */
public class Main {

    private static Map<Character, String> table = new HashMap<>();

    static {
        table.put('1', "`");
        table.put('2', "1");
        table.put('3', "2");
        table.put('4', "3");
        table.put('5', "4");
        table.put('6', "5");
        table.put('7', "6");
        table.put('8', "7");
        table.put('9', "8");
        table.put('0', "9");
        table.put('-', "0");
        table.put('=', "-");

        table.put('W', "Q");
        table.put('E', "W");
        table.put('R', "E");
        table.put('T', "R");
        table.put('Y', "T");
        table.put('U', "Y");
        table.put('I', "U");
        table.put('O', "I");
        table.put('P', "O");
        table.put('[', "P");
        table.put(']', "[");

        table.put('S', "A");
        table.put('D', "S");
        table.put('F', "D");
        table.put('G', "F");
        table.put('H', "G");
        table.put('J', "H");
        table.put('K', "J");
        table.put('L', "K");
        table.put(';', "L");
        table.put('\'', ";");
        table.put('\\', "'");

        table.put('X', "Z");
        table.put('C', "X");
        table.put('V', "C");
        table.put('B', "V");
        table.put('N', "B");
        table.put('M', "N");
        table.put(',', "M");
        table.put('.', ",");
        table.put('/', ".");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        StringJoiner sj = new StringJoiner("\n");
        while (in.hasNextLine()){
            String line = in.nextLine();
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()){
                sb.append(table.getOrDefault(c, String.valueOf(c)));
            }
            sj.add(sb.toString());
        }

        out.println(sj.toString());
        out.flush();
    }
}
