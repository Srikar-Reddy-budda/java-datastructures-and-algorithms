package RecursiveThinking;

import java.util.LinkedList;

public class Decimal_To_Binary
{
    public static void main(String[] args)
    {
            int n = 17;
            LinkedList<Integer> result = new LinkedList<>();
            System.out.println(toBinary(n,result));
            System.out.println(toBinaryString(n));
            System.out.println(Integer.toBinaryString(n));
    }

    public static LinkedList<Integer> toBinary(int n, LinkedList<Integer> result)
    {
        if(n == 1)
        {
            result.add(n%2);
            return result;
        }
        toBinary(n/2,result);
        result.add(n%2);
        return result;
    }

    public static String toBinaryString(int n)
    {
        if(n == 1)
        {
            String res = String.valueOf((n%2));
            return res;
        }
        String res = toBinaryString(n/2)+(n%2);
        return res;
    }
}
