import java.util.Objects;

public class LeetBilateral {
    public static void main(String[] args) {
        String s1 = "bnxw";
        String s2 = "bwxn";
        System.out.println(canBeEqual(s1, s2));
    }

    static public boolean canBeEqual(String s1, String s2) {
        if (Objects.equals(s1, s2)) {
            return true;
        }

        s1 = swap(s1, 0, 2);
        if (s1.equals(s2)) {
            return true;
        }

        s1 = swap(s1, 2, 0);
        s1 = swap(s1, 1, 3);

        if (s1.equals(s2)) {
            return true;
        }

        s1 = swap(s1, 3, 1);
        s1 = swap(s1, 0, 2);
        s1 = swap(s1, 1, 3);

        return s1.equals(s2);
    }

    static String swap(String s1, int i1, int i2) {
        char[] charArray = s1.toCharArray();
        char temp = charArray[i1];
        charArray[i1] = charArray[i2];
        charArray[i2] = temp;
        return new String(charArray);
    }
}
