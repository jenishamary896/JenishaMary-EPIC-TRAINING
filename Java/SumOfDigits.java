import java.io.*;
import java.util.*;


public class Solution {


    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       int n = sc.nextInt();
       int result = 0;
       while ( n > 0){
        result += n % 10;
        n /= 10;
       }
       System.out.println(result);
    }
}

Given an integer N, calculate and print the sum of all its digits. Input Format A single integer N.
Constraints 0 ≤ N ≤ 10¹⁸
Output Format Print a single integer representing the sum of the digits of N.
Sample Input 0
 9876
Sample Output 0
 30
