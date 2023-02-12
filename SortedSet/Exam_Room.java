package SortedSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Exam_Room
{
    private static int N;
    public static void main(String[] args)
    {
        HashMap<String,Integer> input  = new HashMap<>();
        String[] methods = {};
        int[] in = {};
        input.put("ExamRoom", 10);
        System.out.println(input.get("ExamRoom"));
        TreeSet<Integer> s  = new TreeSet<>();
        s.add(0);
        s.add(9);
        Iterator<Integer> it = s.iterator();
        System.out.println(s.first());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(0>0);
        System.out.println(9/2);
    }

    public void ExamRoom(int N)
    {
        this.N = N;
    }

}
