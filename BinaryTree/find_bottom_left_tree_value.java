//Find Bottom Left Tree Value: Given a binary tree, find the leftmost value in the last row
//of the tree. You may assume the tree (i.e., the given root node) is not NULL.

package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class find_bottom_left_tree_value
{
    public static void main(String args[])
    {
        int n = 10;
        TreeNode root = BinaryTreeUtils.randomBinaryTree(n);
        BinaryTreeUtils.display(root);
        System.out.println(recursiveApproch(root));
        System.out.println(QueueApproch(root));
    }

    public static int QueueApproch(TreeNode root)
    {
        Queue<NodeType> Q = new LinkedList<>();
        int depth = 0;
        Q.add(new NodeType(root,' ',depth+1));
        int res = root.data;
        int maxdepth = 0;

        while(!Q.isEmpty())
        {
            NodeType temp = Q.remove();
            if(temp.node.left == null && temp.node.right == null && temp.type == 'L')
            {
                if(temp.depth > maxdepth)
                {
                    res = temp.node.data;
                }
            }
            else
            {
                if(temp.node.left != null)
                    Q.add(new NodeType(temp.node.left,'L',temp.depth+1));
                if(temp.node.right != null)
                    Q.add(new NodeType(temp.node.right,'R',temp.depth+1));
            }
        }
        return res;
    }

    static class NodeType {
        TreeNode node;
        char type;
        int depth;
        public NodeType(TreeNode node, char type,int depth) {
            super();
            this.node = node;
            this.type = type;
            this.depth = depth;
        }

    }

    public static int recursiveApproch(TreeNode root)
    {
       return AuxrecursiveApproch(root,' ',1,new MaxDepth());
    }

    public static int AuxrecursiveApproch(TreeNode root,char p,int depth,MaxDepth md)
    {
        //System.out.println("tmp : "+root.data);
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
        {
            if(p == 'L')
            {
                if(depth > md.getMaxdepth())
                {
                    md.setMaxdepth(depth);
                    md.setRes(root.data);
                }
            }
            else if(p == ' ') return root.data;
        }
        if(root.left != null)
        AuxrecursiveApproch(root.left,'L',depth+1,md);
        if(root.right != null)
        AuxrecursiveApproch(root.right,'R',depth+1,md);

        return md.getRes();
    }

    static class MaxDepth
    {
        int maxdepth;

        public int getMaxdepth() {
            return maxdepth;
        }

        public void setMaxdepth(int maxdepth) {
            this.maxdepth = maxdepth;
        }

        public int getRes() {
            return res;
        }

        public void setRes(int res) {
            this.res = res;
        }

        int res;


    }
}
