package com.val.riazanski;

import java.util.Iterator;
import java.lang.String;

public class TwoArrayIterator implements Iterator {
        //fields
        private String[][] str;
        private int m = 1000;
        private int k;
        private int n;
        private int d = 2;
        int in;
        int id = 1;
        private Sequence sequence = new Sequence(m);
        private SequenceIterator iter = sequence.createIterator(m);
        //constructors
        public TwoArrayIterator(String[][] s) {
            this.str = s;
        }

        //methods
        @Override
        public String next() {
            String string = "OUT";
            in = iter.next();
            k = in - d * (d + 1) / 2 - 1;
            n = d - k - 2;
            System.out.print(in + " " + k + " " + n + " ");
            if (k < str.length && n < str.length) {
                string = str[k][n];
            }

            id++;
            if (id > d * (d - 1) / 2 ) {
                d++;
            };
            return string;
        }
        @Override
        public boolean hasNext() {
            return k < str.length || n < str.length;
        }


    }


