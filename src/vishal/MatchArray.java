package vishal;

import java.util.ArrayList;

public class MatchArray {
    public static void main(String[] args) {
        int[] a={2,4,5,8,3,2,3,7};
        int[] b ={2,5,5,2,3,8,2,7};
        ArrayList<Integer> ab=new ArrayList<>();
        for(int i =0;i<a.length;i++){
            if(a[i]==b[i]){
                ab.add(a[i]);
            }
        }
        Object[] obj=ab.toArray();
        for(Object c:obj){
            System.out.println(c);
        }


    }
}
