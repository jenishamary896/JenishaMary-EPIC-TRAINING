import java.util.*;
public class Main {
    public static void findCombinations(int[] arr, int target, int index, int sum, ArrayList<Integer> list) {
        if (sum == target) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            return;
        }
        if (sum > target || index == arr.length) {
            return;
        }
        list.add(arr[index]);
        findCombinations(arr, target, index + 1, sum + arr[index], list);
        list.remove(list.size() - 1);
        findCombinations(arr, target, index + 1, sum, list);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        findCombinations(arr, target, 0, 0, list);
    }
}
