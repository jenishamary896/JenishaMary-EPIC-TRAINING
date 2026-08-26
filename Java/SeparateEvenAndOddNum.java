import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
         arr[i] = sc.nextInt();
        }
        System.out.println("Even Numbers: ");
        for (int i=0 ; i  < size ; i++){
            if (arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd Numbers: ");
        for (int i=0 ; i  < size ; i++){
            if (arr[i] % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}




 Separate even and odd numbers
	Sample Input: [1, 2, 34]


	Sample Output: Even: 2 4,Odd: 1,3      


