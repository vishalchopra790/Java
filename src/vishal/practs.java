package vishal;

import java.util.*;

public class practs {

    public static void main(String[] args) {

        String a = "Java is quite popular in java";
        System.out.println(Arrays.toString(duplicates(a)));

    }

    public static Object[] duplicates(String str) {
        String[] str1 = str.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : str1) {

            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        List<String> li = new ArrayList<>();
        for (String si : map.keySet()) {
            if (map.get(si) > 1) {
                li.add(si);
            }

        }
        return li.toArray();
    }
}