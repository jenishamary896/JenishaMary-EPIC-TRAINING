class Counter{
    int count=0;
    public void incrementCount(){
        count++;
    }
} 
class MyThread1 extends Thread{
  Counter count;
  MyThread1(Counter count) {
      this.count=count;
  } 
  public void run(){
    for(int i=0;i<10;i++){
      count.incrementCount();
    }
  }
}
public class Main{
    public static void main(String[] args){
        Counter count=new Counter();
        MyThread1 t1=new MyThread1(count);
        MyThread1 t2=new MyThread1(count);
        t1.start();
        t2.start();
        System.out.println(count.count);
    }
    
}
