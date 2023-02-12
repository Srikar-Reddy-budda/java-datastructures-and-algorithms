package SortingApps;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_Colors
{
    public static void main(String[] args)
    {
        int[] in = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(approch1(in)));
    }

    public static int[] approch1(int[] O)
    {

        RadixSort srt = new RadixSort();
        srt.radixSort(O);
        return O;
    }
}
