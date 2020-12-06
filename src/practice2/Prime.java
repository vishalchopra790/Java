package practice2;

public class Prime {

    public static Boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void prime(int num){
        for(int i=0;i<num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        prime(20);
    }
}
