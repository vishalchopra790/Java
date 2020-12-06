package practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateAlphabet {
    public static void main(String[] args) {
        System.out.println(duplicate("aAaABBBBBDDSSADDD"));
    }

    public static String duplicate(String s){
        s=s.toLowerCase().trim();
        char[] a=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(Character temp:a){

            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }

        return map.toString().replace("{","").replace(",","").replace(" ","").replace("=","").trim();
    }
}
