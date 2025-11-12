import java.util.ArrayList;
public class ArrayListEx {

    public static void main(String[] args) {

        // Syntax:
        // ArrayList<data_type> nameOfTheList = new ArrayList<>(the default size-initialCapacity);

        // Example:
        ArrayList<Integer> li = new ArrayList<>(10);

        li.add(42);
        li.add(6);
        li.add(9);
        li.add(35);
        li.add(77);
        li.add(86);
        li.add(90);
        li.add(25);
        li.add(21);
        li.add(3);
        li.add(18);
        li.add(10);
        li.add(45);
        li.add(99);
        li.add(100);// Added more than 10, that is allowed and possible in ArrayList, that is the exact use of ArrayList.

        System.out.println(li); // It will internally call it's own toString().

        System.out.println(li.contains(35));

        li.set(11, 111);

        li.remove(10);

        for (int i = 0; i < 5; i++) {
            System.out.println(li.get(i));
        }
    }
}
