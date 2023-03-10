
public class RecallMethod {   // 호츌 이전 코드와 이후 코드를 구분 해야됨 
	
	static void output(int n) {
		if(n <= 0) {       			//재귀함수 탈출 코드. 
			System.out.println();
			return;					// 함수를 탈출하고 자신을 호출 했던 위치로 돌아감. 
		}
		
		System.out.println("재귀호출 직전까지의 코드는 호출 순서대로 출력" + n);
		
		output(n - 1);				// 당행의 재귀호출 시점까지의 모든 코드 실행은 최종 재귀호출 탈출 지점까지 호출 순서대로 진행됨을 확인
									// 단, 호출 완료후 원 호출시점으로 복귀 순서는 최종 재귀호풀 탈출 코드를 통해 역순으로 진행됨 따라 14행
									// 처럼 당행의 재귀호출 완료 후의 코드 실행은 호출 순서의 역순으로 진행됨 
		
		System.out.println("재귀호출 직전까지의 코드는 호출 역순으로 출력" + n);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		output(3);
		
	}

}
