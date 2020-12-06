package practice2;

public class Adjacent {
    public static void main(String[] args) {
        int a[]={12,34,12,12,23,45,32,56,24,35,56};
        int diff=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]>diff){
                diff=a[i+1]-a[i];
            }
        }
        System.out.println(diff);
    }
}
