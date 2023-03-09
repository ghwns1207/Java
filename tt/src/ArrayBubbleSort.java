
public class ArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 19, 2, 16, 25, 66 };
		int cnt = 0;
		
		end:
		for (int i = 0, tmp; i < ar.length - 1; i++) {

			for (int j = 0; j < ar.length - 1 - i; j++) {
				if (ar[j] > ar[j + 1]) {
					tmp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = tmp;
					cnt++;
				}
				if(cnt == 0) break end;
			}
			
		}

		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + cnt);
	}
}
