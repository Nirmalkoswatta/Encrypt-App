package code;

public class stack {
    private int maxSize;
    private String stackArray[];
    private int top;

    // Constructor
    public stack(int max) {
        this.maxSize = max;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    // Push operation
    public void push(String a) {
        if (!isFull()) {
            stackArray[++top] = a;
        } else {
            System.out.println("Stack is full!");
        }
    }

    // Pop operation
    public String pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            return "Stack is empty!";
        }
    }

    // Peek operation
    public String peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            return "Stack is empty!";
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
