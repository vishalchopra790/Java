package practice;

import java.util.Scanner;

public class prim {
    public static void main(String[] args) {

        String prime="";
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        for(int i=0;i<=c;i++){
            int counter=0;
            for(int num=i;num>=1;num--){
                if(i%num==0){
                    counter=counter+1;
                }
            }
            if(counter==2){
                prime=prime + i+ " ";
            }
        }
        System.out.println(prime);
    }
}
