package AdhocThinking;

public class remove_duplicates_from_sorted_array
{
    public static void main(String[] args)
    {
        remove_duplicates_from_sorted_array obj = new remove_duplicates_from_sorted_array();
        int[] nums = {1,1,1,1,2,3,4,4,5,6,7,7};
        obj.approch1(nums);
    }

    // TC:Theta N   SC: BigO 1
    public void approch1(int[] nums)
    {
        if(nums.length == 0)
        {
            System.out.println(0);
        }
        int length = 1;

        if(nums.length == 1)
        {
            System.out.println(length);
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1])
            {
                continue;
            }
            length++;
        }
        System.out.println(length);
    }
}
