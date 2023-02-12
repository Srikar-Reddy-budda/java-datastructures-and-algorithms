package PriorityQueue;

import java.util.PriorityQueue;

public class kth_smallest_sum_in_two_sorted_arrays
{
    public static void main(String args[])
    {
        int[] n1 = {1,7,11};
        int[] n2 = {2,4,6};
        int k = 8;
        System.out.println(approch1(n1,n2,k));
    }

    public static Integer approch1(int[] o1,int[] o2,int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<o1.length;i++)
        {
            for(int j=0;j<o2.length;j++)
            {
                pq.add(o1[i]+o2[j]);
            }
        }
        int result = -1;
        for(int i=0;i<k;i++)
        {
            result = pq.remove();
        }
        return result;
    }
}
