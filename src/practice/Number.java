package practice;

import java.util.HashMap;
import java.util.Map;

public class Number {
    public static void main(String[] args) {
        System.out.println(frequency(122223334455566554L));
    }

    private static String frequency(long l) {
        String num=String.valueOf(l);
        char[] c=num.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(Character temp:c)
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else
                map.put(temp,1);

        return map.toString();
    }
}
