class Stack {
    private int maxSize;   
    private int top;       
    private int[] stack;   
    public Stack(int size) {
        maxSize = size;
        stack = new int[size];
        top = -1;  
    }
    public void push(int value) {
        if (top < maxSize - 1) {  
            stack[++top] = value;  
            System.out.println(value + " pushed to stack");
        } else {
            System.out.println("Stack Overflow! Can't push " + value);
        }
    }
    public int pop() {
        if (top == -1) {  
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        int poppedValue = stack[top--];  
        return poppedValue;
    }
    public int peek() {
        if (top == -1) {  
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];  
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
    public int size() {
        return top + 1;
    }
}
public class Stackkk{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}