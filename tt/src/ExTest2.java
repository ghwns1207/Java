public class ExTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[][][] = new int[3][][];
		int a[] = { 5, 8, 10 };
			
 		for (int i = 0; i < ar.length; i++) {
			ar[i] = new int[a[i]][20];

		}
		
		int cnt = 1; // ar[1] = {00000}
		int a1 = 0;
		int class1 =0;

		for (int i = 0; i < ar.length; i++) { // 3 회전 int[a[i]][20];  ar[1]  int[a[i]][20];ar[2] int[a[i]][20]; ar[3] int[a[i]][20];
				a1++;
			for (int j = 0; j < ar[i].length; j++) {	//  ar[1] = { 0. 0. 0. 0. 0.} ar[2}= { 0.0 .0 .0 .0. 0. 0. 0.} //5회전 . 8회전 , 10 회전 
				class1++;
				for (int j2 = 0; j2 < ar[i][j].length; j2++) { // 20 회전 
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
		System.out.printf("\n< 학급 : 총%d학년 , 반 : 총 %d반 , 학생수: %d먕>" , a1 , class1 , cnt -1);
		
	}

}
