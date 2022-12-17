package RecursiveThinking;

public class Reverse_an_immutable_string
{
    public static void main(String[] args)
    {
        String s = "Srikar";
        System.out.println(reverseString(s));

    }

    public static String reverseString(String s)
    {
        String res = reverseString(s,0);
        return res;
    }

    public static String reverseString(String s,int n)
    {
        if(n == s.length()-1)
        {
            String res = String.valueOf(s.charAt(n));
            return res;
        }
        String res = reverseString(s,n+1)+s.charAt(n) ;
        return res;
    }

}
