
/*You are given a number N and find all the distinct factors of N.

Input:
First-line will contain the number N.
Output:
In the first line print number of distinct factors of N.
In the second line print all distinct factors in ascending order separated by space.
Constraints
1≤N≤106*/





import java.util.Scanner;

public class FactorsFinding {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int N = scanner.nextInt();
        for(int i=1; i<=N; i++){
            if(N%i==0)
                count++;
        }
        System.out.println(count);
        for(int i=1; i<=N; i++){
            if(N%i==0)
                System.out.print(i + " ");
        }
    }
}
