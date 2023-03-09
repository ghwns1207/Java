
public class ArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 19, 2, 16, 25, 66 };
		int cnt = 0;
		boolean sw;      
			
		end:
		for (int i = 0, tmp; i < ar.length - 1; i++) {
			sw = true;
			for (int j = 0; j < ar.length - 1 - i; j++) {
				if (ar[j] > ar[j + 1]) {
					tmp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = tmp;
//					cnt++;
					sw = false;
				
				}
//				if(cnt == 0) break end;
				cnt++;
			}
			if(sw) break;
			
		}

		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + cnt);
	}
}
