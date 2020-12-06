package practice2;

import java.util.ArrayList;

public class MatchArray {
    public static void main(String[] args) {
        int[] a={2,4,5,3,4,3,3};
        int[] b={2,3,5,4,5,6,3};
        ArrayList<Integer> ab=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                ab.add(a[i]);
            }
        }
        Object[] c=ab.toArray();
        for(Object obj:c){
            System.out.println(obj);
        }
    }
}
