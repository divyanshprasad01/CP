/*You're given a number N. Print the first N lines of the below-given pattern.

    *
   **
  ***
 ****
*****
Input:
First-line will contain the number N.
Output:
Print the first N lines of the given pattern.

Constraints
1≤N≤200
Sample Input 1:
4
Sample Output 1:
   *
  **
 ***
*****/


import java.util.Scanner;

public class ReverseStarPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i; j++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
