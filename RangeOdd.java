/*You're given two numbers L and R. Print all odd numbers between L and R (both inclusive) in a single line separated by space, in ascending (increasing) order.

Input:
First-line will contain two numbers L and R.
Output:
Print all odd numbers in a single line separated by space, in ascending (increasing) order.

Constraints
1≤L<R≤106
Sample Input 1:
2 9
Sample Output 1:
3 5 7 9*/


import java.util.Scanner;

public class RangeOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int r = scanner.nextInt();
        if(l>r){
            for(int i=r; i<=l; i++){
                if(i%2!=0)
                    System.out.print(i + " ");
            }
        }else{
            for(int i=l; i<=r; i++){
                if(i%2!=0)
                    System.out.print(i + " ");
            }
        }
    }
}
