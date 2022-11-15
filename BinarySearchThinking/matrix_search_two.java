package BinarySearchThinking;

import java.util.Arrays;

import static java.lang.System.exit;

public class matrix_search_two
{
    public static void main(String[] args)
    {
        int m = 10000;
        int n= 10000;
        int target = 56;

        int k = 1;
        int[][] in = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                in[i][j] = k++;
            }
        }
      // display(in);
        System.out.println(target);
        long start = System.currentTimeMillis();
        System.out.println(approch1(in,target));
        long end = System.currentTimeMillis();
        System.out.println("approch1 : "+(start-end)/1000.0);
     /*   start = System.currentTimeMillis();
        System.out.println(approch2(in,target));
        end = System.currentTimeMillis();
        System.out.println("approch2 : "+(start-end)/1000.0); */
        start = System.currentTimeMillis();
        System.out.println(approch3(in,m,n,target));
        end = System.currentTimeMillis();
        System.out.println("approch3 : "+(start-end)/1000.0);
    }

    public static boolean approch3(int[][] in,int m,int n,int target)
    {
        int l = 0;
        int r = (m*n)-1;
        while(l<=r)
        {
            int mid = (l+r)>>>1;
            int row = mid/m;
            int col = mid%m;
            int value = in[row][col];
            if(value == target)
            {
                return true;
            }
            else if(target > value)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return false;
    }
    // TC:Theta logN SC: BigO(1)
    public static boolean approch2(int[][] in,int target)
    {
        return (binarysearch(in[matrixbinarysearch(in,target)],target));
    }

    // TC:Theta NlogN SC: BigO(1)
    public static boolean approch1(int[][] in,int target)
    {
        int len = in[1].length-1;
        for(int i = 0;i < in.length;i++)
        {
            if(in[i][len] == target)
            {
                return true;
            }
            else if(in[i][len] > target)
            {
               return  binarysearch(in[i],target);
            }
        }
        return false;
    }

    public static int matrixbinarysearch(int[][] in,int target)
    {
        int l =0;
        int r = in.length-1;
        int result = Integer.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        int check = i;
        int len = in[1].length-1;
        while(l<=r)
        {
            int m = (l+r)>>>1;
            if(in[m][len] == target)
            {
                System.out.println(true);
                exit(0);
            }
            else if(in[m][len] > target)
            {
                r = m-1;
                i = Math.min(in[m][len]-target,i);
                if(i != check)
                {
                    check  = i;
                    result = m;
                }
            }
            else
            {
                l = m+1;
            }
        }
        return result;
    }


    public static boolean binarysearch(int[] in,int target)
    {
        int l =0;
        int r = in.length-1;
        while(l<=r)
        {
            int m = (l+r)>>>1;
            if(in[m] == target)
            {
                return true;
            }
            else if(in[m] > target)
            {
                r = m-1;
            }
            else
            {
                l = m+1;
            }
        }
        return false;
    }

    public static void display(int[][] in) {
        for(int i = 0; i < in.length; ++i)
            System.out.println(Arrays.toString(in[i]));
        System.out.println();
    }
}
