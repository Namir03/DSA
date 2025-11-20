public class Min {

    public static void main(String[] args) {

        int[] arr = {6, 9, 88, 2, 4, 36,78};
        System.out.println(Min(arr));
    }

    static int Min(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
