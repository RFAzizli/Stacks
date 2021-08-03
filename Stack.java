package Stacks;

public interface Stack {
    /*
        push(Object item) - adds a new Object item to the top of the Stack
     */
    boolean push(Object item);
    /*
        pop() - removes an item from the top of the stack, and then returns it
     */
    Object pop();
    /*
        peek() - returns an item from the top of the stack
     */
    Object peek();
    /*
        isEmpty() - checks if the Stack is empty
     */
    boolean isEmpty();
    /*
        isFull() - checks if the Stack is full
     */
    boolean isFull();
}
