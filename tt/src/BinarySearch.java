import java.util.Scanner;

public class BinarySearch {

	static int search(int a, int[] selectionSort, int Lx, int Hx) {
		int arLength = (Lx + Hx) / 2;
		//쌤버전
		if(Lx > Hx) return -1;
		
		if(a == selectionSort[arLength]) return arLength + 1;
		else if(a < selectionSort[arLength] ) Hx = arLength - 1;
		else Lx = arLength + 1;

		// 내버전
//		if(Lx > Hx) {
//			return -1;
//		}else if (a < selectionSort[arLength]) {
//			Hx = arLength - 1;
//		}else{
//			Lx = arLength + 1;
//		}
//			
//		if(a == selectionSort[arLength]) {
//			return arLength + 1;
//		}
		
		return search(a, selectionSort, Lx, Hx);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]selectionSort = { 33,11,77,66,55,100,22,88,44,99 };
		
		Scanner sc = new Scanner(System.in);
		
	    for(int j=0,t; j < selectionSort.length-1; j++) {
	         for(int p = j+1; p<selectionSort.length; p++) {
	            if(selectionSort[j] > selectionSort[p]) {
	               t = selectionSort[j];
	               selectionSort[j] = selectionSort[p];
	               selectionSort[p] = t;
	            }
	         }
	    }
		
		System.out.print("검색 값 입력 : ");
		int  a = sc.nextInt();
		sc.close();
		int t = search(a , selectionSort , 0 , selectionSort.length - 1);
		if(t > 0) {
			System.out.printf( "\n검색 값 %d는(은) selectionSort배열 %d 번째 위치에 존재합니다." , a , t);
		}else {
			 System.out.println("\n찾으려는 값이 존재하지 않습니다.");
		}
		
	}

}
