package vishal;

public class FAbSeries {
    public static void main(String[] args) {


    int a=0;
    int b=1;
    int sum=0;
    int i=1;
    while(i<12){
      sum=a+b;
        System.out.println(sum);
        a=b;
        b=sum;
        i++;
        //
    }
}
}