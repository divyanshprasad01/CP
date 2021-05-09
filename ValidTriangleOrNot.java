/*You're given the length of three sides a, b, and c respectively. Now check if these three sides can form a triangle or not. Print "YES"(without quotes) if it can form a valid triangle with an area greater than 0, otherwise print "NO" (without quotes).

Input:
First-line will contain three numbers a, b, and c separated by space.
Output:
Print "YES"(without quotes) if these sides can form a valid triangle, otherwise print "NO" (without quotes).

Constraints
1≤a,b,c≤106
Sample Input 1:
2 4 3
Sample Output 1:
YES*/


import java.util.Scanner;

public class ValidTriangleOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a+b>c && a+c>b && c+b>a)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
