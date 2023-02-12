package BinarySearchTree;

import static BinarySearchTree.BSTUtils.buildRBST;
import static BinarySearchTree.BSTUtils.display;

public class Validate_Binary_Search_Tree
{
    public static void main(String[] args)
    {
        int n = 8;
        BSTNode root = buildRBST(n);
        display(root);
        System.out.println(validatebstree(root));
    }

    public static Boolean validatebstree(BSTNode root)
    {
        values cmp = new values();
        auxvalidatelefttree(root,cmp);
        if(root.data > cmp.getMax()) return false;
        auxvalidaterighttree(root,cmp);
        if(root.data < cmp.getMin()) return false;

        return true;
    }

    public static void auxvalidatelefttree(BSTNode root,values cmp)
    {
        if(root == null) return;

        cmp.setMax(Math.max(root.data,cmp.getMax()));
        auxvalidatelefttree(root.left,cmp);
        auxvalidatelefttree(root.right,cmp);
    }

    public static void auxvalidaterighttree(BSTNode root,values cmp)
    {
        if(root == null) return;

        cmp.setMin(Math.min(root.data,cmp.getMin()));
        auxvalidatelefttree(root.left,cmp);
        auxvalidatelefttree(root.right,cmp);
    }


}

class values
{
    private int max = 0;
    private int min = 0;

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }
}


 /*  public static void auxvalidatebstree(BSTNode root,values cmp,char s)
    {
        if(root == null) return;
        if(s == 'L'){
            cmp.setMin(Math.min(root.data,cmp.getMin()));
        }
        else if(s == 'R'){
            cmp.setMax(Math.max(root.data,cmp.getMax()));
        }
        auxvalidatebstree(root.left,cmp,'L');
        auxvalidatebstree(root.right,cmp,'R');

    } */