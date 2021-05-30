

/*  NOT COMPLETE*/






import java.io.BufferedReader;
import java.util.Scanner;

public class CorrectSentence {




    public static boolean isFirstLanguage(String word) {
        return (word.charAt(0) >= 'a') && (word.charAt(0) <= 'm');
    }

    public static boolean isSecondLanguage(String word) {
        return (word.charAt(0) >= 'N') && (word.charAt(0) <= 'Z');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase =  scanner.nextInt();
        String[] result =  new String[testCase];
        for (int k = 0; k < testCase; k++) {

            result[k] = "N0";

            String input = scanner.nextLine();

            int numberOfWords = Integer.parseInt(input.split(" ")[0]);
            if (numberOfWords != 1) {
                String[] phrase = input.split(" ");

                for (int i = 1; i < phrase.length; i++) {
                    if (isFirstLanguage(phrase[i]) == isSecondLanguage(phrase[i + 1])) {
                        result[k] = "YES";
                    }
                }

            }
        }

        for (int i = 0; i < testCase; i++)
            System.out.println(result[i]);

    }


}
