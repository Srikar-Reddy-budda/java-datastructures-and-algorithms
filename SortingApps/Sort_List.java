package SortingApps;


public class Sort_List
{
    static node head = null;
    public static void main(String[] args)
    {

        add(4);
        add(2);
        add(1);
        add(3);
        add(5);
        add(0);
        add(6);
        head = mergeSort(head);

    }

    static class node {
        int val;
        node next;

        public node(int val) { this.val = val; }
    }

    static void add(int new_data)
    {
        node new_node = new node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static node getMiddle(node head)
    {
        if (head == null)
            return head;

        node slow = head, fast = head;

        while (fast.next != null
                && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    static node mergeSort(node h)
    {
        if (h == null || h.next == null) {
            return h;
        }
        node middle = getMiddle(h);
        node nextofmiddle = middle.next;
        middle.next = null;
        node left = mergeSort(h);
        node right = mergeSort(nextofmiddle);
        node sortedlist = sortedMerge(left, right);

        return sortedlist;
    }


    static node sortedMerge(node a, node b)
    {
        node result = null;
        if (a == null)
            return b;
        if (b == null)
            return a;
        if (a.val < b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }

        return result;
    }
}
