package CODE;

import java.util.Stack;

public class Encryption {
    private String input;

    // Constructor
    public Encryption(String input) {
        this.input = input;
    }

    // Encryption method
    public String encryptString() {
        Stack<String> stack = new Stack<>();

        // Pushing each character onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(String.valueOf(ch));
        }

        StringBuilder encryptedText = new StringBuilder();

        // Pop characters and get ASCII values
        while (!stack.isEmpty()) {
            char ch = stack.pop().charAt(0);
            encryptedText.append((int) ch);
        }

        return encryptedText.toString();
    }
}
