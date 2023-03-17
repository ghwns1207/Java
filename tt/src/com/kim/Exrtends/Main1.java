package com.kim.Exrtends;

class Car12{
	String name;
	String Color;
	boolean gasol;
	
	Car12(String name, String Color,boolean gasol){
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

class Truck12 extends Car12{											
	int Ton;														
	
	Truck12(String name, String Color,boolean gasol, int Ton){
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
public class Main1 {   

	public static void main(String[] args) {							
		// TODO Auto-generated method stub	
		Car12 myTruck = new Truck12("자동차" , "검정" ,false , 1500);		
																	
		Truck12 anyTruck;			
//		anyTruck = myTruck;					// 객체 지정 규칙에 의해 서브타입의 변수로 슈퍼타입의 객체를 가리킬 수는 없으며
		anyTruck = (Truck12)myTruck;		// 서브타입의 변수에 슈퍼타입의 변수 대입 또한 불가함이 당연, 하지만 이 경우는 서브 타입의 변수에
											// 슈퍼타입의 변수를 대입은 하고 있으나 실제 슈퍼 타입 변수가 가리키고 있는 대상이 서브 타입의 객체이므로 직접 대입은 불가 
											// 객체 캐스팅을 통한 대입 가능, 여기서 캐스팅은 강제 형 변환이 아닌 변수가 가리키고 있는 실제 객체의 타입을 명시하는 기능 
											// 이를 통해 잘려나간 모듈 추가 정의 멤버 사용가능
		anyTruck.run();			
		anyTruck.stop();
		anyTruck.convey();					// 객체 개스팅으로 실 객체 타입의 명시를 통한 서브 타입 변수에 대입 가능함 온전히 서브 객체를 가르키고 있는 상태 
	}										// 서브에 정의된 모든 메서드를 사용가능, 객체 캐스팅을 통한 실 객체의 명시는 잘려나갔던 추가 모듈을 다시 붙이는 과정						
	
	

}
