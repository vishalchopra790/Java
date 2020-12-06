package practice;

public class ReverseNum {
    public static void main(String[] args) {
        reverse(363);    }

    private static void reverse(int i) {
        int rev=0;
       int  temp=i;

        while(i!=0){
            int digit=i%10;
            rev=digit+rev*10;
            i=i/10;
        }
        if(temp==rev)
            System.out.println("palindrome");
        else
            System.out.println("non palindrome");
    }

}
