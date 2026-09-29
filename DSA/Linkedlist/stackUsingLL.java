import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node top = null;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(){
        
    }

    // PUSH
    public void push(Scanner in){
        System.out.println("Enter the value:");
        int val = in.nextInt();

        Node obj = new Node(val, top);
        top = obj;
    }

    // POP
    public void pop(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }

    // DISPLAY
    public void display(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // PEEK
    public void peek(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element: " + top.data);
        }
    }

    // ISEMPTY
    public void isEmpty(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }
}

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Node obj = new Node();

        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("4. Peek");
        System.out.println("5. IsEmpty");

        while(true){

            System.out.println("Enter your choice:");
            int n = sc.nextInt();

            switch(n){

                case 1:{
                    obj.push(sc);
                    break;
                }

                case 2:{
                    obj.pop();
                    break;
                }

                case 3:{
                    obj.display();
                    break;
                }

                case 4:{
                    obj.peek();
                    break;
                }

                case 5:{
                    obj.isEmpty();
                    break;
                }

                default:{
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
