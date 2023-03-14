class Car8{    
	// 필드 초기화 -> 초기화 블럭 -> 생성자 초기화 
	String name;
	String color;
	boolean gasol;
	boolean sunroof;
	
	Car8(String name, String color){
		this.name = name;
		this.color = color;
	}
	Car8(boolean gasol, boolean sunroof){
		this.gasol = gasol;
		this.sunroof = sunroof;
	}
	Car8(String name, String color,boolean gasol, boolean sunroof) {
		
		this(name, color);			// this 생성자 호출문은 생성자의 정의 순서에 관계 없이 호출 가능
//		this(gasol, sunroof);		// this 생성자 호출문은 문법상 선두에 와야하므로 
		this.gasol = gasol;			// 중첩 정의 시 두번쟤 호출문부터 에러 처리됨 
		this.sunroof = sunroof;
		
	}
	Car8(){ }    //디폴트 생성자
	
}
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car8 name1 = new Car8("프라이드" , "파랑" , true , false);
		Car8 name2 = new Car8("포터" , "노랑");
		Car8 name3 = new Car8(true , false);
		Car8 name4 = new Car8();	
		
		// 인수 없는 생성문, 클래스의 생성자가 하나도 정의되지 않는 경우 
		// 디폴트 생성자가 자동 생성 되며, 그런 경우만 디폴트 생성문 호출 가능 
		// 하나 이상잉 생성자가 정의된 경우 별도로 디폴트 생성자 정의 해야함 
	}

}
