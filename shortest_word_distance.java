package AdhocThinking;

public class shortest_word_distance
{
    public static void main(String[] args)
    {
        shortest_word_distance obj = new shortest_word_distance();
        String[] words = {"practice","makes","perfect","makes","coding","makes","makes"};
        String word1 = "practice";
        String word2 = "makes";
        obj.approch1(words,word1,word2);

    }

    // TC:Theta N   SC: BigO 1
    public void approch1(String[] words,String word1,String word2)
    {
        int result = Integer.MAX_VALUE;
        int i1 = -1;
        int i2 = -1;
        boolean flag = false;
        int temp = 0;
        //{"practice","makes","perfect","coding","makes"}
        if(word1.equalsIgnoreCase(word2))
        {
            for(int i=0;i<words.length;i++)
            {
                if(words[i] == word1 && !flag)
                {
                    i1 = i;
                    flag = true;
                    continue;
                }
                else if(words[i] == word2 && flag)
                {
                    i2 = i;
                    temp = i;
                }
                else
                {
                    continue;
                }

                if(i1!=-1 && i2!=-1)
                {
                    result = Math.min(Math.abs(i1-i2),result);
                    i1 = temp;
                }
            }
        }
        else {
            for (int i = 0; i < words.length; i++) {
                if (words[i] == word1) {
                    i1 = i;
                }
                if (words[i] == word2) {
                    i2 = i;
                }

                if (i1 != -1 && i2 != -1) {
                    result = Math.min(Math.abs(i1 - i2), result);
                }
            }
        }

        System.out.println(result);
    }
}
