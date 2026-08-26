import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        int temp; 
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

       for (int i = 0 ; i < size ; i++){
           for (int j = i+1; j < size ; j++){
               if(arr[i] < arr[j]){
                   temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }  
           }
          
       }
       for (int i = 1 ; i < size ; i++){
              if (arr[i] != arr[0]){
                  System.out.println("2nd largest no :"+ arr[i] );
                  break;
              }
       }
      
    }
}
