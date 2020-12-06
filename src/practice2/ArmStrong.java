package practice2;

public class ArmStrong {
    public static void  isArmStrong(int num){

        int r=0;
        int cube=0;
        int t;
        t=num;
        while(num!=0){
            r=num%10;
            num=num/10;
            cube=cube+(r*r*r);

        }
        if(t==cube){
            System.out.println("ArmStrong");
        }else{
            System.out.println("not");
        }


    }

    public static void main(String[] args) {
        isArmStrong(153);
    }
}
