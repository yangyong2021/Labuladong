import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;

public class LRUCache {

    private int capacity;
    LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        // 标记当前key为当前使用
        int val = map.get(key);
        map.remove(key);
        map.put(key,val);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            map.put(key,value);
            // 标记为最近使用
            int val = map.get(key);
            map.remove(key);
            map.put(key,val);

            // 如果相同只改不做其他操作就终止此方法
            return;
        }
        if (map.size() >= this.capacity){
            int headKey = map.keySet().iterator().next();
            map.remove(headKey);
        }

        map.put(key,value);
    }
    
    
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1); // 缓存是 {1=1}
        lruCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lruCache.get(1)); // 返回 1
        lruCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lruCache.get(2)); // 返回 -1 (未找到)
        lruCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lruCache.get(1)); // 返回 -1 (未找到)
        System.out.println(lruCache.get(3)); // 返回 3
        System.out.println(lruCache.get(4)); // 返回 4

    }


}
