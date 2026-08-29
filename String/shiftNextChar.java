import java.util.Scanner;

public class Main
{
    static String reverseString(String str){//ab
       String empStr="";
       for(int i=0;i<str.length();i++){
           int val = (str.charAt(i) - 97 )+1;//1
           int div = ((val%26)+1)+96;//98
           //int div = ((val%26)+97);
           empStr+=((char)(div));
           
       }
       return empStr;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(Main.reverseString(str));
	}
}
