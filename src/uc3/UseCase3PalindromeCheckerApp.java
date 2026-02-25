package uc3;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam"; // hardcoded string
        String reversed = "";

        // Reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Print both strings
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        // Compare using equals()
        if (input.equals(reversed)) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : false");
        }
    }
}