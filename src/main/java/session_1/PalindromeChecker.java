public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) return true;
        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        return new String(chars).equals(new String(reversed));
    }

    public static void checkAll(String text) {
        String iter = isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome";
        String recur = isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome";
        String rev = isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome";
        System.out.printf("\"%s\" -> Iterative: %s | Recursive: %s | Array Reversal: %s%n", text, iter, recur, rev);
    }

    public static void main(String[] args) {
        checkAll("madam");
        checkAll("hello");
    }
}
