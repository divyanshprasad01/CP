/**
 * Given a  2D Array, :
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * An hourglass in  is a subset of values with indices falling in this pattern in 's graphical representation:
 *
 * a b c
 *   d
 * e f g
 * There are  hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be .
 *
 * Example
 *
 *
 * -9 -9 -9  1 1 1
 *  0 -9  0  4 3 2
 * -9 -9 -9  1 2 3
 *  0  0  8  6 6 0
 *  0  0  0 -2 0 0
 *  0  0  1  2 4 0
 * The  hourglass sums are:
 *
 * -63, -34, -9, 12,
 * -10,   0, 28, 23,
 * -27, -11, -2, 10,
 *   9,  17, 25, 18
 * The highest hourglass sum is  from the hourglass beginning at row , column :
 *
 * 0 4 3
 *   1
 * 8 6 6
 * Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
 *
 * Function Description
 *
 * Complete the function hourglassSum in the editor below.
 *
 * hourglassSum has the following parameter(s):
 *
 * int arr[6][6]: an array of integers
 * Returns
 *
 * int: the maximum hourglass sum
 * Input Format
 *
 * Each of the  lines of inputs  contains  space-separated integers .
 *
 * Constraints
 *
 * Output Format
 *
 * Print the largest (maximum) hourglass sum found in .
 *
 * Sample Input
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * Sample Output
 *
 * 19
 */




import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HourGlass6by6 {
    public static int hourglassSum(List<List<Integer>> arr) {
        int max;
        int[][]  matrix = new int[6][6];
        for(int i=0; i<6; i++){
            List<Integer> array = arr.get(i);
            for(int j=0 ; j<array.size(); j++){
                matrix[i][j] = array.get(j);
            }
        }

        max = matrix[0][0]+matrix[0][1]+matrix[0][2]+
                matrix[1][1] +
                matrix[2][0]+matrix[2][1]+matrix[2][2];

        for(int i= 0; i<4 ;i++){
            for(int j=0 ; j<4 ; j++){
                if(     matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+
                        matrix[i+1][j+1] +
                        matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2] >max ){

                    max = matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+
                            matrix[i+1][j+1] +
                            matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                }
            }
        }

        return max;

    }

    public static void main(String[] args) throws IOException {

    }

}
