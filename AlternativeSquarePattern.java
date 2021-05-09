/*You're given a number N. Print the first N lines of the below-given pattern.

1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25
30 29 28 27 26
Input:
First-line will contain the number N.
Output:
Print the first N lines of the given pattern.

Constraints
1≤N≤200
Sample Input 1:
4
Sample Output 1:
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16*/



import java.util.Scanner;

public class AlternativeSquarePattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countEve = 10, countOdd=1;
        for(int i=1; i<=n; i++){
            if(i%2!=0) {
                for (int j=countOdd; j < (countOdd + 5); j++) {
                    System.out.print(j + " ");
                }
                countOdd = countOdd+10;
                System.out.println();
            }else{
                for(int j=countEve;j>(countEve-5);j--){
                    System.out.print(j + " ");
                }
                countEve = countEve+10;
                System.out.println();
            }
        }

    }
}
