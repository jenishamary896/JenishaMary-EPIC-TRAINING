class classA {
   int a=10;
  void printData(int a,int b){
      System.out.println("class A");
   }
}
class classB extends classA  {
   int b=20;
  void printData(int a){
       System.out.println("class B");
  }
}
class classC extends classB {
    int c=30;
    void printData(int a,int b,int c){
        System.out.println("class C");
    }
}
public class Main
{
	public static void main(String[] args) {
	    classB obj=new classB();
	    classC obj1=new classC();
	    obj.printData(10);
		obj.printData(10,20);
		obj1.printData(10,20,30);
		obj1.printData(10);
		obj1.printData(10,20);
	}
}  
//multilevel inheritance acessing a,b values through b obj and a,b,c values through c obj
