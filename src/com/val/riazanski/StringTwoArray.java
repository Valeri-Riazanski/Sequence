package com.val.riazanski;

import java.lang.String;

    public class StringTwoArray {
        //fields
        private final String[][] str;
        //constructors
        public StringTwoArray(String[][] s) {
            this.str = s;
        }
        //methods
        public TwoArrayIterator createIterator() {
            return new TwoArrayIterator(this.str);
        }
    }

