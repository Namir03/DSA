import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] arr = new String[3];

        for( String str : arr) {
            System.out.print(str + " ");
        }

        System.out.println();

        int[] num = new int[6];
        System.out.println(Arrays.toString(num)); // toString() - An inbuilt method.

        System.out.println(arr[0].length());

        Scanner sc = new Scanner(System.in);

        String[] stu = new String[3];
        for (int  i = 0; i < stu.length; i++) {
            stu[i] = sc.next();
        }
        System.out.println(Arrays.toString(stu));
    }
}
