package com.val.riazanski;

import java.util.Arrays;

import static java.lang.Math.incrementExact;
import static java.lang.Math.random;

public class TwoArrayIterTest {
    public static String[][] createArray(int n) {
        final int valueAlphabet = 26;
        final int shift = 97;
        String[][] strings = new String[n][n];
        char firstChar;
        char secondChar;
        System.out.println("создали 2D массив из строк");
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                firstChar = (char) ((int) (shift + valueAlphabet * random()));
                secondChar = (char) ((int) (shift + valueAlphabet * random()));
                strings[i][k] = "" + firstChar + secondChar;
                //System.out.println(i + " " + strings[i][k]);
            }
        }
        return strings;

    }
        public static void main(String[] args){
            int n = 10;
            String str[][] = createArray(n);
            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(str[i]));
            }
            StringTwoArray s2a = new StringTwoArray(str);
            TwoArrayIterator iter = s2a.createIterator();
            System.out.println("проверяем итератор, должны перебирать элементы в матрице по диагонали");
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
    }
}


