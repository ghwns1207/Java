enum Star{					// 열거형은 내부적으로 클래스이며 기본적으로 별도의 값을 가지지 않는 그 자체를 값으로 사용하는 열거상수들로 구
							// 그 열거 상수는 해당 열거 타입 (Star)의 정적(static) 상수 필드와 같이 인식. 또한 열거형도 하나의 타입을 인정되어
							// 변수선언이 가능하며 열거타입 변수에는 해당 열거 타입에 나열된 열거상수들만 대입가능
	TERRAN, ZERG, PROTOSS
	
}
public class EnumMain {

	public static void main(String[] args) {
//		System.out.println(TERRAN);			// 열거형은 클래스에 기반하므로 열거 상수 직접 호출 불가 
			
		System.out.println(Star.TERRAN);	// 열거형은 내부적으로 클래스이고 열거 상수 또한 정적 상수 형태이므로
		System.out.println();				// 객체를 생성할 필요없이 클래스를 통한 접근 가능한 클래스의 정적 벰버와 동일한 접근 형태
		
		Star species = Star.ZERG;			// 열거형에 정의된 열거 상수만을 대입 받을 수 있는 열거 변수 
		System.out.println(species);
		System.out.println();
		
//		int i = Star.PROTOSS;				// 열거형은 참조형이므로 수치형과 호환 불가 . 따라서 캐스팅도 불가 
//		species = 3;
		
		System.out.println(Star.values()[0]);	// values() : 열거형의 정적 메서드로써 열거형에 정의된 열거 상수를 순서대로 배열 형태로
		System.out.println();					// 리턴하되 values()메서드의 리턴 값은 배열의 최초 주소 값 리턴 결과적으로 배열의 사용과
												// 동일한 형태 "ar[0] = values()[0] 따라서 for문에도 일반 배열과 동일한 형태로 적용가능
				
		for(int i = 0 ; i < Star.values().length ; i++) 
			System.out.println(Star.values()[i]);
		System.out.println();
		
		for(Star i : Star.values())		
			System.out.println(i);
		System.out.println();
		
		species = Star.valueOf("PROTOSS");		// valueOf("문자열") : 열거형의 정적 메서드로써 문자열을 인수로 입력 받아 대응되는 열거 상수 값을 리턴
		System.out.println(species);			// 사용자로 부터 입력받은 문자열을 인수로 대응시켜 합법적인 입력 여부를 검증하기 위한 용도로 사용가능 
	}

}
