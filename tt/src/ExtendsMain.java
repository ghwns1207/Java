class Super{					//슈퍼(부모) 클래스 
	
	int serialNum = 1;
	String data = "슈퍼";
	
	public Super(int serialNum ,String data) {		//부모의 초기화 메서드
		this.serialNum = serialNum;
		this.data = data;
	}
	
	public void output() {
		System.out.printf("시리얼 넘버 : %d\n" , serialNum);
		System.out.printf("데이터 : %s\n\n" , data);
		
	}
}

/*오버라이딩 (재정의) : 슈퍼 클래스에서 정의된 메서드를 서브 클래스에서 재정의함을 의미 
 * 
 * 상속 : 정의된 슈퍼클래스를 통해 더 확장된 형태의 다양한 서브 클래스를 파생시킴으로써 코드의 통합을
 * 통한 관리의 용이성 및 다양성을 통한 생산성 중대 . 상속을 받은 서브클래스는 슈퍼 클래스의 모든 맴버를 물려
 * 받으나 수퍼ㅗ의 생성자만은 예외로 서브클래스에서 별로로 직접 정의해줘햐함, 슈퍼세 초기화 싴틸 멤버가 
 * 없어 슈퍼의 생성자를 호출하지 않더라도 객체 생성시 자동으로 슈퍼의 생성자가 먼저 호출되고 이후 서브 생성자 호출 
 * */

class Sub extends Super{			//부모 클래스 상속 받은 자식 클래스 
	//확장 
	String data2 = "서브";
	
	public Sub(int serialNum ,String data , String data2 ) {
		super(serialNum, data);		//슈퍼 키워드를 사용 부모한테 초기화 위임 
		this.data2 = data2;
	}
	
	@Override						//오버라이딩  재정의 어노테이션 사용자한테 알려주기 위해 , 부모의 문법과 다르게 사용했는지 틀렸는지 확인 
	public void output() {
		super.output();				//예약어 슈퍼 사용 부모 메서드 사용 
		System.out.printf("데이터2 : %s\n" , data2);
		
	}
	
}


public class ExtendsMain {
	
	
	 public static void main(String[] args) {
		 Sub sub1 = new Sub( 1,"슈퍼슈퍼","엔진소리");
		 
		 sub1.output();
		 
	 }
}
