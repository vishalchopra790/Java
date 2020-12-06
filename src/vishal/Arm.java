package vishal;

public class Arm {
    public static void main(String[] args) {
        System.out.println(isArmStrong(5));
    }
    public static Integer isArmStrong(int num){
        if(num<=1)
            return 1;
        return num*isArmStrong(num-1);





    }
}
