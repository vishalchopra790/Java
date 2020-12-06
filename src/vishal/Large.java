package vishal;

public class Large {
    public static void main(String[] args) {
        int[][] a={{1,3,4},{2,0,5},{5,4,6}};
        int largest=a[0][0];
        int smallest=a[0][0];
         for (int i=0;i<3;i++) {
             for (int j = 0; j<3; j++) {
                 if (largest < a[i][j]) {
                     largest = a[i][j];
                 } else if (smallest > a[i][j]) {
                     smallest = a[i][j];
                 }
             }
         }
        System.out.println("The largest number is "+largest);
        System.out.println(smallest);

    }
}
