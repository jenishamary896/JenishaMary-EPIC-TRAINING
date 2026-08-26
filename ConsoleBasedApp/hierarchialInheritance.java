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
