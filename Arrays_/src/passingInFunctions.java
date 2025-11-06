import java.util.Arrays;

public class passingInFunctions {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        append(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void append(int[] arr) {
        arr[2] = 69;
    }
    // Here, the reference variable in the append() function, that is 'arr' is pointing to the same object of 'nums',
    // that is {1, 2, 3, 4}. That is why when we write "arr[2] = 69", it also appends the original object of 'nums'.
}
