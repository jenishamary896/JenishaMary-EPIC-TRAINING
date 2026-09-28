import java.util.Scanner;
class Node{
    Node prev;
    int data;
    Node next;
    Node head=null,tail=null;
    
    Node(Node prev,int data,Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    Node(){
        
    }
    
    
    void insertData(Scanner in){
        System.out.println("Enter the number of data: ");
        int n = in.nextInt();//5
        for(int i=0;i<n;i++){
            int val  = in.nextInt();
            Node obj = new Node(null,val,null);
            if(head==null){
                head = obj;
            }
            else{
                obj.prev=tail;
                tail.next = obj;
            }
            tail = obj;
        }
    }
     void displayData(){
        	Node temp = head;
    		while(temp!=null){
		    System.out.println(temp.data);
		    temp=temp.next;
		}
    }
    void insertMiddle(Scanner in){
        System.out.println("enter the position:");
        int pos=in.nextInt();
        System.out.println("enter the value");
        int v=in.nextInt();
        Node newNode=new Node(null,v,null);
        Node temp=head;
        for(int i=0;i<pos-2;i++){
            temp=temp.next;
        }
        newNode.prev=temp;
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
    }
    void insertHead(Scanner in){
      System.out.println("val");
      int val=in.nextInt();
      Node newNode=new Node(null,val,null);
      newNode.next=head;
      head=newNode;
    }
    void insertTail(Scanner in){
       System.out.println("val");
      int val=in.nextInt();
      Node newNode=new Node(null,val,null);
      if(head==null){
          head=newNode;
          return;
      }
      Node temp=head;
      while(temp.next!=null){
          temp=temp.next;
      }
      newNode.prev=temp;
      temp.next=newNode;
     
    }
    void deleteVal(Scanner in){
        System.out.println("pos");
        int pos=in.nextInt();
        Node temp=head;
        for(int i=0;i<pos-2;i++){
              temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    void deleteHead(){
       if(head==null){
           System.out.println("list is empty");
           return;
       } 
       head=head.next;
       head.prev=null;
    }
    void deleteTail(){
        if(head==null){
           System.out.println("list is empty");
           return;  
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
        temp=temp.next;
        }
        temp.next=null;
    }
}
public class Main
{
	public static void main(String[] args) {
		Node n = new Node();
		Scanner in = new Scanner(System.in);
		System.out.println("1.insertData 2.displayData 3.insertMiddle 4.insertHead 5.insertTail 6.deleteVal 7.deleteHead 8.deleteTail" );
		while(true){
		  int num=in.nextInt();  
		  switch(num){
		      case 1:{
		          n.insertData(in);
		          break;
		      }
		      case 2:{
		          n.displayData();
		          break;
		      }
		      case 3:{
		          n.insertMiddle(in);
		          break;
		      }
		      case 4:{
		          n.insertHead(in);
		          break;
		      }
		      case 5:{
		          n.insertTail(in);
		          break;
		      }
		      case 6:{
		          n.deleteVal(in);
		          break;
		      }
		      case 7:{
		          n.deleteHead();
		          break;
		      }
		      case 8:{
		          n.deleteTail();
		          break;
		      }
		  }
		}

		(or)

		void insertDatainBetween(Scanner in){
        System.out.println("Enter the data: ");
        int val = in.nextInt();
        Node newNode = new Node(null,val,null);
        System.out.println("Enter the position: ");
        int pos = in.nextInt();//4
        if(pos==1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else{
            
            Node temp = head;
            for(int i=0;i<pos-2;i++){
                temp = temp.next;
            }
            
            if(temp.next==null){
                temp.next = newNode;
                newNode.prev = temp;
                tail = newNode;
            }
            else{
                newNode.prev = temp;
                newNode.next = temp.next;
                temp.next.prev = newNode;
                temp.next = newNode;
            }
        }
    }
    
		
		
		
	}
}
