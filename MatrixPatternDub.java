import java.util.Scanner;

public class MatrixPatternDub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = 0;
//        variable to use in place of integer so original input never gets disturbed
        int temp = number;

//        find the number of digits in the given integer to initialize arrays
        do {
            temp = temp / 10;
            count++;
        } while (temp != 0);

//        intialize the array
        int[][] matrix = new int[count][count];

//        forward loop which will fill pyramid down matrix straight;
        for (int i = 0; i < count; i++) {
            temp = number;
            for (int j = count - 1 - i; j >= 0; j--) {
                matrix[i][j] = temp % 10;
                temp = temp / 10;
            }
        }

//      similar to forward a backward loop which comes from down to up in row making a pyramid and initializes required numbers.
        for (int i = count - 1; i >= 0; i--) {
            temp = number;
            for (int j = count - 1 - i; j < count; j++) {
                matrix[i][j] = temp % 10;
                temp = temp / 10;
            }
        }

//        finally loop to print the values of matrix in the required form
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
