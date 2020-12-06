package practice;

import java.util.Arrays;

public class printt {
    public static void main(String[] args) {
       String prime="";

       for(int i=0;i<=50;i++){
           int counter=0;
           for (int j=i;j>=1;j--){
               if(i%j==0)
                   counter=counter+1;
           }

           if(counter==2)
               prime=prime+i+" ";
       }
        System.out.println(prime);

    }
}
