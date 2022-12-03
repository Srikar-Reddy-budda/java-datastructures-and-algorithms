package LinearList;

public class Last_Man_Standing
{
    public static void main(String args[]) {
        int n = 7;
        Dlist prisoners = new DoublyLinkedList();
        for (int i = 1; i <= n; i++) {
            prisoners.add(i - 1, i);
        }
        prisoners.display();
        Dlnode head = prisoners.getHead();
        Dlnode current = head;
        int size = prisoners.getSize();
        while (size > 2) {
            for(int i=0;i<2;i++)
            {
                current = current.next;
                if(current == head)
                {
                    current = current.next;
                }
            }
           // System.out.println(current.data);
            prisoners.remove(current);
           // prisoners.display();
            size = prisoners.getSize();
        }

        prisoners.display();
    }
}
