package LinearList;

public class CircularLinkedList
{
    public static void main(String[] args)
    {
        Dlist cl = new DoublyLinkedList();
        cl.addFirst(5);
        cl.addFirst(4);
        cl.addFirst(3);
        cl.addLast(6);
        cl.add(0,1);
        cl.add(1,2);
        System.out.println(cl.removeFirst());
        System.out.println(cl.removeLast());
        System.out.println(cl.removeLast());
        System.out.println(cl.remove(2));
        cl.display();
        System.out.println("Size : "+cl.getSize());
    }
}
