import java.util.Scanner;

public class Golf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String[] result = new String[testCases];

        for (int i = 0; i < testCases; i++) {
            long n = scanner.nextLong();
            long x = scanner.nextLong();
            long k = scanner.nextLong();

            result[i] = "NO";
            if(x>=k&&x%k==0) {
                for (long j = 0; j < (((n + 1) / k) + 1); j++) {
                    if (x == j * k || x == ((n + 1) - (j * k))) {
                        result[i] = "YES";
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < testCases; i++) {
            System.out.println(result[i]);
        }


    }

}
