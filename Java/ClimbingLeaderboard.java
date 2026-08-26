import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ranked = new int[n];
        for (int i = 0; i < n; i++) {
            ranked[i] = sc.nextInt();
        }
        int[] unique = new int[n];
        int size = 0;
        unique[size++] = ranked[0];
        for (int i = 1; i < n; i++) {
            if (ranked[i] != ranked[i - 1]) {
                unique[size++] = ranked[i];
            }
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int player = sc.nextInt();
            int rank = 1;
            while (rank <= size && player < unique[rank - 1]) {
                rank++;
            }
            System.out.println(rank);
        }
    }
}
Climbing the Leaderboard                                 Output 
7                                                            6
100 100 50 40 40 20 10                                       4
4                                                            2
5 25 50 120                                                  1



