package lambdaDemos.functions;

import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {
        Function<Integer, Integer> fn=v->v*2;
        Function<Integer, Integer> fv=v->v*v*v;

        System.out.println(fn.andThen(fv).apply(2));
        System.out.println(fn.compose(fv).apply(2));
    }
}
