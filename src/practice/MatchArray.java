package practice;

import java.util.ArrayList;

public class MatchArray {
    public static void main(String[] args) {
        int [] a={2,4,6,5,4,3};
        int [] b={3,4,5,6,4,3};
        ArrayList<Integer> ab=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                ab.add(a[i]);
            }
        } //Object[] ob=ab.toArray();
        for(Integer c:ab){
            System.out.println(c);
        }
    }
}
