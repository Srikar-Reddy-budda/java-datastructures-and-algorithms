package AdhocThinking;

import java.util.Arrays;

public class reverse_words_in_a_string
{
    public static void main(String[] args)
    {
        reverse_words_in_a_string obj = new reverse_words_in_a_string();
        String s1 = "algorithmica is your best guru";
        String s2  = obj.approch1(s1);
        System.out.println(s2);
        String s3 = obj.approch2(s1);
        System.out.println(s3);
    }

    // TC: Theta N   SC: BigO N
    public String approch1(String s1)
    {
        String[] temp = s1.split(" ");
        s1 = "";
        for(String i : temp)
        {
            s1 += reverse(i,0,i.length()-1)+" ";
        }
        return s1;
    }

    public String approch2(String s1)
    {
        int length = s1.length();
        int l = 0;
        for(int r=0;r<length;r++)
        {
            if(s1.charAt(r) == ' ')
            {
                s1 = reverse(s1,l,r-1);
                l = r+1;
            }
            else if(r == length-1)
            {
                s1 = reverse(s1,l,r);
            }
        }
        return s1;
    }

    public String reverse(String s1,int l,int r)
    {
        char[] ch = s1.toCharArray();
        while(l<=r)
        {
            char tmp = ch[r];
            ch[r] = ch[l];
            ch[l] = tmp;
            l++;
            r--;
        }
        return String.valueOf(ch);
    }
}
