import java.util.HashSet;
public class Tough4_FindLoop {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    static public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static boolean detectLoop(Node h) {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            if (s.contains(h))
                return true;
            s.add(h);
            h = h.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Tough4_FindLoop llist = new Tough4_FindLoop();

        llist.push(0);
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);
        llist.push(7);
        llist.push(8);
        llist.push(9);
        llist.push(10);

        llist.head.next.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}
