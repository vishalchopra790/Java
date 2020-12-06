package lambdaDemos.functions;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        Function<Integer, Integer> fu=i->i*i;
        System.out.println(fu.apply(34));
    }
}
