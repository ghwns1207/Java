package com.kim.main;


/*
 * 다중구현 인터페이스를 통한 객체의 기능 통합 및 선별
 * 
 * 다수의 인터페이스로부터 다중상속을 받아 단일 구현 클래스에서 모든 구현을 함으로써 기능을 통합하고
 * 객체 생성시 각각의 인터페이스 타입 변수로 개별 구현 객체를 가리킴으로서 통합된 기능의 선별 사용가능 
 * 
 * */

interface Func1{
	
	void func1_1();
	void func1_2();
	
}

interface Func2{
	void func2_1();
	void func2_2();
}

class ImpleClass implements Func1 ,Func2{			//클래스에 다중구현 인터페이스 적용 

	@Override
	public void func2_1() {
		// TODO Auto-generated method stub
		System.out.println(" func1_1");
	}

	@Override
	public void func2_2() {
		// TODO Auto-generated method stub
		System.out.println(" func1_2");
	}

	@Override
	public void func1_1() {
		// TODO Auto-generated method stub
		System.out.println(" func2_1");
	}

	@Override
	public void func1_2() {
		// TODO Auto-generated method stub
		System.out.println(" func2_2");
	}
	
}

public class InterfaceMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Func1 t1 = new ImpleClass();			//다중상속을 받은 구현 클래스 타입의 객체를 생성하여 각각의 인터페이스 타비의 변수
		Func2 t2 = new ImpleClass();			//로 받음으로써 인터페이스 타입에 따라 사용 가능한 메서드가 선별. 즉, 다수의 동일타입의 객체를
												// 생성하더라도 어떤 인터페이스 타이븡로 객체를 받는나야 따라 사용 가능한 메서드가 자동선별됨으로써
												// 상황의 변화에 따라 동일 타입 객체에 대한 통합 가능을 선별하여 사용가능 
		t1.func1_1();
		t1.func1_2();
//		t1.func2_2();
		
		t2.func2_1();
		t2.func2_2();
//		t1.func1_1();
	}

}
