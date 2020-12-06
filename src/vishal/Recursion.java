package vishal;

public class Recursion {
    public static void main(String[] args) {
        int fact= factNumber(10);
        System.out.println(fact);
    }

    private static int factNumber(int i) {
        if(i<=1)
            return 1;
        return i *factNumber(i-1);
    }
}
