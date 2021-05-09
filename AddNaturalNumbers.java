/*You are given a number N. Find the sum of all numbers from 1 to N.

Input:
First-line will contain the number N.
Output:
Print the answer in a single line.

Constraints
1≤N≤109
Sample Input 1:
4
Sample Output 1:
10*/


/*There are two methods to solve this problem
* method 1: using for loop: In this method if the value of N increases the execution time increases. for this method time
*               complexity is O(N)
* method 2: using mathematical formula : there is a mathematical formula to find sum of N numbers that is n(n+1)/2
*           from this method the time complexity is O(1)*/

import java.util.Scanner;

public class AddNaturalNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long  sum=0;
        long a = scanner.nextLong();
        sum = a*(a+1)/2;
        System.out.println(sum);
    }
}
