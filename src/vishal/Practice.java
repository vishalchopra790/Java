package vishal;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
     int[] a ={2,3,2,5,5};
        System.out.println(Arrays.toString(duplicates(a)));
    }
    public static Object[] duplicates(int[] names){
      Map<Integer, Integer> mp=new HashMap<>();
      for (int i=0;i<names.length;i++){
          int temp=names[i];
          if(mp.containsKey(temp)){
              mp.put(temp,mp.get(temp)+1);
          }else{
              mp.put(temp,1);
          }
      }
      List<Integer> li=new ArrayList<>();
      for(Integer si:mp.keySet()){
          if(mp.get(si)==2){
              li.add(si);
          }
      }return li.toArray();
    }
}
