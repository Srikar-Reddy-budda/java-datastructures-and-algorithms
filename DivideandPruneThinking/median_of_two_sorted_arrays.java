package DivideandPruneThinking;

public class median_of_two_sorted_arrays
{
    public static void main(String[] args)
    {
        int[] nums1 = {1,2,5,6,8,9};
        int[] nums2 = {4,9,10,12,14};
       // int[] nums1 = {10,11,12};
        //int[] nums2 = {13,14,15,16};
        approch1(nums1,nums2);
    }

    public static void approch1(int[] nums1,int[] nums2)
    {
        int l1 = 0;
        int l2 = 0;
        int m1 = 0;
        int m2 = 0;
        int r1 = nums1.length-1;
        int r2 = nums2.length-1;
        while(l1<=r1 && l2<=r2)
        {
            m1 = (l1+r1)>>>1;
            m2 = (l2+r2)>>>1;

            if(nums1[m1]<nums2[m2])
            {
                l1=m1+1;
                r2=m2;
            }
            else
            {
                l2=m2+1;
                r1=m1;
            }
        }
        System.out.println(nums1[m1]+","+nums2[m2]);
    }
}
