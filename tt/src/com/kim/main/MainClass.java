package com.kim.main;

class Car {
	CarName name;
	String color;

	Car(String model, int year, String color) {
		name = new CarName(model, year); // name변수에 CarName타입 객체 생성
		this.color = color;
	}

	class CarName {								// 이너 클래스는 클래스가 아닌 객체에 소속되며 , 주 클래스 외부에서 이너 클래스 객체를  
		String model;							// 주 객체가 먼저 생성되어야만 주 클래스에 소속된 이너 클래스 타입의 객체 생성 가능 
		int year;

		CarName(String model, int year) {
			this.model = model;
			this.year = year;
		}
		
		void outSubInfo() {
			System.out.println(model+ year);
			System.out.println(name.model+ name.year);			// 주 객체의 접근시 같은 값이 나오지만 서브 객체의 접근시 주 객체의 정보가 나옴
		}
		
		/*	이너 클래스 내부에서의 이너 클래스 필드 참조는 내부 직접 참조와 주 클래스를 통한 간접 참조가 외부 객체 생성시 참조 주체가 
		 * 	주 클래스 객체인지 또는 이너 클래스 객체인지에 따라 달라짐 , 참조 주체가 주 클래스 캨체인 경우, 이너 클래스 객체 자체가 주 클래스 생성자에 
		 * 	종속되어 생성되어지므로 이너 클래스 내부 필드에 대한 직접 참조와 주 클래스에서의 간접 참조는 동일한 대상을 가리킴. 반면 참조 주체가 외부에
		 *  생성된 이너 클래스 객체인 경우 , 주 클래스 객체에 종속되어 생성되고 주 클래스의 모든 맴버를 직접 참조 가능한 특성으로 인해 이너 클래스 생성자에 
		 *  의해 생성된 내부 필드의 직접 참조와 주 클래스를 통한 간접 참조는 대상이 다를 수 밖에없음
		 *  
		 * */	

									 
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car pride = new Car("프라이드" , 2005, "파랑");
		
		Car.CarName pride2 = pride.new CarName("프랑이" , 2009);			// CarName 클래스는 객체에 소속이되므로 이와 같이 변수 선언시 pride 객체의 
		
		pride.name.outSubInfo();			// 주 클래스 객체 내부에 생성된 이너 클래스 타입의 맴버 메서드 호출
		System.out.println();	
		
		pride2.outSubInfo();				// 주 클래스 객체에 의해 외부에 생서오딘 이너 클래스 타입의 객체의 맴버 메서드 호출, 외부에 생성된 이너 클래스 객체는 
											// 별도의 독립적인 객체임에도 불구하고 태생 자체가 생성된 주 객체에 의존적이고 내부적으로 주 객체의 모든 멤버와 동등한 
	}										// 자격이 주어짐에 따라 아무런 제약없이 주 클래스 객체의 멤버에 접근 가능하므로 외부에 생성된 정적 이너 클래스 객체와 달리 
											// 이너 클래스 객체를 통해 간접적으로 주 객체의 맴버까지도 참조가능 , 결론적으로 외부에 생성된 정적 이너 클래스 객체는 주객체와 관련 성이
											// 없어 제한적인 접근만 가능하여 보안 강점이 있는 반면, 외부에 생성된 이너 클래스 객체는 주 클래스 객체와 다른 별도의 독립적인
}											// 객체임에도 주 객체와 인접한 관계를 맺어 주 객체의 모든 멤버를 간접적으로 참조가 가능하지만 보안에 취약점 
