import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int size = sc.nextInt();
		int oddCount =0;
		int evenCount= 0;
		for (int i= 0; i < size; i++) {
			int n = sc.nextInt();
			if( (n % 2) == 0 ) {
				evenCount +=1;
			}
			else {
				oddCount +=1;
			}	
		}
        System.out.println("evenCount:"+evenCount);
        System.out.println("oddCount:"+oddCount);
       
	}
}
