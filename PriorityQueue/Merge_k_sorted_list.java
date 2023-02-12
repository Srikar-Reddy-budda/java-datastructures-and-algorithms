package PriorityQueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Merge_k_sorted_list
{
    public static void main(String[] args)
    {
       ArrayList<LinkedList<Integer>> lists = new ArrayList<>();
       LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(4);
        l1.add(5);
        l2.add(1);
        l2.add(3);
        l2.add(4);
        l3.add(2);
        l3.add(6);
       lists.add(l1);lists.add(l2);lists.add(l3);
       System.out.println(approch1(lists));
    }

    public static LinkedList<Integer> approch1(ArrayList<LinkedList<Integer>> lists)
    {
        PriorityQueue pq = new PriorityQueue();
        for(LinkedList L : lists)
        {
            Iterator<Integer> itr = L.iterator();
            while(itr.hasNext())
            {
                pq.add(itr.next());
            }
        }

        LinkedList<Integer> result = new LinkedList<>();
        while(!pq.isEmpty())
        {
            result.add((Integer) pq.remove());
        }

       return result;
    }
}
