import java.util.ArrayList;
import java.util.Collections;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 4, 5, 4, 3, 5, 2, 3, 9, 2, 10 };
		// Empty ArrayList
		// We wil add unique value in arraylist
		// We need to count duplicate same values
		ArrayList<Integer> ab = new ArrayList<Integer>();
		ArrayList<Integer> ac = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			int max = a[i];
			if (!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}

				}
				// System.out.println(a[i] +" "+ k);
				if (k == 1) {
					// System.out.println("the unique number is "+a[i]);
					ac.add(a[i]);
                    
				}
			}
		} System.out.println(Collections.min(ac));

	}

}
