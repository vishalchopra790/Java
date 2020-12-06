package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Object> ar =new ArrayList<>(Arrays.asList("Vishal",2,"Delhi"));
        //System.out.println(ar.get(3));
        for (int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));


        for (Object ab:ar)
            System.out.println(ab);

        //streams
        ar.forEach(System.out::println);

        //Iterator
        Iterator<Object> it=ar.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
}
