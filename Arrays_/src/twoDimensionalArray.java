import java.util.Arrays;
import java.util.Scanner;
public class twoDimensionalArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][];

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        // Those '[I@…' values are memory addresses (hashcodes) for each inner array object.
        // Because Arrays.toString() only goes one level deep — it doesn’t recursively print inner arrays.
        // It just sees that each element in arr2 is an int[] and prints its toString(), which by default is that '[I@...' form.

        // If you actually want to see the contents of a 2D array, use:
        System.out.println(Arrays.deepToString(arr2));

        Scanner sc = new Scanner(System.in);
        int[][] well = new int[3][3];

        for (int i = 0; i < well.length; i++) { // For Rows
            for (int j = 0; j < well[i].length; j++) { // For Columns
                well[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(well));
    }
}

