package PriorityQueue;

import java.util.PriorityQueue;

public class kth_smallest_element_in_a_sorted_matrix
{
    public static void main(String[] args)
    {
        int[][] mtx = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 5;
        System.out.println(approch1(mtx,k));
        System.out.println(approch2(mtx,k));

    }

    public static Integer approch1(int[][] mtx,int k)
    {
        int length = mtx.length;
         int result = mtx[(k-1)/length][(k-1)%length];
         return result;
    }

    public static Integer approch2(int[][] mtx,int k)
    {
        int l = 0;
        int n = mtx.length;
        int r = (n*n)-1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(l<=r)
        {
            pq.add(mtx[l/n][l%n]);
            l++;
        }
        int result = -1;
        for(int i=0;i<k;i++)
        {
            result = pq.remove();
        }

        return result;
    }
}
