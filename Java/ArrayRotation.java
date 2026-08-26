

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int rot = sc.nextInt();
		for (int i = 0; i < n ; i++){
		    arr[(i+ n-rot)%n] = sc.nextInt();
		}
		for (int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}







                                                   OR
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int rot=sc.nextInt();
        for(int i=n-rot;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-rot;i++){
            arr[i]=sc.nextInt();
        }
          
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

                                                                       OR

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int k=0;
        while(k<d){
            int temp=arr[0];
          for(int i=0;i<n-1;i++){
           arr[i]=arr[i+1];
          }
          k++;
          arr[n-1]=temp;
        }
        
          
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
Array rotation (Left & Right)
	Sample Input: [1,2,3,4,5], Left Rotation by 2
            Output : [ 3,4,5,1,2]
