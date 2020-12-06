package vishal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 5, 6, 4, 4, 3, 4,5, 5, 6, 6, 6, 7, 5, 4};
        System.out.println(Arrays.toString(unique(a)));
    }

    public static Object[] unique(int[] num) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++) {
            int temp = num[i];
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
            ArrayList<Integer> ab = new ArrayList<>();
            for (Integer s : map.keySet()) {
                if (map.get(s) ==1) {
                    ab.add(s);

            }
        }return ab.toArray();
    }
}
