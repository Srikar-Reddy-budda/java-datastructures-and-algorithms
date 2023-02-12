package BinarySearchTree;

import static BinarySearchTree.BSTUtils.buildRBST;
import static BinarySearchTree.BSTUtils.display;

public class Balanced_Binary_Tree
{
    public static void main(String[] args)
    {
        int n = 8;
        BSTNode root = buildRBST(n);
        display(root);
        System.out.println(BalancedBSTree(root));
    }

    private static Boolean BalancedBSTree(BSTNode root)
    {
        if(Balancedtree(root) == -1)
            return false;
        return true;
    }

    private static Integer Balancedtree(BSTNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int L = Balancedtree(root.left);
        if(L == -1) return -1;
        int R = Balancedtree(root.right);
        if(R == -1) return -1;
        if(Math.abs(L-R) > 1) return -1;
        return Math.max(L,R)+1;
    }
}
