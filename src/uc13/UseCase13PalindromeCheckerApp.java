public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // -------- Algorithm 1: Simple Loop --------
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeSimple(input);
        long end1 = System.nanoTime();

        // -------- Algorithm 2: String Reverse --------
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeReverse(input);
        long end2 = System.nanoTime();

        // -------- Output --------
        System.out.println("Input: " + input);

        System.out.println("\n--- Simple Loop Method ---");
        System.out.println("Is Palindrome: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\n--- Reverse String Method ---");
        System.out.println("Is Palindrome: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
    }

    // Method 1: Two-pointer approach
    public static boolean isPalindromeSimple(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Reverse string approach
    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}