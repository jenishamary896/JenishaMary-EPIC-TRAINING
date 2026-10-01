import java.util.Scanner;
class QueueImplementation{
    int n=6;
    int[] queue = new int[n];
    int front=-1;
    int rear=-1;
    void enQueue(Scanner in){
        if(rear==n-1){
            System.out.println("Queue Overflow");
        }
        else{
            if(front==-1){
                front=0;
            }
            System.out.println("Enter the value: ");
            queue[++rear] = in.nextInt();
        }
        
    }
    void deQueue(){
        if(front==-1){
            System.out.println("queue is underflow");
        }
        else{
            System.out.println(queue[front]);
            front++;
            if(front>rear){
                front=-1;
                rear=-1;
            }
        }
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }
    public void peek(){
        
    }

}


public class Main
{
	public static void main(String[] args) {
		QueueImplementation qi = new QueueImplementation();
		Scanner in = new Scanner(System.in);
		while(true){
		    System.out.println("1)EnQueue 2.DeQueue 3.display");
		    switch(in.nextInt()){
		        case 1:{
		            qi.enQueue(in);
		            break;
		        }
		        case 2:{
		            qi.deQueue();
		            break;
		        }
		        case 3:{
		            qi.display();
		            break;
		        }
		    }
		}
	}
}
