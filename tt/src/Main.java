import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, score ,sum;
		Scanner sc = new Scanner(System.in);

		while (true) {
			sum = 0;
			System.out.print("학생수 :");
			n = sc.nextInt();
			if (n <= 0) {
				sc.close();
				break;
			}
			System.out.println();
			for (int i = 0; i < n; i++) {
				System.out.printf("%d번째 학생점수 :", i + 1);
				score = sc.nextInt();
				if (score > 100 || score < 0) {
					i--;
					continue;
				}
				sum += score;

			}
			
			System.out.printf("\n총점 : %d", sum);
			System.out.printf("\n평균 : %d", sum / n);
			System.out.println("\n\n=================\n\n");
			
		}

		System.out.println("< 프로그램 종료 >");
	}

}
