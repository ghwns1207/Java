public class ExTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[][][] = new int[3][][];
		int a[] = { 5, 8, 10 };

		for (int i = 0; i < ar.length; i++) {
			ar[i] = new int[a[i]][20];

		}

		int cnt = 1;

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				for (int j2 = 0; j2 < ar[i][j].length; j2++) {
					ar[i][j][j2] = cnt;
					cnt++;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.printf(" < %d학년 >\n", 3 - i);
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%d반 : ", j+1);
				for (int j2 = 0; j2 < ar[i][j].length; j2++) {
					System.out.printf(" %d 번", ar[i][j][j2]);
				}
				System.out.println();
			}

		}
	}

}
