
public class MethodEX3 {
	
	public static int sum(int s, int n) {
		if( n >= 11) return s;
			
		
		return sum(s + n , n+1);
	}
	
	public static void main(String[] args) {
			
		System.out.println(sum(0 ,1));
	}
}
