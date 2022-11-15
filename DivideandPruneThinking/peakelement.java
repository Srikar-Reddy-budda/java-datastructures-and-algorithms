package DivideandPruneThinking;

import java.util.Arrays;
import java.util.Random;

public class peakelement
{
    public static void main(String[] args)
    {
        int n = 10;
        int[] nums = {1};

        System.out.println(Arrays.toString(nums));
        System.out.println(approch1(nums));
    }

    //TC:Theta logn SC: Big O 1
    public static int approch1(int[] nums)
    {
        int l = 0;
        int r = nums.length-1;
        while(l<=r)
        {
            int m = (l+r)>>>1;
            if((m == 0 || nums[m] >= nums[m-1]) && (m == nums.length-1 || nums[m] >= nums[m+1]))
            {
                return m;
            }
            else if(m > 0 && nums[m-1] > nums[m])
            {
                r = m-1;
            }
            else
            {
                l = m+1;
            }
        }

        return -1;
    }

    public static int[] random(int n)
    {
        int[] nums = {1,2,1,3,5,6,4};
        Random r = new Random();
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = r.nextInt(20);
        }
        return nums;
    }
}
