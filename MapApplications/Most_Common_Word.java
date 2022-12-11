/*Most Common Word: Given a paragraph and a list of banned words, return the most
        frequent word that is not in the list of banned words. It is guaranteed there is at least one
        word that isn't banned, and that the answer is unique. Words in the list of banned words are
        given in lowercase, and free of punctuation. Words in the paragraph are not case
        sensitive. The answer is in lowercase.
        Example:
        Input:
        paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
        banned = ["hit"]
        Output: "ball"*/

package MapApplications;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Most_Common_Word
{
    public static void main(String[] args)
    {
        String paragraph = "Bob hit! a ball, the hit BALL flew after it was hit";
        String[] banned = {"hit"};
        System.out.println(approch1(paragraph,banned));
    }

    public static String approch1(String paragraph,String[] banned)
    {
        HashSet<String> set = new HashSet<>();
        HashMap<String,Integer> map = new HashMap<>();
        Pair<String,Integer> result = new Pair<>("",0);
        for(String s : banned)
        {
            set.add(s);
        }
        String words[] = paragraph.replaceAll("\\W+"," ")
                .toLowerCase()
                .split("\\s+");
        System.out.println(Arrays.toString(words));
        for(String word : words)
        {
            if(!set.contains(word))
            {
                if(map.containsKey(word))
                {
                    map.put(word,map.get(word)+1);
                    if(map.get(word) > result.getValue())
                    {
                        result = new Pair<>(word,map.get(word));
                    }
                }
                else
                {
                    map.put(word,1);
                }
            }
        }
        return result.getKey();
    }
}
