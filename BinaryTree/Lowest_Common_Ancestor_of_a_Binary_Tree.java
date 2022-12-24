package BinaryTree;

import java.util.*;

public class Lowest_Common_Ancestor_of_a_Binary_Tree
{
    public static void main(String[] args)
    {
        int n = 7;
        TreeNode root = BinaryTreeUtils.randomBinaryTree(n);
        BinaryTreeUtils.display(root);
        Random r = new Random();
        int val1 = r.nextInt(n);
        int val2 = r.nextInt(n);
        System.out.println(val1);
        System.out.println(val2);
      //  System.out.println(findpath(root,val));
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();
        Auxfindpath(root,path1,val1);
        Auxfindpath(root,path2,val2);

        int i;
        for(i=0;i<path1.size() && i<path2.size();i++)
        {
            if(path1.get(i) != path2.get(i))
                break;
        }

        System.out.println(path1.get(i-1));
    }

  /*  public static LinkedList<Integer> findpath(TreeNode root,int val)
    {
        LinkedList<Integer> path = new LinkedList<>();
        if(!Auxfindpath(root,val,path))
        {
            return null;
        }

        return path;
    }

    public static Boolean Auxfindpath(TreeNode root,int val,LinkedList<Integer> path)
    {

        if(root == null)
        {
            return false;
        }
        path.add(root.data);
        if(root.data == val)
        {
            return true;
        }
        if(Auxfindpath(root.left,val,path) || Auxfindpath(root.right,val,path)){
          return true;
        }

        path.pop();
        return false;
    } */



    public static boolean Auxfindpath(TreeNode root, ArrayList<Integer> arr, int val)
    {

        if (root==null)
            return false;


        arr.add(root.data);


        if (root.data == val)
            return true;


        if (Auxfindpath(root.left, arr, val) ||
                Auxfindpath(root.right, arr, val))
            return true;


        arr.remove(arr.size()-1);
        return false;
    }
}
