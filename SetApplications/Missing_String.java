package SetApplications;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Missing_String
{
    public static void main(String[] args)
    {
        String str1 = "This is an example";
        String str2 = "is example";
        System.out.println(approch1(str1,str2));
    }

    public static ArrayList<String> approch1(String str1,String str2)
    {
        ArrayList<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String s : str2.split(" "))
        {
            set.add(s);
        }

        for(String str : str1.split(" "))
        {
            if(!set.contains(str))
            {
                result.add(str);
            }
        }
        return result;
    }
}
