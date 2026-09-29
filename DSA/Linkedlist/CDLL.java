import java.util.Scanner;

class Node {
    Node prev;
    int data;
    Node next;

    Node head = null;
    Node tail = null;

    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    Node() {
    }

  
    void insertData(Scanner sc) {

        System.out.println("no of values:");
        int n = sc.nextInt();

        System.out.println("values:");

        for (int i = 0; i < n; i++) {

            int val = sc.nextInt();

            Node obj = new Node(null, val, null);

            if (head == null) {
                head = obj;
                tail = obj;

                head.next = head;
                head.prev = head;
            }
            else {
                obj.prev = tail;
                obj.next = head;

                tail.next = obj;
                head.prev = obj;

                tail = obj;
            }
        }
    }

 
    void displayData() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

   
    void displayReverse() {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail;

        do {
            System.out.println(temp.data);
            temp = temp.prev;
        } while (temp != tail);
    }

    void insertHead(Scanner sc) {

        System.out.println("Enter value:");
        int val = sc.nextInt();

        Node newNode = new Node(null, val, null);

        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.prev = head;
        }
        else {
            newNode.next = head;
            newNode.prev = tail;

            head.prev = newNode;
            tail.next = newNode;

            head = newNode;
        }
    }

  
    void insertTail(Scanner sc) {

        System.out.println("Enter value:");
        int val = sc.nextInt();

        Node newNode = new Node(null, val, null);

        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.prev = head;
        }
        else {
            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            head.prev = newNode;

            tail = newNode;
        }
    }

  
    void insertMiddle(Scanner sc) {

        System.out.println("Enter position:");
        int pos = sc.nextInt();

        System.out.println("Enter value:");
        int val = sc.nextInt();

        if (pos == 1) {
            insertHeadValue(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 2; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(null, val, null);

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

  
    void insertHeadValue(int val) {

        Node newNode = new Node(null, val, null);

        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.prev = head;
        }
        else {
            newNode.next = head;
            newNode.prev = tail;

            head.prev = newNode;
            tail.next = newNode;

            head = newNode;
        }
    }

  
    void deleteHead() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;

        head.prev = tail;
        tail.next = head;
    }

   
    void deleteTail() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

       
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        tail = tail.prev;

        tail.next = head;
        head.prev = tail;
    }

   
    void deleteVal(Scanner sc) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Enter position:");
        int pos = sc.nextInt();

        if (pos == 1) {
            deleteHead();
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == tail) {
            deleteTail();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node n = new Node();

        System.out.println(
            "1.insertData " +
            "2.displayData " +
            "3.insertMiddle " +
            "4.insertHead " +
            "5.insertTail " +
            "6.deleteVal " +
            "7.deleteHead " +
            "8.deleteTail " +
            "9.displayReverse"
        );

        while (true) {

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    n.insertData(sc);
                    break;

                case 2:
                    n.displayData();
                    break;

                case 3:
                    n.insertMiddle(sc);
                    break;

                case 4:
                    n.insertHead(sc);
                    break;

                case 5:
                    n.insertTail(sc);
                    break;

                case 6:
                    n.deleteVal(sc);
                    break;

                case 7:
                    n.deleteHead();
                    break;

                case 8:
                    n.deleteTail();
                    break;

                case 9:
                    n.displayReverse();
                    break;
            }
        }
    }
}
