import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> large;
    PriorityQueue<Integer> small;

    MedianFinder() {
        small = new PriorityQueue<>();
        large = new PriorityQueue<>((a, b) -> b - a);
    }

    public void addNum(int num){
        if (large.size() > small.size()){
            large.offer(num);
            small.offer(large.poll());
        }else {
            small.offer(num);
            large.offer(small.poll());
        }
    }

    public double findMedian(){
        if (small.size() > large.size()){
            return small.peek();
        }else if (large.size() > small.size()){
            return large.peek();
        }
        return (large.peek() + small.peek() )/2.0;
    }

    public static void main(String[] args) {

        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        // 返回 1.5 ((1 + 2) / 2)
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian()); // return 2.0
    }


}
