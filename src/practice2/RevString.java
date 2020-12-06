package practice2;

public class RevString {
    public static void main(String[] args) {
        int count =charCount("aaaaabbacagggggggaaass",'a');
        System.out.println(count);
        }

    private static int charCount(String word, char c) {
        int count=0;
        for(int i=0;i<word.length();i++){
        if(word.charAt(i)==c){
            count++;
        }}
        return count;
    }
}

