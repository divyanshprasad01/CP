/**A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return the result.

Example


After  rotations, .

Function Description

Complete the rotateLeft function in the editor below.

rotateLeft has the following parameters:

int d: the amount to rotate by
int arr[n]: the array to rotate
Returns

int[n]: the rotated array
Input Format

The first line contains two space-separated integers that denote , the number of integers, and , the number of left rotations to perform.
The second line contains  space-separated integers that describe .

Constraints

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
 */

import java.util.List;

public class leftRotationHR {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int[] temp = new int[d];
        for(int i=0 ; i<d; i++){
            temp[i] = arr.get(i);
        }
        for(int i = d; i< arr.size(); i++){
            arr.set(i-d,arr.get(i)) ;
        }
        int count = 0;
        for(int i=arr.size() - d; i< arr.size(); i++){
            arr.set(i, temp[count++]);
        }

        return arr;

    }

}
