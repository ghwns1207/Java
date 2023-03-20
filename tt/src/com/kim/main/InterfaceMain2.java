package com.kim.main;

/*
 *  인터페이스의 활용과 목적
 *  인터페이스 또한 추상클래스와 마찬가지로 타입 확장을 통해 슈퍼타입 인터페이스 변수에 대한 서브 구현 객체의 메서드 호출 가능 . 즉,
 *  슈퍼타입 인터페이스 변수로 서브 타입 객체를 가리킨 경우, 생성된 객체의 구현된 메서드를 호출하는 동적 바인딩이 진행됨에 따라 임의의 
 *  객체 생성시 인터페이스를 다중 상속 받는 경우 각각의 인터페이스 슈퍼타입으로 구현된 메서드를 호출함으로써 인테페이스 타입에 따른 
 *  객체의 맴버 상요을 통한 및 선변가능 , 또한 개별 객체에 대한 공통적인 기능에 대하여 그 세부적 내용만 차이가 있는 경우 인터페이스를 통해
 *  다수의 서브 클래스에 상이한 내용만 구혐함으로써 각각의 객체를 공통 인터페이스 슈퍼타입 변수로 받아 개별 객체의 상이한 메서드 내용을 
 *  자동 선별이 가능케 함으로써 다형성 확보, 격국 인터페이스의 목적은 세부적인 면에서 객체의 기능 통합을 통한 선별 사용과 다형성 확보로 구현되며 	
 *  큰 틀에서는 타입의 확장을 통한 객체의 부품화 및 게한적 다중상속의 실현 
 * */

interface Animal{							
	void eat();								
	void sleep();							
}										
		
abstract class Dog1{					//슈퍼
	void swingTail() {
		System.out.println("살랑살랑");
	}
	
	abstract void bark();
}
											
											
											
//서브 
class Chihuahua1 extends Dog1 implements Animal{ 		// 클래스와 인터페이스로 부터 동시 상속 받는 경우 형식	
														// 서브클래스 extends 슈퍼클래스 implements 인터페이스 1, 인테페에스2 .... 
	@Override											// 자바에서는 다중상속이 지원되지 않음. 즉 , 슈퍼클래스는 하나만 존재 가능 하지만 인터페이스는 다중
	public void eat() {									// 다중 상속이 가능하며 또한 인터페이스 끼리도 상속이 가능, 단 인테페이스 끼리의 상속은 구현이 아니므로 
														// extends 사용
		// TODO Auto-generated method stub
		System.out.println("우걱우걱");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("쿨쿨");
	}

	@Override
	void bark() {
		// TODO Auto-generated method stub
		
		System.out.println("왈왈");
		
	}
	
}

public class InterfaceMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chihuahua1 happy = new Chihuahua1();
		
		happy.eat();
		happy.sleep();
		
		System.out.println();
		
		Animal aniaml = new Chihuahua1();	// 인터페이스는 구현을 가지지 않음으로 객체를 생성할 수는 없지만 인터페이스 슈퍼타입의 변수
		aniaml.eat();						// 선언이 가능하며 이를 통해 서브 타입의 구현 객체를 받아 동적 바인딩에 의한 구현 객체의 메서드 호출가능 
		aniaml.sleep();
		((Chihuahua1)aniaml).bark();      	// 인터페이스 타입의 animal 변수로 구현된 서브 객체 치와와 가리켰으므로 상속 규칙에 의해 잇 잠 메서드는 직접 호출 가능
											// 도그 클래스로 부터 상속 및 재정의된 추상 메서드를 호출하기 위해 이와 같이 치와촤 타입으로 하향 캐스팅을 통해 메서드 호출 가능 
	}										// 이는 슈퍼타입 변수로 서브 타입 객체를 가리켰을 때 서브의 재정의된 메서드는 직접 호출 가능하지만 추가 메서드는 하향 캐스팅을 통해 호츌이 가능 

}
