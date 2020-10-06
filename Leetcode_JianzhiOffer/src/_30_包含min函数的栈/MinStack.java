package _30_包含min函数的栈;

import java.util.Stack;

public class MinStack {
    Stack<Integer> A, B;
    /** initialize your data structure here. */
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if (B.empty() || B.peek() >= x)  B.add(x);
    }

    public void pop() {
        if (A.pop().equals(B.peek()))  B.pop();
    }

    public int top() {
        return A.pop();
    }

    public int min() {
        return B.peek();
    }
}