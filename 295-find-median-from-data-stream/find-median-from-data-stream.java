import java.util.PriorityQueue;
import java.util.Collections;

class MedianFinder {
    // Max-heap for the smaller half
    private PriorityQueue<Integer> left;
    // Min-heap for the larger half
    private PriorityQueue<Integer> right;

    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        left.offer(num);

        right.offer(left.poll());



        if (right.size() > left.size()) {
            left.offer(right.poll());
        }
    }

    public double findMedian() {
        if (left.size() > right.size()) {
            return left.peek();
        } else {
            return (left.peek() + right.peek()) / 2.0;
        }
    }
}