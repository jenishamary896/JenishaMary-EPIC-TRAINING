import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		String str = in.nextLine();//Hello
		String empStr = "";
		for(int i=0;i<str.length();i++){
		    empStr+=str.charAt(i);
		    empStr+=" ";
		}
		System.out.println(empStr);
	}
}
