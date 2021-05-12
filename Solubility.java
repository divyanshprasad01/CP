/*Suppose for a unit rise in temperature, the solubility of sugar in water increases by Bg100 mL.

Chef does an experiment to check how much sugar (in g) he can dissolve given that he initially has 1 liter of water at X degrees and the solubility of sugar at this temperature is Ag100 mL. Also, Chef doesn't want to lose any water so he can increase the temperature to at most 100 degrees.

Assuming no loss of water takes place during the process, find the maximum amount of sugar (in g) can be dissolved in 1 liter of water under the given conditions.

Input
The first line contains an integer T, the number of test cases. Then the test cases follow.
The only line of each test case contains three integers X,A,B.
Output
For each testcase, output in a single line the answer to the problem.

Constraints
1≤T≤1000
31≤X≤40
101≤A≤120
1≤B≤5
Subtasks
Subtask #1 (100 points): Original Constraints

Sample Input
3
40 120 1
35 120 2
40 115 3
Sample Output
1800
2500
2950*/

import java.util.Scanner;

public class Solubility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TestCases = scanner.nextInt();
        int[] results = new int[TestCases];
        for (int i = 0; i < TestCases; i++) {
            int x = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            results[i] = (a + ((100 - x) * b)) * 10;
        }
        for (int i = 0; i < TestCases; i++)
            System.out.println(results[i]);

    }

}
