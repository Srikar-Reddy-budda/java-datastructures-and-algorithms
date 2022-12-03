package StackApplications;

import java.util.Stack;

public class Validate_Stack_Sequences
{
    public static void main(String[] args)
    {
        int[]  in1 = {1,2,3,4,5};
        int[] in2 = {4,5,3,2,1};
        int[] in3 = {4,3,5,1,2};
        System.out.println(approch1(in1,in3));
        System.out.println(approch2(in1,in3));
    }

    public static Boolean approch1(int[] in1,int[] in2)
    {
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        int index = 0;
        for(int i : in1)
        {
            stk1.push(i);
            while(!stk1.empty() && stk1.peek() == in2[index])
            {
                stk2.push(stk1.pop());
                index++;
            }
        }
        while(!stk1.empty())
        {
            stk2.push(stk1.pop());
        }
        for(int i=in2.length-1;i>=0;i--)
        {
            if(in2[i] != stk2.pop()) return false;
        }
        return true;
    }

    public static boolean approch2(int in1[],int in2[])
    {
        Stack<Integer> stk = new Stack<>();
        int length = in1.length;
        int index = 0;
        for(int i=0;i<length;i++)
        {
            stk.push(in1[i]);
            while(!stk.empty() && stk.peek() == in2[index])
            {
                stk.pop();
                index++;
            }
        }

        return index == length;
    }
}
