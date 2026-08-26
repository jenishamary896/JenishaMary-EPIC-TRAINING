import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] dup = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (dup[i] !=1){
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        dup[i] = 2;
                        dup[j] = 1;
                        
                    }
                }
            }
        }
        for (int i = 0 ; i < size ; i++){
            if (dup[i] == 2){
                System.out.println(arr[i]);
            }
        }
    }
}


 Print duplicate numbers
   Sample Input: [1, 2, 2, 3, 3, 4]
  Sample Output:  
2 3


