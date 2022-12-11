/*Anagram Mappings: Given two lists A and B, and B is an anagram of A. B is an anagram
        of A means B is made by randomizing the order of the elements in A.
        We want to find an index mapping P, from A to B. A mapping P[i] = j means the i
        th element
        in A appears in B at index j. These lists A and B may contain duplicates. If there are multiple
        answers, output any of them.
        Example
        Input: A = [12, 28, 46, 32, 50] and B = [50, 12, 32, 46, 28]
        Output: [1, 4, 3, 2, 0]
        Explanation:
        As P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element
        of A appears at B[4], and so on*/

package MapApplications;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Anagram_Mappings
{
    public static void main(String[] args)
    {
        int[] A = {12,28,46,32,50};
        int[] B = {50,12,32,46,28};
        System.out.println(Arrays.toString(approch1(A,B)));
    }

    public static int[] approch1(int[] A,int[] B)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[A.length];
        for(int i=0;i<B.length;i++)
        {
            map.put(B[i],i);
        }

        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(A[i]))
            {
                result[i] = map.get(A[i]);
            }
            else
            {
                return null;
            }
        }
        return result;
    }
}
