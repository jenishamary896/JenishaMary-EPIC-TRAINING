import java.util.Scanner;

class Node {
    Node next;
    int data;
    Node head = null, tail = null;

    Node(int data, Node next) {
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

            Node obj = new Node(val, null);

            if (head == null) {
                head = obj;
                tail = obj;
                tail.next = head;
            } 
            else {
                tail.next = obj;
                tail = obj;
                tail.next = head;
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

    void insertHead(Scanner sc) {
        System.out.println("Enter value:");
        int val = sc.nextInt();

        Node newNode = new Node(val, head);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } 
        else {
            head = newNode;
            tail.next = head;
        }
    }

 
    void insertTail(Scanner sc) {
        System.out.println("Enter value:");
        int val = sc.nextInt();

        Node newNode = new Node(val, null);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } 
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
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

        Node newNode = new Node(val, null);
        Node temp = head;

        for (int i = 0; i < pos - 2; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }

        tail.next = head;
    }

    void insertHeadValue(int val) {
        Node newNode = new Node(val, head);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } 
        else {
            head = newNode;
            tail.next = head;
        }
    }

    
    void deleteHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
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

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
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

        for (int i = 0; i < pos - 2; i++) {
            temp = temp.next;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        tail.next = head;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node n = new Node();

        System.out.println(
            "1.insertData 2.displayData 3.insertMiddle " +
            "4.insertHead 5.insertTail 6.deleteVal " +
            "7.deleteHead 8.deleteTail"
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
            }
        }
    }
}
