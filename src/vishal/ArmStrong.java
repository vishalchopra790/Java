package vishal;

public class ArmStrong {

    public static void main(String[] args) {
      isArmStrong(370);
    }
        public static void isArmStrong (int num ) {
            int r;
            int cube = 0;
            int t;
            t=num;

            while(num>0){
                 r=num%10;
                 num=num/10;
                 cube=cube+(r*r*r);
            }
            if(t==cube){
                System.out.println("The number is Armstrong");
            }else
                System.out.println("NOt Armstrong");
        }
    }
