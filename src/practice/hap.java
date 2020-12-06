package practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hap {
    public static void main(String[] args) {
        String[] a = {"Vishal", "Sahil", "Vishal"};
        System.out.println(Arrays.toString(dup(a)));
        dupp(a);
    }
    public static void dupp(String [] d){
        List<String> li=Arrays.asList(d);
        List<String> v=li.stream().filter(s -> Collections.frequency(li,s)>0).distinct().collect(Collectors.toList());
        v.forEach(System.out::println);

    }

    public static Object[] dup(String[] a) {
        Map<String, Integer> map=new HashMap<>();
        for(String temp:a){
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else
                map.put(temp,1);
        }
        List<String> li=new ArrayList<>();
        for (String p:map.keySet())
            if(map.get(p)>1){
                li.add(p);
            }
        return li.toArray();
    }
}

