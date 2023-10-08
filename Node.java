import java.io.*;

class Node {
    Node next;
    int data;

    public Node() {
        next = null;
        data = 0;
    }

    public void Create(int n) throws Exception {
        Node ptr = new Node();
        Node ptr2 = new Node();
        ptr2 = null;
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter the data ");
        ptr.data = Integer.parseInt(in.readLine());
        ptr.next = null;
        ptr2 = ptr;
        Node temp;
        for (int i = 1; i < n; i++) {
            temp = new Node();
            System.out.println("Enter the data ");
            temp.data = Integer.parseInt(in.readLine());
            temp.next = null;
            ptr.next = temp;
            ptr = ptr.next;
            ptr2 = ptr;
        }

        display(ptr2);
    }

    void display(Node start) {
        System.out.println("LinkList is");
        do {
            System.out.println(start.data + "=========" + start.next);
            start = start.next;
        }
        while (start != null);
    }

    public static void main(String arg[]) throws Exception {
        int n;
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter the number of nodes");
        n = Integer.parseInt(in.readLine());
        Node obj = new Node();
        obj.Create(n);
    }
}