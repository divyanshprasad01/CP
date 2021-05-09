/*You are given a list of N integers and you need to reverse it and print the reversed list in a new line.

Input:
First-line will contain the number N.
Second line will contain N space-separated integers.
Output:
Print the reversed list in a single line.

Constraints
1≤N,Ai≤105
Sample Input 1:
4
1 3 2 4
Sample Output 1:
4 2 3 1*/

import java.util.Scanner;

public class ReverseMe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] items = new int[size];
        for(int i=0; i<size; i++)
            items[i]= scanner.nextInt();
        for(int i=size-1; i>=0; i--)
            System.out.print(items[i] + " ") ;
    }
}
