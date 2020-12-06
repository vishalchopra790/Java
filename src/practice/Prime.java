package practice;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        primeNumbers(20);
    }

    private  static Boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i=2;i<num/2;i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void primeNumbers(int n){
        for(int i=0;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
