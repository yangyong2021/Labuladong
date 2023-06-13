import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class maxSlidingWindow {

    /**
     * 单调队列
     */
    static class singleQueue {
        LinkedList<Integer> q = new LinkedList<>();

        public void push(int n) {
            // 移除队尾中小于要插入队尾的元素的值
            while (!q.isEmpty() && q.getLast() < n) {
                q.pollLast();
            }
            // 移除之后，将欲插入队尾的值入队
            q.addLast(n);
        }

        // 得到队列中，最大的元素值，即队头元素
        public int max() {
            return q.getFirst();
        }

        //移除对头元素
        public void pop(int n) {
           if (n== q.getFirst()){
               q.pollFirst();
           }
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        singleQueue window = new singleQueue();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // 将k-1个元素先存在窗口中
            if (i < k - 1) {
                window.push(nums[i]);
            } else {
                // 移动窗口
                window.push(nums[i]);
                // 窗口中最大的元素出队，即队头元素出队
                res.add(window.max());
                // 移除队头
                window.pop(nums[i - k + 1]);
            }
        }
        int ans[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        res.forEach( a ->{
            System.out.println(a);
        });
    }
}
