package LinearList;

public class lnode
{
    int data;
    lnode next;
    public lnode()
    {
        next = this;
    }
    public lnode(int data)
    {
        this.data = data;
    }
}
