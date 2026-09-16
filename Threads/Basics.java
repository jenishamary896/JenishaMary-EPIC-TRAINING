class Employee{
    
}
class MyData extends Employee implements Runnable{
    public void run(){
        System.out.println("thread is running ");
    }
}
public class Main
{
	public static void main(String[] args) {
	    MyData t1=new MyData();
	    Thread th=new Thread(t1);
	    th.start();
		System.out.println("In Main");
	}
}
(or)
	class Node{
    int data;
    Node address;
    
    Node(int data,Node add){
        this.data=data;
        this.address = add;
    }
}
public class Main
{
	public static void main(String[] args) {
		Node obj1 = new Node(10,null);
		Node head = obj1;
		Node obj2 = new Node(20,null);
		obj1.address=obj2;
		Node obj3 = new Node(30,null);
		obj2.address=obj3;
		Node obj4 = new Node(40,null);
        obj3.address=obj4;
		System.out.println(head.address.address.address.data);
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.address;
		}
	}
}

public class Main
{
	public static void main(String[] args) {
		Node obj1 = new Node(10,null);
		Node head = obj1;
		Node obj2 = new Node(20,null);
		obj1.address=obj2;
		Node obj3 = new Node(30,null);
		obj2.address=obj3;
		Node obj4 = new Node(40,null);
        obj3.address=obj4;
		System.out.println(head.address.address.address.data);
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.address;
		}
	}
}

or

	(or)
	class Node{
    int data;
    Node address;
    
    Node(int data,Node add){
        this.data=data;
        this.address = add;
    }
}
