import java.util.List;
import java.util.ArrayList;

public class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> rows = new ArrayList<>();
        rows.add(new ArrayList<>(1));
        if (numRows == 1) {
            return rows;
        }

        while (--numRows > 0) {

            List<Integer> prevRow = rows.get(rows.size() - 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);
            for (int i = 1; i < prevRow.size(); i++) {
                currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
            }
            currentRow.add(1);
            rows.add(currentRow);
        }
        return rows;
    }
}
