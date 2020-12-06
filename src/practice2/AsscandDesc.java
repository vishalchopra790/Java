package practice2;

public class AsscandDesc {
    public static void main(String[] args) {
        int[] a={3,4,5,6,3,6,5,3,5,5,5};
        int temp;
        for(int i=0;i<=a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int b:a){
            System.out.println(b);
        }
    }
}
