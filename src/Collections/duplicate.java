package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> ara=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,4,3,2,4,2,2,4,4,8,9,10));
        LinkedHashSet<Integer> li =new LinkedHashSet<Integer>(ara);
        ArrayList<Integer> ar=new ArrayList<Integer>(li);
        System.out.println(ar);

        ara.stream().distinct().forEach(System.out::println);

    }
}
