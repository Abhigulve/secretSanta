package subarray;

import java.util.ArrayList;
import java.util.List;

class SubarraySum {


    public static void getSubArrayIndex(int[][] tilesMatrix, List<List<String>> groups, int sum) {
        for (int i = 0; i < tilesMatrix.length; i += 2) {
            List<String> list = new ArrayList<String>();
            subArraySum(tilesMatrix[i], sum, 0, tilesMatrix[0].length - 1, i, list);
            groups.add(list);
        }
        for (int i = 1; i <= tilesMatrix.length - 1; i += 2) {
            List<String> list1 = new ArrayList<String>();
            subArraySum(tilesMatrix[i], sum, 0, tilesMatrix[0].length - 1, i, list1);
            groups.add(list1);
        }
    }

    private static void subArraySum(int arr[], int sum, int st, int end, int row, List<String> list) {
        int curr_sum = 0, i;
        for (i = st; i <= end; i++) {
            if (curr_sum >= sum) {
                if (st == end - 1) {
                    list.add("{" + row + "" + st + "}");
                    break;
                }

                list.add("{" + row + "" + st + "," + row + "" + (i - 1) + "}");
                break;
            }
            if (i <= end)
                curr_sum = curr_sum + arr[i];
        }

        if (arr.length == i) {
            return;
        }
        subArraySum(arr, sum, i + 1, end, row, list);
    }

    public static void main(String[] args) {
        SubarraySum arraysum = new SubarraySum();

        //int arr[] = {23, 12, 85, 3, 4, 49, 50};
        int arr[] = {24, 3, 5, 0, 10, 45, 0};
        int n = arr.length;
        int sum = 28;
        List<String> list = new ArrayList<String>();
        subArraySum(arr, sum, 0, n, 0, list);
        System.out.println(list);

        int[][] tilesMatrix = {
                {23, 12, 5, 4, 3, 49, 50},
                {24, 3, 5, 0, 10, 45, 0},
                {2, 8, 2, 34, 2, 2, 23}
        };
        List<List<String>> groups = new ArrayList<List<String>>();
        getSubArrayIndex(tilesMatrix, groups, 30);
        for (int i = 0; i < groups.size(); i++) {
            System.out.println(groups.get(i));
        }
    }


}