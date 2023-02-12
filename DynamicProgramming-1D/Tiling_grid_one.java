package DynamicProgramming;

public class Tiling_grid_one
{
    public static void main(String[] args)
    {
        int n = 4;
        System.out.println(approch1(n));
    }

    public static Integer approch1(int n)
    {
        int[] mem = new int[n+1];
        mem[0] = 1;mem[1] = 1;
        for(int i=2;i<=n;i++)
        {
            mem[i] = mem[i-1]+mem[i-2];
        }
        return mem[n];
    }
}
