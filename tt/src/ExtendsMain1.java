class Car11 { // 슈퍼 클래스
	String name;
	String color;
	boolean gasol;

	Car11(String name, String color, boolean gasol) {
		this.name = name;
		this.color = color;
		this.gasol = gasol;
	}

	void run() {
		if (gasol) {
			System.out.println("뷰릉 부릉");
		} else {
			System.out.println("덜컹 덜컹 ");
		}

	}

	void stop() {
		System.out.println("끼이익");
	}

}

class Truck extends Car11 { 			// 서브클래스 형식 : "class 서브 클래스명 extends 슈퍼클래스명
	int Ton; 							// 서브 클래스 추가 정의한 필드

	Truck(String name, String color, boolean gasol, int Ton) { //슈퍼 생성자를 초기화 시키기 위한 인수도 포함
		super(name, color, gasol);		// 슈퍼클래스의 상속멤버는 직접 초기화가 불가능 super 키워드를 통해 슈퍼의 생성자를 호출
		this.Ton = Ton;					// 초기화를 위임. 생성자간 호출 시의 this 생성자 호출문과 사용 형식이 동일 
	}									// 서브의 필드 초기식 보다 super 호출문이 선 정의 되어야함 . 슈퍼 생성자가 있다면 반드시 슈퍼 
										// 통해 초기화해야하나, 슈퍼에 생성자가 없다면 슈퍼를 호출 안해도 무방하여 이경우 슈퍼의 디폴트 생성자가 자동 호출됨
	
	@Override							// 메서드 재정의 : 서브 객체를 생성하여 재정의한 메서드를 호출하면 슈퍼의 본래 메서드가 가려지고 
	void run() {						// 서브의 오버라이딩 메서드가 호출됨 . 필드도 재정의가 가능은 하니 구분이 모호하고 실용성이 없어 일반적이지는 않음
		System.out.println("우당탕 쿵쾅");	// 서브에서 재정의로 가려진 슈퍼의 메서드를 호출시에는 super.메서드 의 형태로 호출 가능 단 super생성자 호출문에서와 같이 선두에 와야할 강제성 없음
		super.run();
	}

	void convery() {					// 서브 클래스에서 추가 정의한 메서드 
		System.out.println("짐을 실어 나른다.");
	}

}

public class ExtendsMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck poter = new Truck("포터", "흰색", false, 1);		// 서브 객체 생성

		poter.run();				// 서브 객체에 재정의한 메서드 호출 
		poter.convery();			// 서브 객체에 추가 정의한 메서드 호출 

	}

}
