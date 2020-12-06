package lambdaDemos;

import java.util.Arrays;
import java.util.List;

public class Supply {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(listToStringArray(Arrays.asList(new String[]{"Vishal", "Rahul", "Anar"}))));
        System.out.println(Arrays.toString(listToIntArray(Arrays.asList(new Integer [] {1,2,3,4,5}))));
    }

    //conver List<String> to String []]
    public static String[] listToStringArray(List<String> list) {
        return list.toArray(new String[0]);
    }

    //List<Integer> to int[]
    public static Integer[] listToIntArray(List<Integer> list) {
        return list.toArray(new Integer[0]);
             //   mapToInt(n -> n).
    }

}
