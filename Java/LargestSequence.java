import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int len = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < size; i++) {
            int zero = 0;
            int one = 0;
            for (int j = i; j < size; j++) {
                if (arr[j] == 0)
                    zero++;
                else
                    one++;
                if (zero == one) {
                    if (j - i + 1 > len) {
                        len = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
        }
    }
}

Largest Sequence in the given array 
Ex: Input : 9
                 0 0 1 1 0 1 0 1 0
Output:  0 0 1 1 0 1 0 1


