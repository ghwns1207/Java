import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 100, max = 0;
		int tot = 0;
		int Num, minNum = 0, maxNum = 0;
		int ar[];
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 :");
		Num = sc.nextInt();
		ar = new int[Num];
		
		for(int i = 0 ; i < Num ; i++) {
			System.out.printf("%d번째 학생 점수 :" , i+1);
			ar[i] = sc.nextInt();
		}
		
		for(int i = 0; i < Num; i++) {
			if(i == 0) {
				System.out.printf("\n%d번쨰 학생 점수 : %d," ,i+1 ,ar[i]  );
			}else if(i < Num -1) {
				System.out.printf(" %d번쨰 학생 점수 : %d," ,i+1 ,ar[i]  );				
			}else {
				System.out.printf(" %d번쨰 학생 점수 : %d\n" , i+1, ar[i]  );			
			}
			if(ar[i] > max) {
				max = ar[i];
				maxNum = i+1;
			}
			if(ar[i] < min) {
				min = ar[i];
				minNum = i+1;
			}
			tot += ar[i];
		}
		System.out.printf("\n전체 학생 점수 중 가장 높은 점수는 %d번째 학생의 %d점이다.", maxNum , max);
		System.out.printf("\n전체 학생 점수 중 가장 낮은 점수는 %d번째 학생의 %d점이다.", minNum , min);
		System.out.printf("\n전체 학생 점수 총계 : %d" , tot);
		
	}

}
