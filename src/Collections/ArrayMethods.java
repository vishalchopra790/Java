package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<>(Arrays.asList("Vishal","Sahil","Alka","Vishal"));
        ArrayList<String> ab=new ArrayList<>(Arrays.asList("Chopra","Sekhri","Arora"));
//        ar.addAll(1,ab);
//        System.out.println(ar);
       ArrayList<String> ac=new ArrayList<>();
        System.out.println(ac);
        System.out.println(ac.contains("Vishal"));
        System.out.println(ac.indexOf("Vishal")==0);
        int i =ar.lastIndexOf("Vishal");
        System.out.println(i);
        ArrayList<Integer> ara=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ara.removeIf(num->num%2==1);
        System.out.println(ara);
    }
}
