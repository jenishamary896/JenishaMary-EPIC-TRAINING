import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String str2 = in.nextLine();
		for(int k=0;k<str.length();k++){
		    
    		for(int i=k;i<str.length();i++){
    		    String emp = "";
    		    for(int j=k;j<=i;j++){
    		        emp+=str.charAt(j);
    		    }
    		    if(emp.equals(str2)){
    		        System.out.println("Its a SubString");
    		    }
    		}
		}
	}
}
or
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String str1=sc.nextLine();
	    boolean notSubstring=true;
	    for(int i=0;i<str.length();i++){
	         String empstr="";
	        if(i<=str1.length()){
	        for(int j=i;j<str1.length()+i;j++){
	            empstr+=str.charAt(j);
	        }
	      if(str1.equals(empstr)){
	          System.out.println("its a substring");
	          notSubstring=false;
	          break;
	      }
	        }
	    }
	 if(notSubstring){
	     System.out.println("not a substring");
	 }
	}
}	
