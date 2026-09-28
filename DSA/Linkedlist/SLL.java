import java.util.Scanner;
class Node{
    int data;
    Node address;
    Node head=null,prev=null;
    Node(int data,Node address){
        this.data=data;
        this.address=address;
    }
    Node(){
        
    }
    void insertData(Scanner sc){
        System.out.println("Enter the no of Data: ");
            int n = sc.nextInt();//3-->10,20,30
            for(int i=0;i<n;i++){
                int val = sc.nextInt();//10
                Node obj = new Node(val,null);
                if(head==null){
                    head = obj;
                    prev=obj;
                }
                else{
                    prev.address = obj;
                    prev=obj;
                }
            }
    }
    
    void displayData(){
        	Node temp = head;
    		while(temp!=null){
		    System.out.println(temp.data);//40
		    temp=temp.address;//null
		}
    }
        void insertValue(Scanner sc){
        System.out.println("enter the position:");
        int n=sc.nextInt();
        System.out.println("enter the value:");
        int val=sc.nextInt();
        Node newNode=new Node(val,null);
        Node temp=head;
        for(int i=0;i<n-2;i++){
            temp=temp.address;
        }
        newNode.address=temp.address;
        temp.address=newNode;
    }
void insertHead(Scanner sc){
    System.out.println("Enter value:");
    int val = sc.nextInt();

    Node newNode = new Node(val, null);

    newNode.address = head;
    head = newNode;
}
void insertTail(Scanner sc){
    System.out.println("Enter value:");
    int val = sc.nextInt();

    Node newNode = new Node(val, null);


    if(head == null){
        head = newNode;
        return;
    }

    Node temp = head;

    while(temp.address != null){
        temp = temp.address;
    }

    temp.address = newNode;
}
void deleteValue(Scanner sc){
    System.out.println("Enter the position:");
    int n = sc.nextInt();

    Node temp = head;
    for(int i = 0; i < n - 2; i++){
        temp = temp.address;
    }
    temp.address = temp.address.address;
}
void deleteHead(){
    
    if(head == null){
        System.out.println("List is empty");
        return;
    }

    head = head.address;
    System.out.println("head deleted");
}
void deleteTail(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }

    if(head.address == null){
        head = null;
        return;
    }

    Node temp = head;

    while(temp.address.address != null){
        temp = temp.address;
    }

    temp.address = null;
    System.out.println("tail deleted");
}

}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node node=new Node();
        System.out.println("1.insert data 2.display data 3.insert value 4.insert head 5.insert tail 6.delete value 7.delete head 8.delete tail");
        while(true){
        int n=sc.nextInt();
        switch(n){
            case 1:{
               node.insertData(sc);
               break;
            }
            case 2:{
                node.displayData(); 
                break;
            }
            case 3:{
               node.insertValue(sc);
               break;
            }
            case 4:{
               node.insertHead(sc);
               break;
            }
            case 5:{
             node.insertTail(sc);
              break;
            }
            case 6:{
            node.deleteValue(sc);
            break;
            }
            case 7:{
             node.deleteHead();
              break;
            }
            case 8:{
            node.deleteTail();
            break;
            }
          }
            
        }
    }
}
      

    
