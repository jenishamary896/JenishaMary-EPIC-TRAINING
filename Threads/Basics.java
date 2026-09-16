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
