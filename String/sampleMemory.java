public class Main
{
	public static void main(String[] args) {
	    //scp
		String str1 = "Hello";//100
		String str2 = "Hello";//100
		//heap
		String str3 = new String("Hello");//200
		String str4 = new String("Hello");//300
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		
		
	
	}
}
