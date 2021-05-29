import java.util.ArrayList;
import java.util.List;

public class SparseArray {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        ArrayList<Integer> result = new ArrayList<>();
        for (String item:queries) {
            int count = 0;
            for (String string : strings) {
                if (item.equals(string))
                    count++;
            }

            result.add(count);
        }

        return result;
    }

}
