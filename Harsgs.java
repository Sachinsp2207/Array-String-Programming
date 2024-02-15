package arrays;
import java.util.HashMap;
import java.util.Map;

public class Harsgs {

    public static int weird_array(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(count.containsKey(arr[i])) {
                count.put(arr[i], count.get(arr[i]) + 1);
            }
            else {
                count.put(arr[i], 1);
            }
        }
        int max_count = 0;
        for(Map.Entry<Integer, Integer> i : count.entrySet()) {
            if(i.getValue() > max_count) {
                max_count = i.getValue();
            }
        }
        if(max_count == 1) {
            return 0;
        }
        else {
            for(Map.Entry<Integer, Integer> i : count.entrySet()) {
                if(i.getValue() == max_count) {
                    return max_count;
                }
            }
        }
        return 0;
    }
}
