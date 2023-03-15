class Stb{
	static int ar[] = new int[5];
	
	static {									// 정적 초기화 블럭 : static{블럭}
		for(int i = 0 ; i < ar.length ; i++) {	// 정적 초기화 블럭은 정적 필드만 초기화가 가능하며
			ar[i] = i +1;						// 클래스의 정적 필드 선언시 초기화와 마찬가지로 
		}										// 최초 클래스 사용시에만 호출됨
	}
}
public class StaticMain1 {

	public static void main(String[] args) {
		for(int i = 0 ; i < Stb.ar.length; i++) {
			System.out.printf("%d" ,Stb.ar[i]); // 클래스를 통한 배열 접근 
		}
		
		System.out.println();
		Stb.ar[0] = 10;
		
		Stb name = new Stb();					// 정적 초기화 블럭은 최초 클래스 사용 시에만 호출 값이 변경후 
												// 객체를 생성함에도 재 호출 안됨 , 값은 변경 후 값으로 출력 
		for(int i = 0 ; i < Stb.ar.length; i++) {
			System.out.printf("%d" ,Stb.ar[i]);
		}
	}

}
