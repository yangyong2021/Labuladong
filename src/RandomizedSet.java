import java.util.ArrayList;
import java.util.Random;

public class RandomizedSet {

    ArrayList<Integer> list = new ArrayList<>();
    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (list.contains(val)){
            return false;
        }else {
            list.add(val);
        }
        return true;
    }

    public boolean remove(int val) {
        if (list.contains(val)){

            int i = list.indexOf(val);
            list.remove(i);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int len = list.size();
        Random rand = new Random();
        return list.get(rand.nextInt(len));
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        randomizedSet.remove(2); // 返回 false ，表示集合中不存在 2 。
        randomizedSet.insert(2); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        randomizedSet.getRandom(); // getRandom 应随机返回 1 或 2 。
        randomizedSet.remove(1); // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        randomizedSet.insert(2); // 2 已在集合中，所以返回 false 。
        randomizedSet.getRandom(); // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
    }
}
