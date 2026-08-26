class classA{
    int a=10;
}
class classB extends classA{
    int b=20;
}
class classC extends classA{
    int c=30;
}
public class Main
{
	public static void main(String[] args) {
	    classB obj=new classB();
	    classC obj1=new classC();
	    System.out.println(obj.a);
	    System.out.println(obj.b);
	    System.out.println(obj1.a);
	    System.out.println(obj1.c);
		
	}
}
//hierarchial inheritance

class classA{
    int a=10;
    void printData(){
        System.out.println("class A");
    }
}
class classB extends classA{
    int b=20;
    void printData(){
        System.out.println("class B");
    }
}
class classC extends classA{
    int c=30;
    void printData(){
        System.out.println("class C");
    }
}
class classD extends classB{
    int d=90;
    void printData(){
        System.out.println("class D");
    }
}
class classE extends classC{
    int e=87;
    void printData(){
        System.out.println("class E");
    }
}
class classF extends classE{
    int f=16;
    void printData(){
        System.out.println("class F");
    }
}
public class Main
{
	public static void main(String[] args) {
	    classD obj=new classD();
	    classF obj1=new classF();
	    System.out.println(obj.d);
	    System.out.println(obj.b);
	    System.out.println(obj.a);
	    System.out.println(obj1.a);
	    System.out.println(obj1.c);
	    System.out.println(obj1.e);
	    System.out.println(obj1.f);
		
	}
}
//hierarchial inheritance
