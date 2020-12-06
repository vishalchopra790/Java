package practice;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int a[]={4,5,23,5,63,45,4,54,5,4,5,5,3,3,3,5,5,5,3,2,2,2,12};
        int largest=a[0];
        int smallest=a[0];

        for(int i=0;i<a.length;i++){
            //for(int j=i+1;j<a.length;j++){
                if(a[i]>largest)
                    largest=a[i];
                else if(a[i]<smallest)
                    smallest=a[i];
            //}
        }
        System.out.println("largest"+largest);
        System.out.println("smallest"+smallest);
    }
}
