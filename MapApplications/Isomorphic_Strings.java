/*Isomorphic Strings: Given two strings s and t, determine if they are isomorphic. Two
        strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a
        character must be replaced with another character while preserving the order of characters.
        No two characters may map to the same character but a character may map to itself. You
        may assume both s and t have the same length.
        Example:
        Input: s = "egg", t = "add"
        Output: true*/


package MapApplications;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic_Strings
{
    public static void main(String[] args)
    {
        String s = "ege";
        String t = "ada";
        System.out.println(approch1(s,t));
    }

    public static Boolean approch1(String s,String t)
    {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.containsKey(s.charAt(i)))
                {
                    if(map.get(s.charAt(i)) != t.charAt(i))
                        return false;
                }
            }
            else
            {
                if(set.contains(t.charAt(i)))
                    return false;
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }

        }
        return true;
    }
}
