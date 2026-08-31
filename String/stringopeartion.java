import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    String str=sc.nextLine();
	    int out=str.charAt(0)-'0';
	    for(int i=(str.length()/2)+1;i<str.length();i++){
	        int val=str.charAt(i-(str.length())/2)-'0';
	        switch(str.charAt(i)){
	            case '-':{
	               out-=val;
	               break;
	            }
	            case '+':{
	                out+=val;
	                break;
	            }
	            case '*':{
	                out*=val;
	                break;
	            }
	            case '/':{
	                out/=val;
	                break;
	            }
	            case '%':{
	                out%=val;
	                break;
	            }
	        }
	      System.out.println(out); 
	   }
	   System.out.println("the final answer:"+out);
	}
}
