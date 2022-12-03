package LinearList;

public class DoublyLinkedList implements Dlist
{
    Dlnode  head;
    int size;
    public DoublyLinkedList()
    {
        head = new Dlnode();
        this.size = 0;
    }

    @Override
    public void addFirst(int data)
    {
        Dlnode temp = new Dlnode(data);
        temp.next = head.next;
        head.next.prev = temp;
        head.next = temp;
        temp.prev = head;
        this.size++;
    }

    public void addLast(int data)
    {
        Dlnode temp = new Dlnode(data);
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        this.size++;
    }

    @Override
    public void add(int i, int data)
    {
        Dlnode current = head.next;
        for(int j = 0;j<i;j++)
        {
            current = current.next;
        }
        Dlnode temp = new Dlnode(data);
        temp.prev = current.prev;
        current.prev.next = temp;
        temp.next = current;
        current.prev = temp;
        size++;
    }

    @Override
    public void display()
    {
        Dlnode current = head.next;
        while(current!=head)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }


    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int removeFirst() {
        if(size == 0)
        {
            return Integer.MIN_VALUE;
        }
        Dlnode current = head.next;
        head.next = current.next;
        current.next.prev = head;
        size--;
        return current.data;
    }

    @Override
    public int removeLast() {
        if(size == 0)
        {
            return Integer.MIN_VALUE;
        }
        Dlnode current = head.prev;
        head.prev = current.prev;
        current.prev.next = current.next;
        size--;
        return current.data;
    }

    @Override
    public int remove(int i) {
        if(size == 0)
        {
            return Integer.MIN_VALUE;
        }
        Dlnode current = head.next;
        for(int j=0;j<i;j++)
        {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        return current.data;
    }

    public int remove(Dlnode current) {
        if(size == 0)
        {
            return Integer.MIN_VALUE;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        return current.data;
    }

    @Override
    public Dlnode getHead() {
        return this.head;
    }
}
