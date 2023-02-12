package PriorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class sliding_window_maximum
{
    public static void main(String[] args)
    {
        int[] n = {1,3,-1,-3,5,3,6,7};
        int k =3;
        System.out.println(approch1(n,k));
    }

    public static LinkedList<Integer> approch1(int[] N,int K)
    {
        int R = N.length;
        int L = 0;
        LinkedList<Integer> result = new LinkedList<>();
        for(int P=(K-1);P<R;P++)
        {
            result.add(slidingwindow(N,L,P));
            L++;
        }

        return result;
    }

    public static Integer slidingwindow(int[] N,int L,int R)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(L<=R)
        {
            System.out.print(N[L]+" ");
            pq.add(N[L]);
            L++;
        }
        System.out.println();
        return pq.peek();
    }
}
