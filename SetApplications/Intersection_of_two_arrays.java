package SetApplications;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Intersection_of_two_arrays
{
    public static void main(String[] args)
    {
        int[] in1 = {1,2,2,1};
        int[] in2 = {2,2};
        System.out.println(approch1(in1,in2));
    }

    public static ArrayList<Integer> approch1(int[] in1, int[] in2)
    {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i : in1)
        {
            set.add(i);
        }

        for(int i : in2)
        {
            if(set.contains(i))
            {
                result.add(i);
                set.remove(i);
            }
        }

        return result;
    }
}
