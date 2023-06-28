import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int nums[] = new int[]{73,74,75,71,69,72,76,73};
        int temperatures[] = dailyTemperatures(nums);
    }

    public static int[] dailyTemperatures(int temperatures[]){
        int ans [] = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            int tmp = temperatures[i];
            while (!s.isEmpty() && tmp > temperatures[s.peek()]){
                int index = s.pop();
                ans[index] = i - index;
            }
            s.push(i);
        }
        return ans;
    }
}
