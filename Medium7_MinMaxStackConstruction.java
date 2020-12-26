public class Medium7_MinMaxStackConstruction {
    //all the vars of a stack.
    private int array[];
    private int top;
    private int totalCapacity;

    //constructor.
    Medium7_MinMaxStackConstruction(int size) {
        array = new int[size];
        totalCapacity = size;
        top = -1;
    }

    //size of the stack.
    public int size() {
        return top + 1;
    }

    //check if it is full.
    public Boolean isItFull() {
        return top == totalCapacity - 1;
    }

    //check if it is empty.
    public Boolean isItEmpty() {
        return top == -1;
    }

    //add element in the stack.
    public void Push(int n) {
        if (isItFull()) {
            System.out.println("Stack if full, run away its gonna puke now");
            System.exit(0);
        }
        System.out.println("Adding " + n);
        array[++top] = n;
    }

    //remove element from the stack.
    public int Pop(int n) {
        if (isItEmpty()) {
            System.out.println("Ma Stack is empty");
            System.exit(1);
        }
        return array[top--];
    }

    //method to printing.
    public void printingStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(array[i]);
        }
    }

    // calling methods and running the program.
    public static void main(String[] args) {
        Medium7_MinMaxStackConstruction st = new Medium7_MinMaxStackConstruction(10);
        System.out.println("");
        st.Push(67678);
        st.Push(0);
        st.Push(34234);
        st.Push(2334);
        st.Push(234634);
        st.Push(04);
        st.Push(68);
        st.Push(86790);

        st.Pop(4);
        System.out.println("\n After popping out");

        st.printingStack();
    }
}
