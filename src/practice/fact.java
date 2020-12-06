package practice;

public class fact {
    public static void main(String[] args) {
        int c=isFact(5);
        System.out.println(c);
    }

    private static int isFact(int i) {

        if(i<=1)
            return 1;
        return i* isFact(i-1);
    }
}
