package BinaryTree;

import java.util.LinkedList;

public class Flatten_Binary_Tree_to_Linked_List
{
    public static void main(String[] args)
    {
        int n = 10;
        TreeNode root = BinaryTreeUtils.randomBinaryTree(n);
        BinaryTreeUtils.display(root);
        System.out.println(recursiveApproch(root));

    }

    public static LinkedList<Integer> recursiveApproch(TreeNode root)
    {
        LinkedList<Integer> res = new LinkedList<>();
        return preordertrvs(root,res);
    }

    public static LinkedList<Integer> preordertrvs(TreeNode root,LinkedList<Integer> res)
    {
        if(root == null)
        {
            return null;
        }
        res.add(root.data);
        preordertrvs(root.left,res);
        preordertrvs(root.right,res);

        return res;
    }
}
