package vishal;

import java.util.HashMap;
import java.util.Map;

public class RepeatedElements {
    public static void main(String[] args) {
        System.out.println(value("AAABBBCBGA"));
    }

    public static String value(String str){
        str=str.toLowerCase().trim();
        Map<Character,Integer> mp=new HashMap<>();

        for (int i=0;i<str.length();i++){
            Character temp=str.charAt(i);
            if(mp.containsKey(temp)){
                mp.put(temp,mp.get(temp)+1);
            }
            else{
                mp.put(temp,1);
            }
        }return mp.toString();

    }
}
