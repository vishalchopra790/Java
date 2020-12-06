package practice;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWords {
    public static void main(String[] args) {
        String s="Java is my passion and I love java alot and I am following passion";
        //System.out.println(duplicate(s));
        String [] s1={"Vishal","Sahil","Vishal"};
        //dup(s);
        Integer[] a={1,2,3,4,5,3,2,45,5,3,55,4,3};
       // dupp(a);
        String c="aaaaaabbbcccccjdddaaa";
        dutt(c);
    }
    public static void dutt(String s){
//        String s1= s.toLowerCase();
//        char[] d=s1.toCharArray();
        List<String> l= Collections.singletonList(s);
        //System.out.println(l);
        //l.stream().filter(ss->ss.charAt()).forEach(System.out::println);

    }

//    public static void dupp(Integer[] i){
//        List<Integer> l=Arrays.asList(i);
//        l.stream().distinct().unordered().forEach(System.out::println);
//        String.
//
//    }

    public static void dup(String s){

        List<String> l= Arrays.asList(s.split(" "));
        l.stream().filter(ss->Collections.frequency(l,ss)>1).collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static String duplicate(String s)
    {   s=s.toLowerCase();
       String[] str=s.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String temp:str)
           if(map.containsKey(temp)){
               map.put(temp,map.get(temp)+1);
           }else{
               map.put(temp,1);
           }

        ArrayList<String> a=new ArrayList<>();
       for(String st:map.keySet()){
           if(map.get(st)>1){
               a.add(st);
           }
       }
       return a.toString();

    }
}
