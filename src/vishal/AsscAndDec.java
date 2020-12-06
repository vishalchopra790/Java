package vishal;

public class AsscAndDec {
    public static void main(String[] args) {
        int [] a;
        a = new int[]{2, 1, 4, 6, 3, 7, 4};
        int temp=0;
        for (int i=0;i<7;i++){
            for (int j=i+1;j<7;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
                    }
        for(int i=0;i<7;i++){
            System.out.println(a[i]);
        }
    }
}
