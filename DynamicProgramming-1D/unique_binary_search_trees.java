package DynamicProgramming;

public class unique_binary_search_trees
{
    public static void main(String[] args)
    {
        int n = 3;
        System.out.println(approch1(n));
    }

    public static Integer approch1(int n)
    {
        int[] mem = new int[n+1];
        mem[0] = 1;mem[1] = 1;
        for(int i = 2;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                mem[i] += mem[j-1] * mem[i-j];
            }
        }
        return mem[n];
    }
}
