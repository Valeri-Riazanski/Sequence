package com.val.riazanski;

import java.util.Iterator;

public class SequenceIterator implements Iterator {
    //fields
    int[] seq;
    int position = 0;

    //constructors
    public SequenceIterator(int m) {
        this.seq = Sequence.nSequence(m);
    }

    //methods
    @Override
    public Integer next() {
        int k = seq[position];
        position++;
        return k;
    }

    @Override
    public boolean hasNext() {
        return position < seq.length && seq != null;
    }
}