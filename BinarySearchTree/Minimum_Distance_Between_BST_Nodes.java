package BinarySearchTree;

import static BinarySearchTree.BSTUtils.buildRBST;
import static BinarySearchTree.BSTUtils.display;

public class Minimum_Distance_Between_BST_Nodes
{
    public static void main(String[] args)
    {
        int n = 8;
        BSTNode root = buildRBST(n);
        display(root);
        System.out.println(MD(root));
    }

    public static Integer MD(BSTNode root)
    {
        MDvalues cmp  = new MDvalues();
        return auxMD(root,cmp);
    }

    public static Integer auxMD(BSTNode root,MDvalues cmp)
    {
        if(root == null) return 0;

        auxMD(root.left,cmp);
        if(cmp.getDiff() == Integer.MAX_VALUE)
        {
            cmp.setPrev(root.data);
            cmp.setDiff(Integer.MAX_VALUE-100);
        }
        else
        {
            cmp.setDiff(Math.min(root.data - cmp.getPrev(),cmp.getDiff()));
        }
        auxMD(root.right,cmp);

        return cmp.getDiff();

    }
}

class MDvalues
{
    int diff = Integer.MAX_VALUE;
    int prev = 0;

    public int getPrev() {
        return prev;
    }

    public int getDiff() {
        return diff;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }
}
