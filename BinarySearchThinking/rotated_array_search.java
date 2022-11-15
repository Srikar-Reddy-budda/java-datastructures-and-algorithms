package BinarySearchThinking;

public class rotated_array_search
{
    public static void main(String[] args)
    {
        int[] in = {8,9,14,19,34,36,36,47,50,0,3,4};
        int target = 39;
        System.out.println(approch1(in,target));
    }

    public static boolean approch1(int[] in,int target)
    {
        int l = 0;
        int r = in.length-1;
       while(l<r)
       {
           int m = (l+r)>>>1;
           if(in[m] > in[r])
           {
               l = m+1;
           }
           else
           {
               r = m;
           }
       }
       int piv = l;
       l = 0;
       if(target < in[l])
       {
           return binarysearch(in,piv,in.length-1,target);
       }
       else
       {
          return binarysearch(in,l,piv-1,target);
       }
    }

    public static boolean binarysearch(int[] in,int start,int end,int target)
    {
        int l =start;
        int r = end;
        while(l<=r)
        {
            int m = (l+r)>>>1;
            if(in[m] == target)
            {
                return true;
            }
            else if(in[m] > target)
            {
                r = m-1;
            }
            else
            {
                l = m+1;
            }
        }
        return false;
    }
}
