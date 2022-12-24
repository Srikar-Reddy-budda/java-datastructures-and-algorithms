//Path Sum: Given a binary tree and a sum, determine if the tree has a root-to-leaf path
//such that adding up all the values along the path equals the given sum.


package BinaryTree;

import java.util.Random;

public class Path_Sum
{
    public static void main(String[] args)
    {
        int n = 10;
        TreeNode root = BinaryTreeUtils.randomBinaryTree(n);
        BinaryTreeUtils.display(root);
        Random r = new Random();
        int sum = r.nextInt(50);
        System.out.println(sum);
        System.out.println(recursiveApproch(root,sum));
    }

    public static Boolean QueueApproch(TreeNode root,int sum)
    {

        return null;
    }

    public static Boolean recursiveApproch(TreeNode root,int sum)
    {
        if(root == null) return false;
        if(root.left == null && root.right == null && root.data == sum)
            return true;
        Boolean L = recursiveApproch(root.left,sum - root.data);
        Boolean R = recursiveApproch(root.right,sum - root.data);
        return L || R;
    }
}
