package DynamicProgramming;

public class Climbing_Stairs
{
    public static void main(String[] args)
    {
            int n = 4;
            System.out.println(cs1(n));
            System.out.println(cs2(n));
    }

    public static int cs1(int n)
    {
        if(n == 1) return 1;
        int[] mem = new int[n+1];
        mem[0] = 0;mem[1] = 1;mem[2] = 2;
        for(int i=3;i<=n;i++)
        {
            mem[i] = mem[i-2] + mem[i-1];
        }
        return mem[n];
    }

    public static int cs2(int n)
    {
        if(n == 1) return 1;

        int first = 1;int second = 2;
        int result = 0;
        for(int i=3;i<=n;i++)
        {
            result = second + first;
            first = second;
            second = result;
        }
        return result;
    }
}
