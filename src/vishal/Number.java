package vishal;

import java.util.HashMap;
import java.util.Map;

public class Number {

    public static void main(String[] args) {
        System.out.println(frequency(1234543454335533336L));
    }

    //12343443434333
    public static Map<Character, Long> frequency(Long num){
        String numToStr=String.valueOf(num);
        char[] strToChar=numToStr.toCharArray();
        Map<Character,Long> mp=new HashMap<>();
        for(int i=0;i<strToChar.length;i++){
            Character temp=strToChar[i];
            if(mp.containsKey(temp)){
                mp.put(temp,mp.get(temp)+1);
            }
            else
            {
                mp.put(temp, (long) 1);
            }
        }return mp;
    }
}
