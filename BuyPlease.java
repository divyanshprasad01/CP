/*Chef went to a shop and buys a pens and b pencils. Each pen costs x units and each pencil costs y units.
    Now find what is the total amount Chef will spend to buy a pens and b pencils.
    Input:
            First-line will contain 4 space separated integers a, b, x and y respectively.
    Output:
            Print the answer in a new line.

    Constraints
        1≤a,b,x,y≤103
    */


import java.util.Scanner;

public class BuyPlease {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a,b,x,y;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println((a*x)+(b*y));

    }
}
