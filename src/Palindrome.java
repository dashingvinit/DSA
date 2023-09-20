public class Palindrome {
//    https://leetcode.com/problems/valid-palindrome/   Easy Recursion problem

    static public String cleanedString(StringBuilder n, StringBuilder cleaned, boolean palindrome) {
        if (n.length() == 0) {
            return cleaned.toString();
        }
        int index;
        if (palindrome) {
            index = n.length() - 1;
        } else {
            index = 0;
        }
        char c = n.charAt(index);
        if (Character.isLetterOrDigit(c)) {
            cleaned.append(Character.toLowerCase(c));
        }
        n.deleteCharAt(index);
        return cleanedString(n, cleaned, palindrome);
    }

    public static void main(String[] args) {
        String str = new String("I am vinit");
        StringBuilder n = new StringBuilder(str);
        StringBuilder ans = new StringBuilder();

        String reversed = cleanedString(n, ans, true);
        System.out.println(reversed);
        n = new StringBuilder(str);
        ans = new StringBuilder();
        String normal = cleanedString(n, ans, false);
        System.out.println(normal);

        if (reversed.equals(normal)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
