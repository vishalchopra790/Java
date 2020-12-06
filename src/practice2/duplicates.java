package practice2;

import java.util.*;

public class duplicates {
    public static void main(String[] args) {
        int num[]={3,5,6,5,6,4,3,2,2,5,6,6,4,3,2,2,2,2};
        System.out.println(Arrays.toString(duplicates(num)));
    }

    public static Object[] duplicates(int[] num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {

            Integer temp = num[i];
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        List<Integer> list=new ArrayList<>();
        for(int s:map.keySet()){
            if(map.get(s)>1){
                list.add(s);
            }
        }
        return list.toArray();
    }
}
