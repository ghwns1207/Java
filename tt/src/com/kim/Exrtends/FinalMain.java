package com.kim.Exrtends;

/*
 * final 클래스 : 클래스 상속 금지
 * final 필드 : 상수 필드 설정.
 * final 메서드 : 메서드 재정의 금지 
 * 
 * */

final class SuperClass1 {					//final 클래스 : 클래스에 final 지정을 함으로써 상속이 금지되는
	void out() {							// 단말 클래스로 설정 . 서브 클래스 생성불가 
		System.out.println("final 클래스 ");
	}
}

//class SubClass1 extends SuperClass1{
//	void out() {
//		System.out.println("서브 클래스 ");
//	}
//}

class SuperClass2 {							// fianl 메서드 : 메서드의 final 지정을 함으로써 서브 클래스에 
	final void out() {						// 상속은 되나 재정의 금지 . 슈퍼 클래스의 메서드에 대한 프라이베잇
		System.out.println("final 메서드 ");	// 지정은 서브 클래스에 상속이 되어 재정의가 가능하지만 접근 제한이
	}										// 되는 반면 , final 지정은 마찬가지로 서브 클래스에 상속이 되 어
}											// 접근은 가능하나 재정의 불가 

class SubClass2 extends SuperClass2 {
//	void out() {
//		System.out.println("메서드 재정의 ");
//	}
}

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass2 subClass2 = new SubClass2();
		
		subClass2.out();

	}

}
