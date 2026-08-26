
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i= 0 ; i < n/2; i++){
		    int val = 0;
		    for (int j = 0; j < n ; j++){
		        if(j<= i){
		            System.out.print(++val+" ");
		        }
		       else if (i+j >= n){
		           System.out.print(--val+" ");
		       } 
		       else{
		           System.out.print(val+" ");
		       }
		    }
		    System.out.println();
		}
		for (int i= (n/2)-1 ; i >= 0; i--){
		    int val = 0;
		    for (int j = 0; j < n ; j++){
		        if(j<= i){
		            System.out.print(++val +" ");
		        }
		       else if (i+j >= n){
		           System.out.print(--val +" ");
		       } 
		       else{
		           System.out.print(val+" ");
		       }
		    }
		    System.out.println();
		}
	}
}
