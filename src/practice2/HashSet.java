package practice2;

import java.util.Set;

public class HashSet<S> {
    public static void main(String[] args) {
        String[] a= {"Vishal","Abhinav","Vishal","Sahil"};

        Set<String>  store =new java.util.HashSet<>();
        for(String s:a){
            int k=0;
            if(store.add(s)==true){
                k++;
                System.out.println("the duplicate"+s);
            }
        }

    }
}
