package BinarySearchTree;

import static BinarySearchTree.BSTUtils.buildRBST;
import static BinarySearchTree.BSTUtils.display;

public class Find_Mode_Binary_Search_Tree
{
    public static void main(String[] args)
    {
        int n = 8;
        BSTNode root = buildRBST(n);
        display(root);
        System.out.println(mode(root));
    }

    public static Integer mode(BSTNode root)
    {
        modevalues cmp = new modevalues();
        return auxmode(root,cmp);
    }

    public static Integer auxmode(BSTNode root,modevalues cmp)
    {
        if(root == null)
        {
            return 0;
        }

        auxmode(root.left,cmp);
        if(root.data != cmp.getCurrent())
        {
            if(cmp.getFreq() > cmp.getPrevfreq()) {
                cmp.setPrevalue(cmp.getCurrent());
                cmp.setPrevfreq(cmp.getFreq());
            }
            cmp.setCurrent(root.data);
            cmp.setFreq(1);
        }
        else
        {
            cmp.setFreq(cmp.getFreq()+1);
        }
        auxmode(root.right,cmp);

        if(cmp.getPrevfreq() > cmp.getFreq()) return cmp.prevalue;

        return cmp.current;

    }

}

class modevalues
{
    int prevfreq = 0;
    int prevalue = 0;
    int freq = 0;
    int current = -1;

    public int getPrevfreq() {
        return prevfreq;
    }

    public int getPrevalue() {
        return prevalue;
    }

    public void setPrevfreq(int prevfreq) {
        this.prevfreq = prevfreq;
    }

    public void setPrevalue(int prevalue) {
        this.prevalue = prevalue;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public int getCurrent() {
        return current;
    }

    public int getFreq() {
        return freq;
    }
}
