package com.kim.Exrtends;

class Car{								// 클래스 맴베 플드나 메서드에 대한 접근 지정자를 private으로 지정한
	private String purposeUse;			// 경우 서브 클래스에 상속은 되나 선언한 클래스 내부 접근 제한이 되므로 
	String name;						// 상속을 받은 서브 클래스 이더라도 직접 접근은 불가 
	String color; 						// 상속은 되나 직접 접근은 불가 겟셋으로 간접 적인 접근 가능 
	boolean gasol;	
	
	public String getPurposeUse() {
		return purposeUse;
	}
	
	public void setPurposeUse(String purposeUse) {
		this.purposeUse = purposeUse;
	}
	
	
}

class Jeep extends Car{
	int ton;
	
	Jeep(String name,String color, boolean gasol, int ton ){
		/*
		 * 슈퍼 클래스에 생성자가 존재하지 않으므로 슈퍼 키워드를 통한 초기화 불필요
		 * 따라서 아래와 같이 상속된 필드에 직접 초기화 
		 * */
		setPurposeUse("군용 트럭 ");
		this.name = name;			// 슈퍼 클래스의 필드에 대한 상속은 받앗지만 private 지정으로 인해 
		this.color = color;			// 직접 접근은 불가함 . 겟셋 메서드를 통해서 접근 
		this.gasol = gasol;
		this.ton = ton;
	}
	
}

public class PrivateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeep name = new Jeep("험비" , "위장색" , false , 2);
		
	}

}
