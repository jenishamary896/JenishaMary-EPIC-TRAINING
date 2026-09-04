import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> li=new ArrayList<>();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        li.add(sc.nextInt());
	    }
	    int max=Integer.MIN_VALUE;
	    int sl=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	      if(li.get(i)>max){
	          sl=max;
	          max=li.get(i);
	      }
	      else if(li.get(i)>sl&&li.get(i)<max){
	          sl=li.get(i);
	      }
	    }
	  
	   System.out.println(sl);
	}
}
