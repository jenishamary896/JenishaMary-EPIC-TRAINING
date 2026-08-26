import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();//6
	    int[] arr1 = new int[n];// 12 24 16 8 10 9
	    int[] arr2 = new int[n];
	    
	    for(int i=0;i<n;i++){
	        int count = 0;
	        arr1[i] = in.nextInt();
	        for(int j=2;j<=(arr1[i])/2;j++){
	            if(arr1[i]%j==0){
	                count++;
	            }
	        }
	        arr2[i] = count;
	    }
	    
	    for(int i=0;i<n;i++){
	        System.out.println(arr2[i]);
	    }
	   
	}
}
