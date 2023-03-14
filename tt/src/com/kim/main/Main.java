package com.kim.main;

import com.kim.sub1.Sub1;

//해당 클래스 패키지만 

class Sub2{
	private void test() {       // 클래스 내부에서만 접근 가능 
		System.out.println("Sub2");
	}
}

public class Main {

	public static void main(String[] args) {
	
		
		Sub1 sub1 = new Sub1();
		Sub2 sub2 = new Sub2();
		
//		sub2.test();	//클래스 내부에서만 사용가능 	
//		sub1.test();	// 디폴트는 같은 패키지 내부에서만 , 컴파일 에러 
	}

}
