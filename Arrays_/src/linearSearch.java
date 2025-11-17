public class linearSearch {

    public static void main(String[] args) {

        int[] arr = {2, 89, 74, 6, 50, 33};
        int ans1 = search(arr, 50);
        int ans2 = search(arr, 60);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
