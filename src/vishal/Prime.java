package vishal;

public class Prime {
     public static Boolean isPrime(Integer num ){
         if(num<=1)
             return false;
         for(int i=2;i<num/2;i++){
             if(num%i==0){
                 return false;
             }
         }return true;
     }
     public static void getPrime(int n){
     for(int i=0;i<n;i++){
         if(isPrime(i))
             System.out.println(i);
     }
     }


    public static void main(String[] args) {
        System.out.println(isPrime(3));
        getPrime(40);
    }  }