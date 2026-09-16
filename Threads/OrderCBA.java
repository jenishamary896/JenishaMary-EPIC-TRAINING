class Order{
    synchronized void updateStatus(String status){
        System.out.println(status);
    }
}
class Ordering implements Runnable{
    Order O;
    Ordering(Order O){
        this.O=O;
    }
    public void run(){
        O.updateStatus("payment processing");
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        O.updateStatus("payment completed ");
    }
}
class Payment extends Thread{
    Order O;
    Payment(Order O){
        this.O=O;
    }
    public void run(){
        O.updateStatus("order is being shipped");
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        O.updateStatus("order delivered");
    }
}
public class Main{
    public static void main(String[] args)throws Exception{
        Order O=new Order();
        System.out.println("order placed");
        Ordering or=new Ordering(O);
        Payment py=new Payment(O);
        Thread t1=new Thread(or);
        t1.start();
        t1.join();
        py.start();
        py.join();
        System.out.println("thank u for ordering ");
        
    }
}
