import java.util.Arrays;

public class searchIn2DArray {

        public static void main(String[] args) {

            int[][] arr = {
                    {1, 2},
                    {7, 10, 30},
                    {45, 98, 300, 670}
            };
            System.out.println(Min(arr));
            System.out.println(Max(arr));
            System.out.println(search(arr, 300));
        }

        static int Min(int[][] arr) {

            if (arr.length == 0) {
                return -1;
            }

            int minVal = arr[0][0];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] < minVal) {
                        minVal = arr[i][j];
                    }
                }
            }
            return minVal;
        }

    static int Max(int[][] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int maxVal = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        }
        return maxVal;
    }

        static int search(int[][] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int elemnent = arr[i][j];
                    int[] indeces = {i, j};
                    if (target == arr[i][j]) {
                        System.out.println(Arrays.toString(indeces));;
                    }
                }
            }
            return -1;
        }
}
