package com.kim.main;

public class LocalMain {
//	Car1 avante = new Car1();					// 지역 변수 특성을 갖는 로컬이너 클래스는 main 메서드 블럭 내에 
												// 선언되었으므로 main 블럭 내로 통용 범위가 제한되어 외부에서 호출 불가
	static int firstNum = 0 ;   //필드 전역 변수 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int secoundNum = 1;
//		Car1 avante = new Car1();				// 지역 변수 특성을 갖는 로컬 이너 클래스는 선언이후에나 클래스 타입 상요가능
		
		class Car1{								// 로컬이너 클래스: 선언한 메서드 내에서만 통요되는 지역 변수와 같은 특성을 갖는 클래스로
												// 클래스 선언 후 객체 생성 가능 , 따라서 내부적으로 주 클래스의 모든 멤버를 직접 참조 가능한 반면
												// 메서드 외부에서는 지역 변수 특성을 갖는 로컬이너 클래스에 대한 생성 및 참조 불가 이처럼 로컬 이너
												// 클래스 메서드 내부에서만 상요이 제한 되는 목적으로 활용 , 일반적인 클래스와 마찬가지로 상속및 재정의 가능
			void printCarNum() {				
				System.out.println("차량번호" +firstNum +secoundNum);		//로컬이너 클래스는 메서드 내 지역변수와 동등한 자격이 주어지므로 메서드 블럭 내 
			}															// 지역 변수 뿐만 아니라 주 클래스의 모든 멤버 필드에 직접 접근  간으 	
			
		}
		
		Car1 avante = new Car1();

		avante.printCarNum();					// 로컬이너 클래스 또한 메서드 내부에 선언된 하나의 독립적인 타입이므로 로컬 이너 클래스가 선언된 메서드 내부더라도
	}											// 로컬이너 클래스 밖이면 직접 접근이 불가하여 객체를 생성한 후에 접근 가능 

}
