package com.kim.main;

class SuperClass{
	
	public void output() {
		System.out.println("나는 슈퍼 클래스다.");
	}
	
}

public class LocalExtendsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperClass superClass = new SuperClass();
		
		superClass.output();
		
		class LocalInnerClass extends SuperClass{			//로컬 이너 클래스는 그 사용 메서드 내로 제한될 뿐 일반 클래스와 
			public void output() {							// 동일한 문법적 특성이 제공되어 상솩과 재정의 모두 가능 
				System.out.println("나는 지역 내부 클래스다.");
			}
			
		}
		
		LocalInnerClass localInnerClass = new LocalInnerClass();
		
		localInnerClass.output();							// 익명이너 클래스 : 상속을 받아 재정의된 로컬 이너 클래스의 축약형으로 
															// 상속된 재정의 메서드를 사용하고자 슈퍼 클래스로 부터 상속된 서브 클래스를
		new SuperClass() {									// 정의하고 메서드를 재정의 해서 그에 따른 객체를 다시 생성해야하는 번거로움 덜고자 이와 같은
			@Override										// 축약된 문법 제공 
			public void output() {							// 형식 : " 슈퍼 클래스명 서브 객체명 new = 슈퍼타입명() {재정의 메서드}
				System.out.println("나는 지역 내부 클래스다.");	// 서브 객체명은 엄밀히 슈퍼타입이 아닌 슈퍼로 부터 파생된 이름 없는 서브 타입이며 끝에 반드시 세미콜론 표시 
			}
		}.output(); // 익명 서브 객체 , 일회성을 위해 사용 
		
		new SuperClass();  // 슈퍼 

	}

}
