class MyData extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("THREAD IS RUNNING");
    }
}
public class Main
{
	public static void main(String[] args) throws InterruptedException {
		MyData t1 = new MyData();
		t1.start();
		Thread.sleep(100);
		System.out.println(t1.getState());
		t1.join();//Waiting
		System.out.println("MAIN THREAD");
	}
}


// ThreadObj.getState();

// new------>thread is created

// runnable----->its running or it is ready to run

// timed waiting--->one thread is waiting till the time is completed

// blocked---->One thread will be wating until the running thread completes its task

// waiting---->

// terminated----thread is completed

(or)
  class MyData extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Inside");
    }
}
public class Main
{
	public static void main(String[] args) throws InterruptedException {
		MyData t1 = new MyData();
		MyData t2 = new MyData();
		
		t1.start();//5s
		t2.start();
		Thread.sleep(100);
		System.out.println(t1.getState());//runnable
		System.out.println(t2.getState());//timed waiting
		
		
	}
}
(or)
  class MyData extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Inside");
    }
}
public class Main
{
	public static void main(String[] args) throws InterruptedException {
		MyData t1 = new MyData();
		MyData t2 = new MyData();
		
		t1.start();//5s
		Thread.sleep(100);
		System.out.println(t1.getState());//runnable
		t2.start();
		Thread.sleep(100);
		System.out.println(t2.getState());//timed waiting
		
		
	}
}











