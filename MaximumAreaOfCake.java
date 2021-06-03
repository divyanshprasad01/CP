/**
 * Given a rectangular cake with height h and width w, and two arrays of integers horizontalCuts and verticalCuts
 * where horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly,
 * verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.
 *
 * Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided
 * in the arrays horizontalCuts and verticalCuts. Since the answer can be a huge number, return this modulo 10^9 + 7.
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: h = 5, w = 4, horizontalCuts = [1,2,4], verticalCuts = [1,3]
 * Output: 4
 * Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. A*/





import java.util.Arrays;

public class MaximumAreaOfCake {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        if(h == 0 || w==0)
            return 0;

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int maximumHeightDif = Math.max(horizontalCuts[0], h-horizontalCuts[horizontalCuts.length - 1]);
        int maximumWidthDif = Math.max(verticalCuts[0], w-verticalCuts[verticalCuts.length -1]);
        for(int i=1; i<horizontalCuts.length; i++){
            maximumHeightDif = Math.max(maximumHeightDif, horizontalCuts[i]-horizontalCuts[i-1]);
        }
        for(int i=1; i<verticalCuts.length; i++){
            maximumWidthDif = Math.max(maximumWidthDif, verticalCuts[i]-verticalCuts[i-1]);
        }
        return (int)((long) maximumWidthDif * maximumHeightDif % 1000000007);

    }


}
