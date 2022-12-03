package LinearList;

public interface Dlist
{
    void addFirst(int data);
    void addLast(int data);
    void add(int i,int data);
    void display();
    int getSize();
    int removeFirst();
    int removeLast();
    int remove(int i);
    Dlnode getHead();
    int remove(Dlnode current);
}
