/*Populating Next Right Pointers in Each Node: You are given a perfect binary
        tree where all leaves are on the same level, and every parent has two children. The binary tree
        has the following definition:
        struct Node {
        int val;
        Node *left;
        Node *right;
        Node *next;
        }
        Populate each next pointer to point to its next right node. If there is no next right node, the
        next pointer should be set to NULL.
        Initially, all next pointers are set to NULL.
        Input: root = [1,2,3,4,5,6,7]
Output: [1,#,2,3,#,4,5,6,7,#]
*/


package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Populating_next_right_pointers_in_each_node
{
    public static void main(String[] args)
    {
        TreeNode root = null;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        BinaryTreeUtils.display(root);
        System.out.println(Approch1(root));
    }

    public static LinkedList<Integer> Approch1(TreeNode root)
    {
        LinkedList<Integer> res = new LinkedList<>();
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        Q.add(null);
        while(!Q.isEmpty())
        {
            root = Q.remove();
            if(root!=null) res.add(root.data);
            else res.add(null);
            if(root == null)
            {
                if(!Q.isEmpty()){
                    Q.add(null);
                }
            }
            else
            {
                if(root.left!=null)
                {
                    Q.add(root.left);
                }
                if(root.right!=null)
                {
                    Q.add(root.right);
                }
            }
        }

        return res;
    }
}
