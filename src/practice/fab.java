package practice;

public class fab {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum;
        int k=1;
        while(k<12){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            k++;
        }
    }
}
