package vishal;

public class CharOccur {
    public static void main(String[] args) {
        int s=countChar("aaahhdjdkdk",'a');
        System.out.println(s);
    }

    private static int countChar(String str, char c) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
                return count;
    }
}
