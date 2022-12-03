package LinearList;

public class Repeated_Josephus
{
    public static void main(String args[]) {
        int n = 5;
        int k = 2;
        Dlist prisoners = new DoublyLinkedList();
        for (int i = 1; i <= n; i++) {
            prisoners.add(i - 1, i);
        }
        prisoners.display();
        Dlnode head = prisoners.getHead();
        Dlnode current = head;
        int size = prisoners.getSize();
        int p = 1+k;
        while (size > 1) {
            for(int i=0;i<k;i++)
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

        System.out.println("********************************************************************************************");
    }
}
