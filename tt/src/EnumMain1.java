enum Star1{
	
	TERRAN("태란"), ZERG("저그"), PROTOSS("프로토스");		//정적 객체화된 열거 상수  

	private final String speciesName; 	// 열거형의 내부 정적객체처럼 취급되는 열거상수 별 통합정보들을 담는 내부
										// 필드 선언 , 문법적으로 강제적이지는 않으나 개별 열거상수에 대한 독립적인
										// 내부 정보이므로 일번적으로 private 과 final 로 지정
	
	//TERRAN( "태란 실인수 ") -> Star1(String speciesName)
	
	Star1(String speciesName) {					// 개별 열거 상수의 내부 필드를 초기화 시키기 위한 생성자 
		this.speciesName = speciesName;			// 생성자 앞에 Star1은 이넘이 아닌 열거상수 각각을 공통으로 처리
	}


	public String getSpeciesName() {	// 개별 열거상수에 대한 내부필드 정보를 얻기 위한 메서드 선언
		return speciesName;
	}
}
public class EnumMain1 {

	public static void main(String[] args) {
		System.out.println(Star1.PROTOSS.getSpeciesName());
		System.out.println(Star1.TERRAN.getSpeciesName());
		System.out.println(Star1.ZERG.getSpeciesName());
		System.out.println();
		
		Star1 species = Star1.ZERG;						// 열거상수형객체의 참조주소를 받아오는 열거 타입의 변수 
			
		System.err.println(species.getSpeciesName());	//열서형 내 선언은 메서드는 열거형에 소속된 메서드가 아닌, 열거형의 정적
//		System.err.println(Star1.getSpeciesName());		// 객체화된 열거상수 소속이므로 열거상수를 통해서만 호출 가능점에 유이 

	}

}
