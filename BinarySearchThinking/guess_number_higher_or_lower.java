package BinarySearchThinking;

public class guess_number_higher_or_lower
{
    static int pick = 363536747;
    public static void main(String[] args)
    {
        int n = 1000000000;
        System.out.println(guessnumber(n));
    }

    public static int guessnumber(int num)
    {
        int l = 1;
        int r = num;

        while(l<=r)
        {
            int m = (l+r)>>>1;
            int result = guess(m);
            if(result == 0){
                return m;}
            else if(result == -1)
            {
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return -1;
    }

    public static int guess(int num)
    {
        if(pick < num){
            return -1;}
        else if(pick > num){
            return 1;}
        return 0;
    }
}
