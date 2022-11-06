package AdhocThinking;

import java.util.Arrays;

public class merge_sorted_array
{
    public static void main(String[] args)
    {
        merge_sorted_array obj = new merge_sorted_array();
        int[] nums1 = {1,2,3,5,5,5,6,7,22,77,88,99,0,0,0,0,0,0,0,0,0,0};
        int[] nums2 = {2,2,4,5,6,6,3,42,45,64};
       //  int[] nums1 = {1,2,3,0,0,0};
       //  int[] nums2 = {2,5,6};
        obj.approch1(nums1,nums2,12,10);
        obj.approch2(nums1,nums2,12,10);
    }

    // TC: Theta NlogN   SC: BigO 1
    public void approch1(int[] nums1,int[] nums2,int m,int n)
    {
        for(int i=m;i<(m+n);i++)
        {
            nums1[i] = nums2[i-m];
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    //TC: Theta N SC: BigO 1
    public void approch2(int[] nums1,int[] nums2,int m,int n)
    {
        int l = nums1.length;
        while(l<=0 && n<=0)
        {
            if(nums2[n-1] > nums1[m-1])
            {
                nums1[l-1] = nums2[n-1];
                l--;
                n--;
            }
            else if(nums2[n-1] < nums1[m-1])
            {
                nums1[l-1] = nums1[m-1];
                m--;
                l--;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}
