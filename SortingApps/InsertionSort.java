package SortingApps;

public class InsertionSort {

    public static void insertion_sort(int[] in) {
        int j;
        for (int i = 1; i < in.length; ++i) {
            int tmp = in[i];
            for (j = i - 1; j >= 0; --j) {
                if (in[j] > tmp)
                    in[j + 1] = in[j];
                else
                    break;
            }
            in[j + 1] = tmp;
            //ArrayUtils.display(in);
        }
    }

    public static void main(String[] args) {
        //int n = Integer.parseInt(args[0]);
        int n = 5;
//		int[] in = ArrayUtils.uniqueRandomData(n);
//		ArrayUtils.display(in);
//		insertion_sort(in);
//		ArrayUtils.display(in);


        //worst case performance
        //1 lakh: 6.761   2lakh:26.143
//		int[] in = ArrayUtils.reverseSortedData(n);
//		//ArrayUtils.display(in);
//		long start = System.currentTimeMillis();
//		insertion_sort(in);
//		long end = System.currentTimeMillis();
//		System.out.println("Time taken:" + (end-start)/1000.0 + "secs");
//		//ArrayUtils.display(in);

        //avg case performance
        //1 lakh:3.351  2 lakh:13.127
        int[] in = ArrayUtils.uniqueRandomData(n);
        long start = System.currentTimeMillis();
        ArrayUtils.display(in);
        insertion_sort(in);
        long end = System.currentTimeMillis();
        System.out.println("Time taken:" + (end-start)/1000.0 + "secs");

    }

}
