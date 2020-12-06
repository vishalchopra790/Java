package lambdaDemos.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String ename;
    int salary;

    Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Vishal", 50000));
        empList.add(new Employee("Sahil", 30000));
        empList.add(new Employee("Alka", 20000));

        Function<Employee, Integer> fu = e -> {
            int sal = e.salary;
            if (sal >= 10000 && sal <= 20000)
                return (sal * 10 / 100);
            else if (sal >= 20000 && sal <= 30000)
                return (sal * 15 / 100);
            else if (sal >= 30000 && sal <= 50000)
                return (sal * 20 / 100);
            else
                return (sal * 25 / 100);


        };
        Predicate<Integer> pr=b->b>5000;
        for (Employee ef:empList){
            Integer bonus=fu.apply(ef);
            if (pr.test(bonus)){
            System.out.println(ef.ename);
            System.out.println(bonus);
        }
    }


    //Function<Integer, Integer> fu=
}}
