package AdhocThinking;

import java.util.Random;

public class Test {
    public static void main(String[] args)
    {
        int l = 2000000000;
        int r = 2000000000;
        int m1 = (l+r)>>>1;
        int m2 = l+(r-l)/2;
        System.out.println(m1);
        System.out.println(m2);
    }
}
