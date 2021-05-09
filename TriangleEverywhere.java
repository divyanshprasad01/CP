/*You're given the length of three sides a, b, and c respectively.
Now If these three sides can form an Equilateral Triangle then print 1, if these three sides
can form an Isosceles Triangle then print 2, if these three sides can form a Scalene Triangle then print 3, otherwise print −1.

Input:
First-line will contain three numbers a, b, and c separated by space.
Output:
Print the answer in a new line.

Constraints
1≤a,b,c≤103
Sample Input 1:
2 4 3
Sample Output 1:
3*/


import java.util.Scanner;

public class TriangleEverywhere {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a+b>c && b+c>a && c+a>b) {
            if(a==b&&b==c)
                System.out.println(1);
            else if(a==b||a==c||c==b)
                System.out.println(2);
            else
                System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}
