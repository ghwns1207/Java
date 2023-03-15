class Storage {
	int ar[];
	static int count;

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
		boolean check = true;
		System.out.print("\n\n삭제 대상 : ");

		forEachAr(a);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] == a[i]) {
					ar[j] = 0;
					count--;
					check = false;
					break;
				}
			}
		}

		for (int i = 0, t; i < count; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == 0) {
					t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}

		if (check)
			System.out.print("\n삭제하려는 데이터가 존재하지 않습니다.");

		System.out.printf("\n남은 공간은 %s 입니다.\n", ar.length - count);

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

	}

}
