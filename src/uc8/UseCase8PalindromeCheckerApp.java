package uc8;

public class UseCase8PalindromeCheckerApp {

    // Node class for Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to check palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle (slow & fast pointer)
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node prev = null;
        Node curr = slow;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare both halves
        Node first = head;
        Node second = prev;

        while (second != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "level";

        // Step 1: Convert string to linked list
        Node head = new Node(input.charAt(0));
        Node temp = head;

        for (int i = 1; i < input.length(); i++) {
            temp.next = new Node(input.charAt(i));
            temp = temp.next;
        }

        boolean result = isPalindrome(head);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}