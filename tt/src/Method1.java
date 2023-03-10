

class Method1 {

	static int calcSum(int from , int to ) {	// return 사용 안하면 void  retrun 타입이 static 다음에 나오는 타입 싱인수 와 매개변수 갯수 똑같아야됨 
												// 메서드의 형식 : 리턴타입 메서드명(형식 인수 (타입, 매개변수)){ 메서드 본체 }
 		int sum = 0;							// 메서드를 통해 중복된 코드를 통합하여 코드를 정리하고 사용을 단순화
		
		for(int i = from; i <= to ; i++) {
			sum += i;
		}
		return sum;								// 리턴타입이 지정된 경우 반드시 return을 통해 값 반환, 리턴은 메서드의 종료를 의미 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1 ~ 10 = " + calcSum(1, 10));
		System.out.println("15 ~ 100 = " + calcSum(15, 100));
		
	}

}
