import java.util.*;

public class SortStackUsingRecursion {

    public static void insertSorted(Stack<Integer> stk, int element) {
        if (stk.isEmpty() || stk.peek() <= element) {
            stk.push(element);
            return;
        }
        int top = stk.pop();
        insertSorted(stk, element);
        stk.push(top);
    }

    public static void sortStack(Stack<Integer> stk) {
        if (stk.isEmpty()) {
            return;
        }
        int top = stk.pop();
        sortStack(stk);
        insertSorted(stk, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(4);
        stk.push(5);
        stk.push(2);
        stk.push(0);

        System.out.println("Original Stack: " + stk);
        sortStack(stk);
        System.out.println("Sorted Stack: " + stk);
    }
}