package RecursiveThinking;

public class Mini_Parser
{
    public static void main(String[] args)
    {
            String s = "[123,[456,[789]]]";
        NestedInteger r = new NestedInteger();
            r.add(new NestedInteger(789));
            r.add(new NestedInteger(456));
            System.out.println(r.getList());
    }

    public static NestedInteger NI(String s)
    {
        if(s.isEmpty())
        {
            return new NestedInteger();
        }
        else if(s.length() <= 2)
        {
            return new NestedInteger();
        }
        else if(s.charAt(0)!='[')
        {
            return new NestedInteger(Integer.valueOf(s));
        }

        int start = 1;
        int brackets = 0;

        for(int i=0;i<s.length();i++)
        {
            if(brackets == 0 && (i == s.length()-1 || s.charAt(i) == ','))
            {

            }
        }
        return null;
    }


}
