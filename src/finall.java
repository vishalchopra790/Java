import java.util.*;
import java.util.stream.Collectors;

public class finall {
    public static void main(String[] args) {
       String[] a={"Sahil","Vishal","Sahil"};
       List<String> l= Arrays.asList(a);
       Set<String> s=l.stream().filter(ss->Collections.frequency(l,ss)>1).collect(Collectors.toSet());
       s.forEach(System.out::println);
       }

    }

