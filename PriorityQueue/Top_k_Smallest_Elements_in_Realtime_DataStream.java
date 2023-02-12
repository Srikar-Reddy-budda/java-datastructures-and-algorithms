package PriorityQueue;

import java.util.*;

public class Top_k_Smallest_Elements_in_Realtime_DataStream
{
    static HashMap<Integer,Integer> map = new HashMap<>();
    static LinkedList<Map.Entry<Integer,Integer>> result;
    public static void main(String[] args)
    {
        //int[] arr  = {5,2,1,3,2};
        add(5);
        add(2);
        add(1);
        add(3);
        add(2);
        topk();
        add(1);
        add(1);
        topk();
    }

    public static void topk()
    {
        System.out.println(result);
    }
    public static void add(int i)
    {
      //  HashMap<Integer,Integer> map = new HashMap<>();
           // PriorityQueue<> pq = new PriorityQueue<>();
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }

        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();

        result = new LinkedList<>(entries);

        Comparator<Map.Entry<Integer,Integer>> comp = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue().equals(o2.getValue())){
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        Collections.sort(result,comp);
    }
}
