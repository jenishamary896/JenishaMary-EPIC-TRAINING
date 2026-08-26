class classA {
   int a=10;
}
class classB extends classA  {
   int b=20;
}
public class Main
{
	public static void main(String[] args) {
	     classB obj=new classB();
		System.out.println(obj.a);
	}
}  
//if u create obj for classA u can only access the data of classA only
//but if u cretae obj for classb u can access both the data since class b inherits from clsA-single inheritance

class classA {
   int a=10;
   void printData(){
       System.out.println("class A");
   }
}
class classB extends classA  {
   int b=20;
   void printData(){
       System.out.println("class B");
   }
}
public class Main
{
	public static void main(String[] args) {
	    classB obj=new classB();
		
		obj.printData();
	}
}  
//if u create method for both cls and call them at the end by default it will call the content of cls b

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
public class Main
{
	public static void main(String[] args) {
	    classB obj=new classB();
		
		obj.printData(10,20);
	}
}  
//based on parameters u feed  your class will be called
