package DynamicProgramming;

public class number_of_regions_in_a_plane
{
    public static void main(String[] args)
    {
        int n = 3;
        System.out.println(approch1(n));
    }

    public static Integer approch1(int n)
    {
        int[] mem = new int[n+1];
        mem[0] = 0;mem[1] = 2;mem[2] = 4;
        for(int i=3;i<=n;i++)
        {
            mem[3] = mem[i-1]+i;
        }
        return mem[n];
    }
}
