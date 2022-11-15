package DivideandPruneThinking;

public class find_minimum_in_rotated_sorted_array
{
    public static void main(String[] args)
    {
        int[] nums = {66,77,77,33,44,66};
        System.out.println(approch1(nums));
    }
    public static int approch1(int[] nums)
    {
        int l = 0;
        int r = nums.length-1;
        while(l<=r)
        {
            int m = (l+r)>>>1;
            if(nums[l] <= nums[r] && nums[l] != nums[r])
            {
                return nums[l];
            }
            else if(nums[m] > nums[r])
            {
                l = m+1;
            }
            else
            {
                r = m;
            }
        }
        return -1;
    }
}


