package SortedMap;

import java.util.*;

public class SortCharctersByFrequency {
    public static void main(String[] args) {
        String input = "tree";
        System.out.println(approch1(input));
    }


    public static String approch1(String input)
    {
        char[] chars = input.toCharArray();
        String res="";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : chars)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        SortedMap<Integer,Character> tmap = new TreeMap<>(Collections.reverseOrder());
        Set s = map.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext())
        {
            Map.Entry m = (Map.Entry) it.next();
            tmap.put((Integer) m.getValue(), (Character) m.getKey());
        }
        s = tmap.entrySet();
        it = s.iterator();
        while(it.hasNext())
        {
            Map.Entry m = (Map.Entry) it.next();
            for(int i=0;i < (int)m.getKey();i++)
            res += m.getValue();
        }
        return res;
    }
}
