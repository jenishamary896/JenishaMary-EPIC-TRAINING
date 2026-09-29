import java.util.Scanner;
class StackImplementation{
    int n = 10;
    int[] stack = new int[n];
    int top = -1;
    //push
    public void push(Scanner in){
        System.out.println("Enter a value: ");
        int val = in.nextInt();
       
        if(top==n-1){
            System.out.println("Stack Overflow");
        }
        else{
             top++;
            stack[top] = val;
            
        }
        
    }
    //pop
    public void pop(){
        if(top==-1){
            System.out.println("stack underflow");
        }
        else{
            System.out.println(stack[top]);
            top--;
        }
    }
    //peek
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    //isEmpty
        public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    //display
        public void display(){
        for(int i=top;i>-1;i--){
            System.out.println(stack[i]);
        }
    }

}


public class Main
{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		StackImplementation obj=new StackImplementation();
	
		while(true){
		    System.out.println("1.push 2.pop 3.display");
		    int n=in.nextInt();
		    switch(n){
		        case 1:{
		           obj.push(in);
		           break;
		        }
		        case 2:{
		            obj.pop();
		            break;
		        }
		        case 3:{
		            obj.peek();
		            break;
		        }
		        case 4:{
		            obj.isEmpty();
		            break;
		        }
		        case 5:{
		            obj.display();
		            break;
		        }
		    }
		}
		    
		
	}
}
