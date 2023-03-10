import java.util.Scanner;

class MethodeEX2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numOfTwo_Sum();
		
	}
	
	static void numOfTwo_Sum() {
		Scanner sc = new Scanner(System.in);
		
		int sum; 
		int a,b;
		int min, max;
		
		System.out.println("<두 자연수 사이의 합 (0포함) > - 두 수종 하나가 음수이면 종료.");
		for(;;) {
			sum = 0;
			System.out.print("첫 번째 수 입력 : ");
			a= sc.nextInt();
			System.out.print("두 번째 수 입력 : ");
			b= sc.nextInt();
			
			if(a < 0 || b < 0) {
				System.out.println("연산 종료.");
				sc.close();
				return;
			}else if (a > b) {
				max = a;
				min = b;
			}else {
				max = b; 
				min = a;
			}
			
			for(int i = min ; i < max ; i++) {
				sum += i ;
			}
			
			System.out.printf( "%d 와 %d 사이의 합은 %d다.\n" , min, max, sum );
			
		}
	}

}
