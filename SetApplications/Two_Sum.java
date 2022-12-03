package SetApplications;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum
{
    public static void main(String[] args)
    {
        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(approch1(nums,target)));
    }

    public static int[] approch1(int[] nums,int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }

        for(int i : nums)
        {
            int a = (target-i);
            if(map.containsKey(a))
            {
                result[0] = map.get(i);
                result[1] = map.get(a);
                break;
            }
        }
        return result;
    }
}
