package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchroniz {
    public static void main(String[] args) {
       List<String> li= Collections.synchronizedList(new ArrayList<String>());
       li.add("Vishal");
       li.add("Sahil");
       synchronized (li){
           li.forEach(System.out::println);
       }
       CopyOnWriteArrayList<String> cd=new CopyOnWriteArrayList<>();
       cd.add("fff");
       cd.add("aaass");
       System.out.println(cd);
    }
}
