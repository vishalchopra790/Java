package practice2;

public class fact {

    public static void main(String[] args) {

        System.out.println(isFactorial(5));
    }

    private static int isFactorial(int i) {
        if(i<=1)
            return 1;
        return i*isFactorial(i-1);

    }
}
