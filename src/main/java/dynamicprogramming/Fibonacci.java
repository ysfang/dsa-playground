package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static long calculateDP(int idx) {
        List<Long> cache = new ArrayList<>();
        cache.add(0L);
        cache.add(1L);
        while (idx > cache.size() - 1) {
            cache.add(cache.get(cache.size() - 2) + cache.get(cache.size() - 1));
        }

        return cache.get(idx);
    }
}
