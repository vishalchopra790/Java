package practice;

import java.util.Set;

public class HashSet<S> {
    public static void main(String[] args) {
        String[] s={"Vishal","Vishal","Sahil","Shalu"};

        Set<String> set=new java.util.HashSet<>();
        for(String c:s){
            int k=0;
            if(!set.add(c)){
                k++;
                System.out.println("duplicate element is"+c);
            }
        }
    }
}
