package LinearList;

public class SinglyLinkedList
{
    public static void main(String[] args)
    {
        llist SL = new linkedlist();
        SL.add(1);
        SL.add(3);
        SL.add(4);
        SL.add(5);
        SL.add(6);
        SL.display();
        System.out.println();
        System.out.println(SL.getHead());
        System.out.println(SL.getTail());
    }
}
