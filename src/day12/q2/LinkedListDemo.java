package day12.q2;

import java.util.LinkedList;

/**
 * @Author Jinxu Zheng
 * @Date 6/14/2023
 **/
public class LinkedListDemo {
    /**
     * Take the demo code ArrayStackDemo.java. In that file Stack is implemented using
     * Array. Do the same behaviors by implementing stack using Linked List.[ Either using
     * singly linked list / Doubly linked list ]
     */
    private LinkedList<Object> stack;

    public LinkedListDemo() {
        stack = new LinkedList<>();
    }

    public void push(Object item) {
        stack.push(item);
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack.pop();
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}