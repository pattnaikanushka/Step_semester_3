public class FirstNonRepeatingChar {
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String[] testInputs = {"swiss", "aabbcc"};
        for (String input : testInputs) {
            char result = findFirstNonRepeatingChar(input);
            if (result != '\0') {
                System.out.println("\"" + input + "\" -> First Non-Repeating Character: '" + result + "'");
            } else {
                System.out.println("\"" + input + "\" -> No Non-Repeating Character Found");
            }
        }
    }
}