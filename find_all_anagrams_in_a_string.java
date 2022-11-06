package AdhocThinking;

import java.util.Arrays;

public class find_all_anagrams_in_a_string
{
    public static void main(String args[])
    {
        find_all_anagrams_in_a_string obj = new find_all_anagrams_in_a_string();
            String in = "cbaebabacd";
            String p = "abc";
            obj.approch1(in,p);
    }

    // TC:Theta N   SC: BigO 1
    public void approch1(String s1,String s2)
    {
        int pfreq  = 0;
        int k = s2.length();
        int c = 0;
        for(int i=0;i<s2.length();i++)
        {
            pfreq += (s2.charAt(i)-'a')+1;
        }
        for(int i=0;i<s1.length()-3;i++)
        {
             int infreq =  anagram(s1,i,i+k);
             if(pfreq == infreq)
             {
                 System.out.print(i+",");
             }
        }
    }

    public int anagram(String s1,int l,int r)
    {
        int freq = 0;
        while(l<r)
        {
            freq += (s1.charAt(l)-'a')+1;
            l++;
        }
        return freq;
    }
}
