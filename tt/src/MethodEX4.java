import java.util.Scanner;

public class MethodEX4 {
	//호출 순서
	
	static int sum(int t ,int min , int max) {
//		if(min > max) return s;
//		
//		System.out.printf("%d %s ",min , min < max ? "+" : '\n');				
//		return sum((s + min) , min +1, max);
		
		if(min > max) return 0;
		
		t = sum( t, min, max - 1);
		
		System.out.printf("%d %s ", max , min  >  max   ? '\n' : "+");
		t += max;
		
		return t ;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		int min,max , tot = 0;
		System.out.print("정수 1 :");
		a = sc.nextInt();
		
		System.out.print("정수 2 :");
		b = sc.nextInt();
		
		sc.close();
		
		if(a > b) {
			max = a;
			min = b;
		}else {
			min = a;
			max = b;
		}
		
		for(int i = min ; i <= max ; i++) {
			 tot += i ;
		}
		
		System.out.printf( "<루프 이용 검증>%d부터 %d까지의 합은 : %d\n\n" , min, max, tot );
		
		System.out.printf("\n\n< 재귀 호출을 이용한 누적합> %d 부터 %d까지의 합은 : %d" ,min, max , sum(0, min , max));
	}

}
