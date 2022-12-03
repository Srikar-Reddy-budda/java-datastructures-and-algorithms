package LinearList;

public class Dlnode
{
    int data;
    Dlnode next;
    Dlnode prev;
    public Dlnode()
    {
        next = prev = this;
    }
    public Dlnode(int data)
    {
        this.data = data;
    }
}
