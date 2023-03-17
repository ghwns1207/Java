package com.kim.Exrtends;

class Car11{
	String name;
	String Color;
	boolean gasol;
	
	Car11(String name, String Color,boolean gasol){
		this.name = name;
		this.Color = Color;
		this.gasol = gasol;
		
	}
	
	void run() {
		if(gasol) {
			System.out.println("부릉 부릉 ");
		}else {
			System.out.println("덜컹 덜컹 ");
		}
	}
	
	void stop() {
		System.out.println("끼이익");
	}
}

class Truck11 extends Car11{											
	int Ton;														
	
	Truck11(String name, String Color,boolean gasol, int Ton){
		super(name, Color, gasol);
		this.Ton = Ton;
	}

	
	void run() {						
		System.out.println("우다앙 쿵탕 ");		
	}	
	
	void convey() {													
		System.out.println("짐을 실어 나른다.");
	}
											
}
public class CastingMain {   

	public static void TestCar(Car11 car) {							// 실인수 타입이 가변적인 즉, 실행 시 타입이 결정되는 경우 , 이와 같이
		// 자바는 동적으로 타입을 변경시켜준다  
		car.run();													// 가장 상위 클래스의 형식 인수로 대입을 함으로써 동일한 형태의 메서드를 호출
		car.stop();													// 함에도 대상 객체에 따라 슈퍼 의 메서드 또는 서브의 재정의된 메서드가 호출되어
//		((Truck11)car).convey();	//오 캐스팅 문제 
		// instanceof 연산자
		if(car instanceof Truck11) {								// 대상 객체 instanceof 클래스 : 대상 객체가 해당 클래스 타입이 맞다면 트루 	
			((Truck11) car).convey();								// 아니면 false 리턴. 실행 시에 타입 체크가 가능한 연산자로 기본형에 대한 타입체크
		}	// 오버라이딩한 놈은 캐스팅 필요 								//불가능하난 클래스 뿐만 아니라 배열과 같은 참조형이라면 타입 체크 가능 .또한 대상 객체는 항상 
																	// 타입 체크할 참조형과 상속계층 내에 포함되어야만 가능, 객체 캐스팅 후 서브의 추가 (재정의) 
																	// 변수의 대입 없이 바로 호풀하는 경우 캐스팅 연사산 처리후 메서드 호출 
		System.out.println();										// 다른 형태로 나타남으로써 다형성을 실현 
	}
	
	public static void main(String[] args) {							
		// TODO Auto-generated method stub
		Car11 myCar = new Car11("자동차" , "검정" ,false);				
		Truck11 yourCar = new Truck11("자동차" , "검정" ,false , 1500);		
																	
		TestCar(myCar);										
		TestCar(yourCar);									
																
		
	}																
	
	

}
