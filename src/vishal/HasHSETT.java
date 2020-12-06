package vishal;

import java.util.HashSet;
import java.util.Set;

public class HasHSETT{
    public static void main(String[] args) {


        String[] s = {"Vishal", "Sahil", "Vishal"};

        Set<String> str = new HashSet<>();
        for (String st : s) {
            int k=0;
            if (str.add(st) == true) {

                k++;
                System.out.println("duplicate element is "+st );
            }


        }


    }
}
