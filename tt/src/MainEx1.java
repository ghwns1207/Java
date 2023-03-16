class Storage {
	int ar[];
	int count;

	Storage(int size) {
		ar = new int[size];
	}

	private void forEachAr(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	void store(int... a) {
		System.out.print("\n\n저장 대상 : ");

		forEachAr(a);

		if (a.length <= ar.length && a.length <= ar.length - count) {
			for (int i = 0; i < a.length; i++, count++) {
				ar[count] = a[i];
			}

			if (count == ar.length)
				System.out.print("\n저장공간 가득참 - 입력 금지");
		} else
			System.out.print("\n지정 불가 : 입력 인수가 저장공간 보다 크거나 남은 공간이 부족합니다.");

		System.out.printf("\n남은 공간은 %s 입니다.\n", ar.length - count);

		forEachAr(ar);

	}

	void drop(int... a) {

		int del = 0;
		del = 0;
		System.out.print("\n\n삭제 대상 : ");

		forEachAr(a);


		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] == a[i]) {
					ar[j] = 0;
					for(int idx = j, t; idx < j + (count - j - 1) ; idx++) {
						t = ar[idx];
						ar[idx] = ar[idx+1];
						ar[idx +1] = t;
					}
					del++;
					count--;
					break;
				}
			}
		}

		if (del == 0)
			System.out.print("\n삭제하려는 데이터가 존재하지 않습니다.\n");
		else
			System.out.printf("\n자료가 %d개 삭제되었습니다, ", del);

		System.out.printf("남은 공간은 %s 입니다.\n", ar.length - count);

		forEachAr(ar);

	}

}

public class MainEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage first = new Storage(10);

		first.drop(5, 1);
		first.store(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		first.store(9, 7);
		first.store(2, 2, 9);
		first.drop(2, 9);
		first.store(3, 5, 5, 9);
		first.store(8, 9, 4);
		first.store(1, 2, 3, 4);
		first.store(5, 1);
		first.store(1);
		first.drop(1);
		first.drop(5, 6);
		first.drop(3, 4);
		first.drop(3, 4, 6);
		first.drop(5, 8);
		first.store(1,2,3,4,5,6,7,8,9,10);
		first.drop(10);

	}

}
