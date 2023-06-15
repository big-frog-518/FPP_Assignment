package day12.q1;

/**
 * @Author Jinxu Zheng
 * @Date 6/14/2023
 **/
public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();

        System.out.println("empty? " + q.isEmpty());// true
        System.out.println("Size: " + q.size()); // Size: 0

        q.enqueue(111);
        q.enqueue(222);
        q.enqueue(333);

        System.out.println("Peek: " + q.peek()); // Peek: 111
        System.out.println("empty? " + q.isEmpty());// true
        System.out.println("Size: " + q.size()); // Size: 3

        System.out.println("Dequeue: " + q.dequeue()); // Dequeue: 111
        System.out.println("Dequeue: " + q.dequeue()); // Dequeue: 222

        System.out.println("Size: " + q.size()); // Size: 1

        q.enqueue(40);

        System.out.println("Peek: " + q.peek()); // Peek: 333
        System.out.println("Size: " + q.size()); // Size: 2

    }
}
