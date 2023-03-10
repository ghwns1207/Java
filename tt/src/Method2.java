
 class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSum(1 , 10);
		printSum(15 , 100);
		
		
	}
	
	static void printSum(int from , int to) {  //반환 값이 필요 없는 경우 타입 대신 void로 선언 
		int sum = 0;
		for(int i = from ; i <= to ; i++ ) {
			sum += i ;
		}
		System.out.println(from + "~" + to  +" = " + sum);
	}
	

}
