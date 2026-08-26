import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int prv = 0, next = 0;
        while (prv < n) {
            if (next >= n) {
                prv++;
                next = prv;
                continue;
            }
            int sum = 0;
            for (int i = prv; i <= next; i++) {
                sum += arr[i];
            }
            if (sum >= target) {
                if (sum == target) {
                    for (int k = prv; k <= next; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
                prv++;
                next = prv;
                continue;
            }
            for (int j = next + 1; j < n; j++) {
                if (sum + arr[j] == target) {
                    for (int k = prv; k <= next; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println(arr[j]);
                }
            }
            next++;
        }
    }
}

