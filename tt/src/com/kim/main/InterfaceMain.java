package com.kim.main;

//문법적으로 객체 생성 불가 ,개념적으로 구현  
abstract class Dog{						// 추상클래스 선언 :abstract 지정자를 붙여 선언하며 서브 클래스의 객체 생성을 위한
	void swingTail() {					// 기본적이고 공톡적인 틀만 제공되어 일체의 객체 생성이 금지됨. 추상메서드를 하나라도 포함하는 클래스는
		System.out.println("살랑 살랑 ");	// 추상 클래스로 선언해야함. abstract지정자를 통해 갹체 생성만을 금지하는 경우 반드시 추상 메서드가 
	}									// 포함되어야 하는 것은 아님. 즉 , 추상메서드가 포함된 경우 그 클래스는 반드시 추상클래스로 선언해야 하나 
										// 반대로 추상 클래스로 지정했다 해서 반드시 추상 메서드가 포함되어야 하는 것은 아님 
	
	abstract void bark();		// 추상메서드 선언 : 형식은 메서드의 기본 형식에 :abstract 지정자를 붙이고 본체 불럭을 제외하되
								// 끝에 반드시 세미콜론을 붙여야 하며 인수가 있는 경우 타입과 형식 인수명을 반드시 밝혀야함 , 추상메서드는 반드시 서브 클래스에 재저의 해야함
}	

class Jindo extends Dog{				// 추상 메서드에 대한 서브 클래스의 필수 재정의 형식은 abstract지정자를 제회한 추상 메서드의 형식과 일치하면서 본체를 포함
										// 단 형식인수의 변수명은 달라도 무관 오버라이딩 단축키 클래스명 커서를 위치시키고 컨트롤 + 1
	@Override
	void bark() {
		System.out.println("멍 멍 ");
		
	}

}

class Chihuahua extends Dog{

	@Override
	void bark() {
		System.out.println("으르르르");
		
	}
	
}

public class InterfaceMain {

	public static void main(String[] args) {
		Jindo jindo = new Jindo();
		Chihuahua chihuahua = new Chihuahua();
		
		jindo.bark();
		chihuahua.bark();
		jindo.swingTail();
		System.out.println();
		
		dogCafe(jindo);
		dogCafe(chihuahua);
		
	}
	
	static void dogCafe(Dog dog) {				// 슈퍼타입의 변수로 서브타입 객체를 대입 받아 슈퍼타입 변수의 메서드를 호출함에도 
		dog.bark();								// 동적 바인딩에 의한 실 객체의 메서드가 정상적으로 호출됨을 확인 가능. 이와 같이 추상 클래스
	}											// 목적은 공통적인 요소를 묶어 확장된 파생타입의 객체 생성을 통한 다형성 확보

}
