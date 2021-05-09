/*You are given a list of N integers and a value K. Print 1 if K exists in the given list of N integers, otherwise print −1.

Input:
First-line will contain two numbers N and K.
Next line contains N space-separated numbers.
Output:
Print the answer in a new line.

Constraints
1≤N,K,Ai≤105
Sample Input 1:
4 2
1 2 3 4
Sample Output 1:
1*/

import java.util.Scanner;

public class FindMe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count= 0;
        int size = scanner.nextInt();
        int k = scanner.nextInt();
        int[] items = new int[size];
        for(int i =0; i<size;i++) {
            items[i] = scanner.nextInt();
            if(items[i]==k) {
                count++;
                System.out.println(1);
                break;
            }
        }
        if(count==0)
            System.out.println(-1);


    }
}
