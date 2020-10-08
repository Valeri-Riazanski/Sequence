package com.val.riazanski;

public class Sequence {
    //fields
    private final int[] sequence;
    //constructors
    public Sequence(int n) {
        sequence = nSequence(n);
    }
    //methods
   static int[] nSequence(int m) {
        int[] a = new int[m];
        a[0] = 4;
        //System.out.println(a[0] + " ");
        int k = 0;
        int l = 0;
        int kLimit = (int) Math.sqrt(2.0 * m) - 2;
        while (l < kLimit + 1) {
            l = l + 1;
            k = k + 1;
            if (k < m) {
                a[k] = a[k - 1] + 3;
                //System.out.print(a[k] + " ");
            }
            for (int i = 0; i < l; i++) {
                k = k + 1;
                if (k < m) {
                    a[k] = a[k - 1] + 1;
                    //System.out.print(a[k] + " ");
                }
            }
            //System.out.print('\n');
        }
        return a;
   }
    public SequenceIterator createIterator(int m) {
        return new SequenceIterator(m);
    }
/**
   public static void main(String[] args) {
       int m = 100;
       Sequence sequence = new Sequence(m);
       SequenceIterator iter = sequence.createIterator(m);
       System.out.println("пройдем по нашему массиву с помощью вновь созданного итератора");
       while (iter.hasNext()) {
           System.out.println(iter.next());

       }
   }
*/

}
