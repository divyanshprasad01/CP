/**Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.

Example


Queries are interpreted as follows:

    a b k
    1 5 3
    4 8 7
    6 9 1
Add the values of  between the indices  and  inclusive:

index->	 1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]
The largest value is  after all operations are performed.

Function Description

Complete the function arrayManipulation in the editor below.

arrayManipulation has the following parameters:

int n - the number of elements in the array
int queries[q][3] - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.
Returns

int - the maximum value in the resultant array
Input Format

The first line contains two space-separated integers  and , the size of the array and the number of operations.
Each of the next  lines contains three space-separated integers ,  and , the left index, right index and summand.

Constraints

Sample Input

5 3
1 2 100
2 5 100
3 4 100
Sample Output

200
Explanation

After the first update the list is 100 100 0 0 0.
After the second update list is 100 200 100 100 100.
After the third update list is 100 200 200 200 100.

The maximum value is .
*
 * */



import java.util.*;

public class ArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        long max = 0;
        ArrayList<Long> array = new ArrayList<Long>(Collections.nCopies(n, 0L));
        // for(int i=0; i<n; i++){
        //     array.add(0L);
        // }

        for(List<Integer> item: queries){
           array.set(item.get(0), array.get(item.get(0))+ item.get(2));
           if(item.get(1)<n)
               array.set(item.get(1)+1 , (array.get(item.get(1)+1) - item.get(2)));
        }
        long temp = 0L;
        for(long items: array){
            temp += temp+items;
            if(max<temp)
                max = temp;
        }

        return max;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

//This will be the "difference array". The entry arr[i]=k indicates that arr[i] is exactly k units larger than arr[i-1]
        long[] arr = new long[n];

        int lower;
        int upper;
        long sum;

        for(int i=0;i<n;i++) arr[i]=0;

        for(int i=0;i<m;i++){
            lower=scan.nextInt();
            upper=scan.nextInt();
            sum=scan.nextInt();
            arr[lower-1]+=sum;
            if(upper<n) arr[upper]-=sum;
        }

        long max=0;
        long temp=0;

        for(int i=0;i<n;i++){
            temp += arr[i];
            if(temp> max) max=temp;
        }

        System.out.println(max);
    }

}
