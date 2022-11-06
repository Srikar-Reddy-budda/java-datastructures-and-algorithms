package BinarySearchThinking;

import java.util.Arrays;
import java.util.Random;

public class ceil {
    public static void main(String[] args) {
        int n = 30;
        int[] input = sortedRandomArray(n);
        System.out.println(Arrays.toString(input));
        Random r = new Random();
        int s = r.nextInt(n);
        System.out.println(s);
        System.out.println(ceil(input,s));
    }

    public static int ceil(int[] input, int s) {
        int i = Integer.MAX_VALUE;
        int check = Integer.MAX_VALUE;
        int result = -1;
        int l = 0;
        int r = input.length - 1;
        while (l <= r)
        {
            int m = (l + r) >>> 1;
            if(s > input[m])
            {
                l = m+1;
            }
            else if(s < input[m])
            {
                r = m-1;
                i = Math.min(input[m]-s,i);
                if(i != check)
                {
                    check = i;
                    result = m;
                }
            }
            else if(s == input[m])
            {
                return m;
            }
        }
        return result;
    }

    public static int[] sortedRandomArray(int n) {
        int[] in = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; ++i)
            in[i] = r.nextInt(2*n) + 1;
        Arrays.sort(in);
        return in;
    }

    public static int[] sortedRandomArrayWithDuplicates(int n) {
        int[] in = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; ++i)
            in[i] = r.nextInt(5) + 1;
        Arrays.sort(in);
        return in;
    }
}
