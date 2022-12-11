/*Contains Duplicate-II: Given an array of integers and an integer k, find out whether there
        are two distinct indices i and j in the array such that nums[i] = nums[j] and
        the absolute difference between i and j is at most k.
        Example:
        Input: nums = [1,2,3,1], k = 3
        Output: true*/

package MapApplications;

import java.util.ArrayList;
import java.util.HashMap;

public class Contains_Duplicate_2
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,1,1};
        int k = 2;
        System.out.println(approch1(nums,k));
    }
    public static Boolean approch1(int[] nums,int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
               int  tmp = (i-map.get(nums[i]));
               if(tmp == k) {
                    return true;
                }
               else if(tmp > k)
               {
                   map.put(nums[i],i);
               }
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
