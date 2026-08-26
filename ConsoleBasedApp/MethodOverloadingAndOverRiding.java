class MyData{
    void display(int a){
        System.out.println("One");
    }
    void display(int a,int b){
        System.out.println("Two");
    }
    void display(int a,int b,int c){
        System.out.println("Three");
    }
}


public class Main
{
	public static void main(String[] args) {
		MyData obj = new MyData();
		obj.display(10);
		obj.display(10,20);
	}
}
//method overloading---same class ,same methods --compile time --it check the parameters passed and methods 
//method overriding --diferent cls,same method--runtime--it checks the ref obj and cls

class MyData1{
    void display(){
        System.out.println("one");
    }
}
class MyData2 extends MyData1{
    void display(){
        System.out.println("two");
    }
}
public class Main{
    public static void main(String[] args){
       MyData1 obj=new MyData2();//this is called obj binding
       obj.display();
    }
}
//here the value of mydata2 obj is stored in the variale of mydata1
