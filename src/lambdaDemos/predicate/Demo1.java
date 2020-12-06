package lambdaDemos.predicate;

import java.util.function.Predicate;

public class Demo1 {

    public static void main(String[] args) {
        //Ex 1
        Predicate<Integer> p=i->(i<15);
        System.out.println(p.test(20));

        //Ex 2 check the length of the strin is greater or not
        Predicate<String> pr=i->i.length()>4;
        System.out.println(pr.test("Vishal"));

        //Print array elements whose array size is > 4
        String [] names={"Vishal","Alka","Axa","Sahil"};
        Predicate<String> prr=i->i.length()>4;
        for(String name:names){
            if(prr.test(name))
                System.out.println(name);
        }
    }
}
