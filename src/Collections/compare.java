package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class compare {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>(Arrays.asList("A","B","C","D"));
        ArrayList<String> b=new ArrayList<>(Arrays.asList("A","B","D","E"));
        Collections.sort(a);
        Collections.sort(b);
        System.out.println(a.equals(b));

        //find out addidtional element
        a.removeAll(b);
        System.out.println(a);

        //missing
        b.removeAll(a);
        System.out.println(b);
    }
}
