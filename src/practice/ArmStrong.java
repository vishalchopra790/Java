package practice;

public class ArmStrong {
    public static void main(String[] args) {
        isArmStrong(153);
    }

    public static void  isArmStrong(int num){
        int cube=0;
        int r;
        int t;
        t=num;
        while(num!=0){
            r=num%10;
            num=num/10;
            cube=cube+(r*r*r);

        }
        if(t==cube)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
