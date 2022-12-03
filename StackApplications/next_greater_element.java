package StackApplications;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class next_greater_element
{
    public static void main(String args[])
    {
        int in1[] = {4,1,2};
        int in2[] = {1,3,4,2};
        System.out.println(Arrays.toString(approch1(in1,in2)));
    }

    public static int[] approch1(int[] in1,int[] in2)
    {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : in2)
        {
            while(!stk.empty())
            {
                if(stk.peek() < i)
                {
                    map.put(stk.pop(),i);
                }
                else break;
            }
            stk.push(i);
        }
        int[] result = new int[in1.length];
        for(int i=0;i<in1.length;i++)
        {
            if(map.containsKey(in1[i]))
            {
                result[i] = map.get(in1[i]);
            }
            else
            {
                result[i] = -1;
            }
        }

        return result;
    }
}
