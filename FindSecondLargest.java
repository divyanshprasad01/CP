/*Given three distinct integers A, B and C, print the second largest number among them.

Input:
The input consists of three lines.
The first line contains a single integer A.
The second line contains a single integer B.
The third line contains a single integer C.
Output:
Print the second largest number among A, B and C, in a separate line.

Constraints
1≤A,B,C≤109
Sample Input 1:
2
7
21
Sample Output 1:
7*/




import java.util.Scanner;

public class FindSecondLargest {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int SecMax = A;

        if((B>SecMax && C<SecMax)||(C>SecMax && B<SecMax)) {
            System.out.println(SecMax);
        }else{
            SecMax = B;
            if((A>SecMax && C<SecMax)||(C>SecMax && A<SecMax))
                System.out.println(SecMax);
            else
                System.out.println(C);

        }

    }
}
