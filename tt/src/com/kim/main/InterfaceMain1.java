package com.kim.main;

interface Animal1{							
	void eat();								
	void sleep();							// 포함가능하되 퍼블릭, 정적 , 파이널 상수 public static final 필드이어야 하며 생략해도 디폴트로 설정됨
}											// 일반적으로 인터페이스의 상수 필드는 객체 생성을 위한 구현 클래스에서 규약된 공톤적인 값으로 활요 . 메서드의 
											// 집합만을 모아 추상적 기능만 통합하여 정의하고자 할 때 인터페이스가 활용되며 이를 통한 객체의 부품화 실현 
											// interface 지정자를 통한 내부 메서드들은 abstract지정자를 생략해도 디폴트로 성정되며 또한 외부에서
											// 무조건 호출이 가능해야 재정의가 가능하므로 퍼블릭 깁노 적용됨. 따라서 인터페이스 내부 메서드는 두 지정자를 생략해도
											// 항상 디폴트로 abstract public이 기본 적용됨. 추상클래스와 마찬가지로 객체 생성이 금지됨 서브클래스에서 재정의 해야됨

class Cow1 implements Animal1{		// 구현 클래스 정의 - 서브클래스명 implements 인터페이스 명 

	@Override
	public void eat() {						// 인터페이스로 부터 상속된 구현 메서드는 반드시 버블릭이어야 하며 재정의 되어야함
		// TODO Auto-generated method stub	// 상속 받은 메서드의 엑세스 지정자는 퍼블릭임!! 엑서스 지정자는 확장은 가능하지만 축소 물가능 
		System.out.println("우걱우걱");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("쿨쿨");
	}
	
}

public class InterfaceMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cow1 so = new Cow1();
		
		so.eat();
		so.sleep();
	}

}
