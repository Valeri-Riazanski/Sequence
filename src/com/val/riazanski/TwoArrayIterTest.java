package com.val.riazanski;

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
            String[][] str = createArray(n);
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    System.out.print(str[j][i] + " ");
                    if (i + j == 9) {
                        System.out.print(ConosoleColors.BLUE + str[j][i] + " " + ConosoleColors.RESET);
                    }
                }
                System.out.print('\n');
            }
            StringTwoArray s2a = new StringTwoArray(str);
            TwoArrayIterator iter = s2a.createIterator();
            System.out.println("проверяем работу итератора, ");
            System.out.println(ConosoleColors.BLUE + "перебор элементов в матрице проходит по диагонали сверху вниз, справа налево " + ConosoleColors.RESET);
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
    }
}


