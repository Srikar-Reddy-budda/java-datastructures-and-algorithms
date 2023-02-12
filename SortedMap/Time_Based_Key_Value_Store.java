package SortedMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Time_Based_Key_Value_Store
{
    HashMap<String, TreeMap<Integer,String>> timemap;
    public static void main(String[] args)
    {

    }

    public void TimeMap()
    {
        this.timemap = new HashMap<>();
    }
    public void set(String key,String value,int timestamp)
    {
      if(timemap.containsKey(key))
      {
          timemap.get(key).put(timestamp,value);
      }
      else
      {
          timemap.put(key,new TreeMap<>(Collections.reverseOrder()));
          timemap.get(key).put(timestamp,value);
      }
    }

    public String get(String key,int timestamp)
    {
        if(!timemap.containsKey(key)) return "";
        if(!timemap.get(key).containsKey(timestamp)) {
            int k = timemap.get(key).ceilingKey(timestamp);
            return timemap.get(key).get(k);
        }
        return timemap.get(key).get(timestamp);
    }
}
