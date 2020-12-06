package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hash {
    public static void main(String[] args) {
        HashMap<String,String>  map =new HashMap<>();
        map.put("India","New Delhi");
        map.put("USA","LA");
        map.put("NZ","Australia");
        map.put("NZ","Canada");



        Iterator<Map.Entry<String,String>> it= map.entrySet().iterator();
        while(it.hasNext()){
           Entry<String, String> entry= it.next();
            System.out.println(entry.getValue()+entry.getKey());



        }
        System.out.println("---------------------------------");

        map.forEach((k,v)->System.out.println(k+v));
        System.out.println("---------------------------------");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + value);
        }

    }
}
