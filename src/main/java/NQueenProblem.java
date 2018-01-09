import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class NQueenProblem {

    public static void getAllComination(List<Integer> nums, List<List<Integer>> list, int k) {
        if (k == nums.size() - 1) {
            nums.set(k, 0);
            print(nums, nums.size(), list);
            nums.set(k, 1);
            print(nums, nums.size(), list);
            return;
        }
        nums.set(k, 0);
        getAllComination(nums, list, k + 1);
        nums.set(k, 1);
        getAllComination(nums, list, k + 1);
    }

    public static List<List<Integer>> subsets() {
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        getAllComination(l, list1, 0);
        for (List<Integer> i : list1) {
            System.out.println(i);
        }
        return list1;
    }

    public static void main(String[] args) {
        subsets();
    }

    private static void print(List<Integer> array, int end, List<List<Integer>> list) {
        int sum = 0;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < end; i++) {
            if (array.get(i) == 1) {
                li.add(array.get(i));
                sum++;
            }
        }
        if (sum == 0) {
            list.addAll(new ArrayList<>());
        }
    }

    class Nqueen {


        public boolean isSafe(int[][] board, int row, int col) {
            int i, j;

              /* Check this row on left side */
            for (i = 0; i < col; i++)
                if (board[row][i] == 1)
                    return false;

        /* Check upper diagonal on left side */
            for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
                if (board[i][j] == 1)
                    return false;

        /* Check lower diagonal on left side */
            for (i = row, j = col; j >= 0 && i < N; i++, j--)
                if (board[i][j] == 1)
                    return false;

            return true;
        }

        public List<List<String>> solveNQueens(int n) {

        }

    }


}


