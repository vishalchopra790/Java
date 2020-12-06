package practice;

public class Assc {
    public static void main(String[] args) {
        int[] a={2,4,5,5,6,6,3,2,5,6,6,5};
        int temp;
        for (int i=0;i<12;i++){
            for(int j=i+1;j<12;j++){
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
