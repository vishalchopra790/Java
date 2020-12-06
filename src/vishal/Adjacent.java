package vishal;

public class Adjacent {
    public static void main(String[] args) {
        int a[]={2,45,4,55,3,34,23,2,34,56,12};
        int diff=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]-a[i+1]>diff){
                diff=a[i]-a[i+1];
            }
        }
        System.out.println(diff);
    }
}
