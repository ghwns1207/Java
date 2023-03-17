package com.kim.Exrtends;

class Car1{
	String name;
	String Color;
	boolean gasol;
	
	Car1(String name, String Color,boolean gasol){
		this.name = name;
		this.Color = Color;
		this.gasol = gasol;
		
	}
	
	private void run() {
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

class Truck extends Car1{
	int Ton;
	Truck(String name, String Color,boolean gasol, int Ton){
		super(name, Color, gasol);
		this.Ton = Ton;
	}

	
	public void run() {						// 오버라이딩 시 엑서스 지정자의 접근 범위는 이와 같이 상속을 통한 재정의로 확장은 가능하나 
		System.out.println("우다앙 쿵탕 ");		// 반대로 축소는 불가 . 여기서 확장의 범위는 초과가 아닌 이상의 의미. 따라서 슈퍼에서 
	}										// private 지정을 한 메서드의 경우 상속받은 서브에서 조차 접근이 불가능 하나 엑서스 지정자의
											// 확대를 통한 재정의 가능. 결과적으로 퍼블릭 지정을 통한 메서드의 재정의로 슈퍼의 내용은 외부로 부터 접근이 차단이 되는 
//	private void stop() {					// 반면 서브에서 재정의한 내용만 외부의 접근을 허용하게됨 
//		System.out.println("끼이익");
//	}
}

public class PrivateMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 name = new Car1("자동차" , "검정" ,false);
		
//		name.run();		//private 지정자로 인한 run메서드 접근 불가 
		
		Truck name1 = new Truck("포터" , "흰색" ,false , 1);
		name1.run(); // 서브에서 엑서스 지정자 확장을 통해 재저의한 내용은 접근 가능 
	}

}
