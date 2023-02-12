package BinarySearchTree;

import java.util.Random;

import static BinarySearchTree.BSTUtils.buildRBST;
import static BinarySearchTree.BSTUtils.display;

public class Lowest_Common_Ancestor_of_BST
{
    public static void main(String[] args)
    {
        int n = 8;
        Random r = new Random();
        int p = r.nextInt(n),q=r.nextInt(n);
        BSTNode root = buildRBST(n);
        display(root);
        System.out.println("P : "+p);
        System.out.println("Q : "+q);
        System.out.println(LCA(root,p,q));
    }

    public static Integer LCA(BSTNode root,int p,int q)
    {
        if(root == null) return 0;

        if((p<= root.data && q<= root.data) || p>= root.data && q>= root.data) return root.data;

        if(p<=root.data && q>=root.data)
        {
            return root.data;
        }
        else {
            LCA(root.left, p, q);
            LCA(root.right, p, q);
        }
        return -1;
    }
}
