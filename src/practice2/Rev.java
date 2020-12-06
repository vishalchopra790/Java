package practice2;

public class Rev {
    public static void main(String[] args) {
        int num=753;
        int rev=0;

        while(num!=0){
            int digit=num%10;
            rev=digit+(rev*10);
            num=num/10;
        }
        System.out.println(rev);
    }
}
