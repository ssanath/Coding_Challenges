import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		 // Base case: if stack is empty, return
        if (stack.isEmpty()) {
            return;
        }

        // Pop the top element and hold it
        int top = stack.pop();

        // Recursively sort the remaining stack
        sortStack(stack);

        // Insert the top element back into the sorted stack
        insertSorted(stack, top);
	}
	private static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: if stack is empty or top of stack is less than or equal to element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Pop the top element and hold it
        int top = stack.pop();

        // Recursively insert the element in the sorted order
        insertSorted(stack, element);

        // Push the popped element back
        stack.push(top);
    }

}
