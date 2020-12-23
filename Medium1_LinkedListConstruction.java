public class Medium1_LinkedListConstruction {
    //making a node here.
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //making global var for h and t.
    public Node head = null;
    public Node tail = null;

    //method to add a node.
    public void addingNode(int data) {
        Node newN = new Node(data);

        if(head == null) {
            head = newN;
            tail = newN;
        }
        else {
            tail.next = newN;
            tail = newN;
        }
    }

    //method do display the output.
    public void output() {
        Node current = head;
        if(head == null) {
            System.out.println("No list");
        }

        System.out.println("yep the list is empty, wanna check.");

        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    //Calling the methods and Printing 'em.
    public static void main(String[] args) {
        Medium1_LinkedListConstruction List = new Medium1_LinkedListConstruction();

        List.addingNode(6);
        List.addingNode(3);
        List.addingNode(4);
        List.addingNode(2);
        List.addingNode(6);
        List.addingNode(4);
        List.addingNode(1);
        List.addingNode(8);

        List.output();
    }
}
