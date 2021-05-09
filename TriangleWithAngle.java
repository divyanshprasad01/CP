/*You're given the three angles a, b, and c respectively. Now check if these three angles can form a valid triangle with an area greater than 0 or not. Print "YES"(without quotes) if it can form a valid triangle with an area greater than 0, otherwise print "NO" (without quotes).

Input:
First-line will contain three numbers a, b, and c separated by space.
Output:
Print "YES"(without quotes) if these sides can form a valid triangle, otherwise print "NO" (without quotes).

Constraints
0≤a,b,c≤180
Sample Input 1:
20 40 120
Sample Output 1:
YES*/


import java.util.Scanner;

public class TriangleWithAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (    (a + b + c == 180) &&
                ((a + b >= c) || (a + c >= b) || (b + c >= a)) &&
                (a != 0 && b != 0 && c != 0)
                && (a != 180 && b != 180 && c != 180))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

}
