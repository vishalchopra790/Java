package lambdaDemos.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
      String name;
     int salary;
     int exp;

    Employee(String ename,int esalary,int eexp){
        name=ename;
        salary=esalary;
         exp=eexp;
            }
}

public class Demo2 {
    public static void main(String[] args) {
        Employee emp=new Employee("Vishal",500000,5);
        Predicate<Employee> pr=e->(e.salary >30000 && e.exp>3);
        System.out.println(pr.test(emp));

        ArrayList<Employee> ar=new ArrayList<>();
        ar.add(new Employee("Vishal",500000,5));
        ar.add(new Employee("John",5000,1));
        ar.add(new Employee("Sahil",600000,6));

        for(Employee er:ar){
            if(pr.test(er)){
                System.out.println(er.name);
            }
        }





        }

}
