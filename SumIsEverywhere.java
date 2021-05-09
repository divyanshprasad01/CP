/*You are given a number N and find the sum of the first N odd and even numbers in a line separated by space.
All even and odd numbers should be greater than 0.

Input:
First-line will contain the number N.
Output:
Print the sum of the first N odd and even numbers in a line separated by space.

Constraints
1≤N≤106
Sample Input 1:
4
Sample Output 1:
16 20*/

import java.util.Scanner;

public class SumIsEverywhere {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long odd= N*N;
        long even = N*(N+1);
        System.out.println(odd + " " + even);
    }
}
