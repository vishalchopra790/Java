
public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 5;
		a[0][2] = 8;
		a[1][0] = 4;
		a[1][1] = 9;
		a[1][2] = 3;
		int min = a[0][0];
		int mincol = 0;
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					mincol = j;

				}
			}

		}
		int k = 0;
		int max =a[0][mincol];
		while (k<2) {
			if (a[k][mincol] > max) {
				max = a[k][mincol];
			}
			k++;
		}System.out.println(max);

	}

}
