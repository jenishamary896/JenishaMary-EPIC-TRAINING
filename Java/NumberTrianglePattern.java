import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            int num =i;
            for (int j=1 ; j<= i;j++ ){
                System.out.print(num + " ");
                num = num +(n-j);        
            }
           System.out.println();    }}}

Problem Statement: Number Triangle Pattern
Given an integer N, print a triangle of numbers with N rows.
The pattern should be formed such that:
The first column contains consecutive numbers starting from 1. Each subsequent column is filled by adding an appropriate value 
so that the numbers continue in increasing order diagonally. The i-th row contains exactly i numbers. Print the numbers separated by a single space.
Sample Input 0
5
Sample Output 0
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

