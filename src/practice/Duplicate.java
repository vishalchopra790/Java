package practice;

import java.util.*;

public class Duplicate {

    public static void main(String[] args) {
        int a[]={2,2,2,2,2,2,2,2,2,2,2,34,4,5,5,4,5,3,4,};
        System.out.println(Arrays.toString(duplicate(a)));

    }
    public static Object[] duplicate(int[] num){
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer n:num){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        List<Integer> li=new ArrayList<>();
        for(Integer i:map.keySet()){
            if(map.get(i)==1){
                li.add(i);
            }
        }
        return li.toArray();
    }
}
