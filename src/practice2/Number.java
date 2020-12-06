package practice2;

import java.util.HashMap;
import java.util.Map;

public class Number {
    public static void main(String[] args) {
        String a = "aaaAAABBBJGHKJKHGHVVJVHJVJHVGFGGVVGDGFCCGHCHCVHVGHVGH";
        System.out.println(duplicate(a));
    }

    private static Object duplicate(String a) {
        a = a.toLowerCase().trim();
        char[] a2c = a.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a2c.length; i++) {
            Character temp = a2c[i];
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);

            } else {
                map.put(temp, 1);
            }
        }
        return map.toString().toLowerCase().replace("{","").replace("}","").replace(" ","")
                .replace(",","").replace("=","");
    }
}

