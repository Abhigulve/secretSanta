import org.junit.Test;

import java.util.*;

/**
 * @author Abhijeet Gulve
 */
public class MatrixSort {

    public static void main(String[] args) {


    }

    /**
     * @param matrix Matrix which contains the elements feature count
     * @return return the matrix in our manipulation data structure
     */
    private static MatElement[][] copyToMatElement(int[][] matrix) {

        MatElement[][] matElements = new MatElement[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matElements[i][j] = new MatElement(i, j, matrix[i][j], false, false);
            }
        }
        return matElements;
    }

    /**
     * This method sort the all rows of matrix
     *
     * @param mat return sorted rows of matrix
     */
    private static MatElement[][] rowSort(MatElement[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            List<MatElement> elements = new ArrayList(Arrays.asList(mat[i]));
            Collections.sort(elements, new Comparator<MatElement>() {
                public int compare(MatElement o1, MatElement o2) {
                    return o2.getElement() - o1.getElement();
                }
            });
            mat[i] = elements.toArray(new MatElement[elements.size()]);
        }
        return mat;
    }

    /**
     * @param arr1 First sorted  Array
     * @param arr2 Second sorted Array
     * @return This returns the sorted Array
     */
    private static MatElement[] MergeSortedArray(MatElement[] arr1, MatElement[] arr2) {
        MatElement[] arr3 = new MatElement[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i].getElement() > arr2[j].getElement()) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        if (i < arr1.length) {
            System.arraycopy(arr1, i, arr3, k, (arr1.length - i));
        }
        if (j < arr2.length) {
            System.arraycopy(arr2, j, arr3, k, (arr2.length - j));
        }
        return arr3;
    }

    private static MatElement[][] mergeTo1DSortedArray(MatElement[][] mat) {

        MatElement[][] resMat = new MatElement[(mat.length / 2) + 1][];
        int i = 0, j = mat.length - 1;
        if (mat.length == 1 || mat[1] == null) {
            return mat;
        }
        while (i < j) {
            resMat[i] = MergeSortedArray(mat[i], mat[j]);
            i++;
            j--;
        }

        if (mat.length % 2 != 0) {
            resMat[i] = mat[i];
        }
        return mergeTo1DSortedArray(resMat);
    }

    public static MatElement[] MergeSort(int[][] matrix) {
        MatElement[][] mat = copyToMatElement(matrix);
        rowSort(mat);
        return mergeTo1DSortedArray(mat)[0];
    }

    @Test
    public void test() {
        int[][] tilesMatrix = {
                {20, 23, 12, 5},
                {21, 24, 3, 5},
                {32, 2, 8, 2}
        };
        for (MatElement matElement : MergeSort(tilesMatrix)) {
            System.out.println(matElement);
        }

    }

}
