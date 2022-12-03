package LinearList;

public class linkedlist implements llist
{
    private lnode head;
    private lnode tail;
    private int size;
    public void linkedlist()
    {
        head = new lnode();
        size  = 0;
    }
    @Override
    public void add(int data)
    {
        if(head == null)
        {
            lnode temp = new lnode(data);
            head = temp;
            tail = temp;
            size++;
        }
        else
        {
            lnode temp = new lnode(data);
            tail.next = temp;
            tail = temp;
            size++;
        }

    }



    public int getHead()
    {
        return head.data;
    }

    public int getTail()
    {
        return tail.data;
    }

    public void display()
    {
        lnode ptr = head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
    }
}
