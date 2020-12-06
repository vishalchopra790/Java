package lambdaDemos.predicate;

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        int [] a={12,4,4,34,56,43,23,55,67};
        Predicate <Integer> pr=i->i%2==0;
        Predicate<Integer> ps=i->i>50;

        for(Integer c:a){
            if (!pr.test(c) )
                System.out.println(c);
        }
    }
}
