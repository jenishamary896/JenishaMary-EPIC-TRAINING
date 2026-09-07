import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  Map<Character,Integer> map3=new HashMap<>();
	  String str="hellooo";
	  int count=1;
	 
	  for(int i=0;i<str.length();i++){
	      char ch=str.charAt(i);
	      if(map3.containsKey(ch)){
	          count++;
	      }
	      else{
	         count=1;
	      }
	    map3.put(str.charAt(i),count);
	  }
	   System.out.println(map3);
	}
}
