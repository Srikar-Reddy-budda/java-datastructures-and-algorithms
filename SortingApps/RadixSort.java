package SortingApps;

public class RadixSort {

    public static int getNumPasses(int[] in) {
        int max = 0;
        for (int x : in) {
            if (x > max)
                max = x;
        }
        int d = 0;
        while (max > 0) {
            max = max / 10;
            ++d;
        }
        return d;
    }

    //(123/1)%10=3  (123/10)%10=2    (123/100)%10=1
    private static void countingSort(int[] in, int divisor, int d) {
        int[] counts = new int[10];
        int[] out = new int[in.length];

        //perform counting of each possible radix value
        for(int x:in) {
            int tmp = (x/divisor)%10;
            counts[tmp]++;
        }
        //perform cumulative sums
        for(int i = 1; i < counts.length; ++i)
            counts[i] += counts[i-1];

        //place elements in right order
        for(int i = in.length-1; i >= 0; --i) {
            int tmp = (in[i]/divisor)%10;
            int pos = --counts[tmp];
            out[pos] = in[i];
        }
        //copy back
        for(int i = 0; i < in.length; ++i)
            in[i] = out[i];

    }
    public static void radixSort(int[] in) {
        int npasses = getNumPasses(in);
        int divisor = 1;
        for (int d = 1; d <= npasses; ++d) {
            countingSort(in, divisor, d);
            //ArrayUtils.display(in);
            divisor *= 10;
        }
    }

    public static void main(String[] args) {
        int n = 10;
//		int[] in = ArrayUtils.uniqueRandomData(n);
//		ArrayUtils.display(in);
//		radixSort(in);

        //1 million:0.132     10 million:1.089   50 million:5.441
        int[] in = ArrayUtils.uniqueRandomData(n);
        long start = System.currentTimeMillis();
        radixSort(in);
        long end = System.currentTimeMillis();
        System.out.println("Time taken:" + (end-start)/1000.0 + "secs");
    }

}
