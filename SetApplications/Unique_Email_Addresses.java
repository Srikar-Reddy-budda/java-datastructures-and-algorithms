package SetApplications;

import java.util.HashSet;
import java.util.Set;

public class Unique_Email_Addresses
{
    public static void main(String[] args)
    {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        System.out.println(approch1(emails));
    }

    public static int approch1(String[] emails)
    {
        int result = 0;
        Set<String> set = new HashSet<>();
        for(String email : emails)
        {
            String local = null;
                for(char c : email.toCharArray())
                {
                    if(c == '+' || c == '@')
                    {
                        break;
                    }
                    else if(c == '.')
                        continue;

                    local += c;
                }
                String domain = email.split("@")[1];
                set.add(local+domain);
        }
        result = set.size();
        return result;
    }
}
