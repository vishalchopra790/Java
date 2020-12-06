package lambdaDemos.consumer;

import java.util.function.Consumer;

public class Demo2 {
    public static void main(String[] args) {
        Consumer<String> c1= System.out::println;
        Consumer<String> c2= System.out::println;
        Consumer<String> c3=c1.andThen(c2);
        c3.accept("Vishal");
    }
}
