class Const{
	final int NON_ST_CONST_1 = 10;		// 메서드 내의 지역 변수에 대한 final 지정과 달리 클래스 내의 
	final int NON_ST_CONST_2;			// final 상수 필드 지정은 최초 선언 시 무조건 초기화를 진행해야 하며
	final int NON_ST_CONST_3;			// 초기화 블럭이나 생성자를 통한 초기화의 경우에는 예외 적용, 비정적
	static final int ST_CONST_1 = 10;	// 필드인 경우 초기화 블럭이나 생성자를 통해서 초기화 지연이 가능하며
	static final int ST_CONST_2;		// 정적 멤버인 경우에는 정적 초기화 블럭에서만 초기화 지연 가능 
	
	Const( int NON_ST_CONST_3){
		this.NON_ST_CONST_3 = NON_ST_CONST_3;
	}
	
	{
		 NON_ST_CONST_2 = 20;			// 초기화 블럭을 통한 비정적 필드의 초기화 지연
	}		
	
	static {
		ST_CONST_2 = 40;				// 정적 초기화 블럭을 통한 정적 필드의 초기화 지연 
	}
}
public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Const name = new Const(80);
		
		System.out.println(name.NON_ST_CONST_1);
		System.out.println(name.NON_ST_CONST_2);
		System.out.println(name.NON_ST_CONST_3);
		System.out.println(Const.ST_CONST_1);
		System.out.println(Const.ST_CONST_2);		//static 정적 멤버는 클래스를 통한 접근하는게 원칙

	}

}
