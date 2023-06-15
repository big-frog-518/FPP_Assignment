package day12.q1;

/**
 * @Author Jinxu Zheng
 * @Date 6/14/2023
 **/
public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        //implement
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        //implement
        if (rear == arr.length) {
            resize();
        }
        arr[rear++] = obj;
        if (front == -1) {
            front = 0;
        }

    }

    public int dequeue() {
        //implement
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int element = arr[front];
        arr[front++] = 0;
        if (front == rear) {
            front = -1;
            rear = 0;
        }
        return element;
    }

    public boolean isEmpty() {
        //implement
        return front == -1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return rear - front;
    }

    private void resize() {
        //implement
        int newSize = arr.length * 2;
        int[] newArr = new int[newSize];
        System.arraycopy(arr, front, newArr, 0, rear - front);
        arr = newArr;
        rear -= front;
        front = 0;
    }
}
