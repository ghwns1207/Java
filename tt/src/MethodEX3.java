
public class MethodEX3 {

	/*
	public class Main{
	   public static int sum( 전누적합, 현재대상값) {
	      if( 미래대상값 종료값 ) return 전누적합(최종 당누적합);
	      
	      return sum( 전누적합+현재대상값, 현재대상값 + 1 );     
	   }
	   
	   public static void main(String[] args) {
	      System.out.println(  sum( 전누적합, 당대상값 )  );
	   }
	}
	*/

	
	public static int sum( int n) {
		if( n <= 0) return 0;
			
		
		return sum(n - 1) + n;
	}
	
	public static void main(String[] args) {
			
		System.out.println(sum(10));
	}
}
