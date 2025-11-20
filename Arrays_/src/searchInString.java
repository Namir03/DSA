public class searchInString {

    public static void main(String[] args) {

        String name = "Namir";
        System.out.println(search(name, 'i'));
        System.out.println(searchInRange(name, 'm', 1, 4));
    }

    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static int searchInRange(String str, char target, int start, int end) {

        if (str.isEmpty()) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
