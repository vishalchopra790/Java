package practice2;

public class Large {
    public static void main(String[] args) {
        int[][] a = {{2,4,5},{5,3,2},{45,5,3},{2,0,8}};
        int largest = a[0][0];
        int smallest = a[0][0];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {
                if (a[i][j] > largest){
                    largest = a[i][j];}
                else if (a[i][j] < smallest){
                    smallest = a[i][j];}
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }

}
